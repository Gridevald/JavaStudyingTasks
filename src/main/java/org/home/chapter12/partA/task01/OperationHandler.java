package org.home.chapter12.partA.task01;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class OperationHandler {
    
    private int calcAmount;
    
    private int sumSize;
    
    private Connection connection;
    
    public OperationHandler(Connection connection) {
        this.connection = connection;
    }
    
    /**
     * Prints full path of file if it exists.
     */
    public void searchFile(String name) {
        PreparedStatement ps = null;
        ResultSet result = null;
        try {
            if (findFile(name)) {
                String sqlCommand = "select * from file where fileName = ?";
                ps = getStatement(sqlCommand);
                result = null;
                if (ps != null) {
                    ps.setString(1, name);
                    result = ps.executeQuery();
                }
                
                if (result != null) {
                    while (result.next()) {
                        System.out.println(result.getString("filePath"));
                    }
                }
            }
        } catch (SQLException e) {
            System.err.println("ERROR: " + e);
        } finally {
            closeResultSet(result);
            closeStatement(ps);
        }
    }
    
    
    /**
     * Prints full path of folder if it exists.
     */
    public void searchFolder(String name) {
        PreparedStatement ps = null;
        ResultSet result = null;
        try {
            if (findFolder(name)) {
                String sqlCommand = "select * from folder where folderName = ?";
                ps = getStatement(sqlCommand);
                result = null;
                if (ps != null) {
                    ps.setString(1, name);
                    result = ps.executeQuery();
                }
                
                if (result != null) {
                    while (result.next()) {
                        System.out.println(result.getString("folderPath"));
                    }
                }
            }
        } catch (SQLException e) {
            System.err.println("ERROR: " + e);
        } finally {
            closeResultSet(result);
            closeStatement(ps);
        }
    }
    
    /**
     * Finds all files according to pattern
     * got by parameter.
     */
    public void searchFileByPattern(String pattern) {
        String sqlCommand = "select filePath from file where fileName like ?";
        PreparedStatement ps = getStatement(sqlCommand);
        ResultSet result = null;
        try {
            if (ps != null) {
                ps.setString(1, pattern);
                result = ps.executeQuery();
            }
            
            if (result != null) {
                if (result.isBeforeFirst()) {
                    while (result.next()) {
                        System.out.println(result.getString("filePath"));
                    }
                } else {
                    System.out.println("There is no files with pattern: " + pattern);
                }
            }
        } catch (SQLException e) {
            System.err.println("ERROR: " + e);
        } finally {
            closeResultSet(result);
            closeStatement(ps);
        }
    }
    
    /**
     * Finds file with name got by parameter.
     * Returns true if found and false otherwise.
     */
    private boolean findFile(String name) throws SQLException {
        String sqlCommand = "select * from file where fileName = ?";
        PreparedStatement ps = getStatement(sqlCommand);
        ResultSet result = null;
        
        if (ps != null) {
            ps.setString(1, name);
            result = ps.executeQuery();
        }
        
        if (result != null) {
            if (result.isBeforeFirst()) {
                closeResultSet(result);
                closeStatement(ps);
                return true;
            } else {
                closeResultSet(result);
                closeStatement(ps);
                return false;
            }
        }
        throw new SQLException("ERROR finding file.");
    }
    
    /**
     * Finds folder with name got by parameter.
     * Returns true if found and false otherwise.
     */
    private boolean findFolder(String name) throws SQLException {
        String sqlCommand = "select * from folder where folderName = ?";
        PreparedStatement ps = getStatement(sqlCommand);
        ResultSet result = null;
        
        if (ps != null) {
            ps.setString(1, name);
            result = ps.executeQuery();
        }
        
        if (result != null) {
            if (result.isBeforeFirst()) {
                closeResultSet(result);
                closeStatement(ps);
                return true;
            } else {
                closeResultSet(result);
                closeStatement(ps);
                return false;
            }
        }
        throw new SQLException("ERROR finding folder.");
    }
    
    private boolean findFullFolder(String path) throws SQLException {
        String sqlCommand = "select * from folder where folderPath = ?";
        PreparedStatement ps = getStatement(sqlCommand);
        ResultSet result = null;
        
        if (ps != null) {
            ps.setString(1, path);
            result = ps.executeQuery();
        }
        
        if (result != null) {
            if (result.isBeforeFirst()) {
                closeResultSet(result);
                closeStatement(ps);
                return true;
            } else {
                closeResultSet(result);
                closeStatement(ps);
                return false;
            }
        }
        throw new SQLException("ERROR finding folder.");
    }
    
    /**
     * Calculates number of folders & files in
     * determined folder.
     */
    public int calcAmount(String path) throws SQLException {
        calcAmount = 0;
        try {
            if (findFullFolder(path)) {
                doCalcAmount(path);
                return calcAmount;
            }
        } catch (SQLException e) {
            System.err.println("ERROR finding folder: " + e);
        }
        throw new SQLException(path + " - doesn't exist");
    }
    
    private void doCalcAmount(String path) {
        String sqlFolder = "select * from folder where folderParentFolder = ?";
        PreparedStatement psFolder = getStatement(sqlFolder);
        ResultSet rsFolder = null;
        try {
            if (psFolder != null) {
                psFolder.setString(1, path);
                rsFolder = psFolder.executeQuery();
            }
            if (rsFolder != null) {
                if (rsFolder.isBeforeFirst()) {
                    while (rsFolder.next()) {
                        calcAmount++;
                        doCalcAmount(rsFolder.getString("folderPath"));
                    }
                }
            }
        } catch (SQLException e) {
            System.err.println("ERROR: " + e);
        } finally {
            closeResultSet(rsFolder);
            closeStatement(psFolder);
        }
        
        String sqlFile = "select * from file where fileParentFolder = ?";
        PreparedStatement psFile = getStatement(sqlFile);
        ResultSet rsFile = null;
        try {
            if (psFile != null) {
                psFile.setString(1, path);
                rsFile = psFile.executeQuery();
            }
            if (rsFile != null) {
                while (rsFile.next()) {
                    calcAmount++;
                }
            }
        } catch (SQLException e) {
            System.err.println("ERROR: " + e);
        } finally {
            closeResultSet(rsFile);
            closeStatement(psFile);
        }
    }
    
    /**
     * Calculates size of determined folder
     */
    public int calcSize(String path) throws SQLException {
        sumSize = 0;
        try {
            if (findFullFolder(path)) {
                doCalcSize(path);
                return sumSize;
            }
        } catch (SQLException e) {
            System.err.println("ERROR finding folder: " + e);
        }
        throw new SQLException(path + " - doesn't exist");
    }
    
    private void doCalcSize(String path) {
        String sqlFolder = "select * from folder where folderParentFolder = ?";
        PreparedStatement psFolder = getStatement(sqlFolder);
        ResultSet rsFolder = null;
        try {
            if (psFolder != null) {
                psFolder.setString(1, path);
                rsFolder = psFolder.executeQuery();
            }
            if (rsFolder != null) {
                if (rsFolder.isBeforeFirst()) {
                    while (rsFolder.next()) {
                        doCalcSize(rsFolder.getString("folderPath"));
                    }
                }
            }
        } catch (SQLException e) {
            System.err.println("ERROR: " + e);
        } finally {
            closeResultSet(rsFolder);
            closeStatement(psFolder);
        }
        
        String sqlFile = "select * from file where fileParentFolder = ?";
        PreparedStatement psFile = getStatement(sqlFile);
        ResultSet rsFile = null;
        try {
            if (psFile != null) {
                psFile.setString(1, path);
                rsFile = psFile.executeQuery();
            }
            if (rsFile != null) {
                while (rsFile.next()) {
                    sumSize += rsFile.getInt("fileSize");
                }
            }
        } catch (SQLException e) {
            System.err.println("ERROR: " + e);
        } finally {
            closeResultSet(rsFile);
            closeStatement(psFile);
        }
    }
    
    /**
     * Deletes folder and all inner folders & files
     */
    public void delete(String path) {
        try {
            if (findFullFolder(path)) {
                doDelete(path);
            } else {
                System.err.println("Folder doesn't exist!");
            }
        } catch (SQLException e) {
            System.err.println("ERROR finding folder: " + e);
        }
    }
    
    private void doDelete(String path) {
        String sqlFolder = "select * from folder where folderParentFolder = ?";
        PreparedStatement psFolder = getStatement(sqlFolder);
        ResultSet rsFolder = null;
        try {
            if (psFolder != null) {
                psFolder.setString(1, path);
                rsFolder = psFolder.executeQuery();
            }
            if (rsFolder != null) {
                if (rsFolder.isBeforeFirst()) {
                    while (rsFolder.next()) {
                        doDelete(rsFolder.getString("folderPath"));
                    }
                }
            }
        } catch (SQLException e) {
            System.err.println("ERROR: " + e);
        } finally {
            closeResultSet(rsFolder);
            closeStatement(psFolder);
        }
        
        String sqlDeleteFiles = "delete from file where fileParentFolder = ?";
        PreparedStatement psDeleteFile = getStatement(sqlDeleteFiles);
        try {
            if (psDeleteFile != null) {
                psDeleteFile.setString(1, path);
                psDeleteFile.execute();
            }
        } catch (SQLException e) {
            System.err.println("ERROR: " + e);
        } finally {
            closeStatement(psDeleteFile);
        }
        
        String sqlDeleteFolder = "delete from folder where folderPath = ?";
        PreparedStatement psDeleteFolder = getStatement(sqlDeleteFolder);
        try {
            if (psDeleteFolder != null) {
                psDeleteFolder.setString(1, path);
                psDeleteFolder.execute();
            }
        } catch (SQLException e) {
            System.err.println("ERROR: " + e);
        } finally {
            closeStatement(psDeleteFolder);
        }
    }
    
    /**
     * Supporting methods
     */
    private PreparedStatement getStatement(String sqlCommand) {
        PreparedStatement ps = null;
        try {
            ps = connection.prepareStatement(sqlCommand);
        } catch (SQLException e) {
            System.err.println("ERROR: " + e);
        }
        return ps;
    }
    
    private void closeStatement(PreparedStatement statement) {
        try {
            statement.close();
        } catch (SQLException e) {
            System.err.println("ERROR: " + e);
        }
    }
    
    private void closeResultSet(ResultSet result) {
        try {
            result.close();
        } catch (SQLException e) {
            System.err.println("ERROR: " + e);
        }
    }
}
