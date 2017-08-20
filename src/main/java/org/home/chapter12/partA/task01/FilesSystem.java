package org.home.chapter12.partA.task01;

import java.sql.Connection;
import java.sql.SQLException;

public class FilesSystem {
    
    public static void main(String[] args) throws SQLException {
        Connection c = ConnectionPool.getConnection();
        
        OperationHandler handler = new OperationHandler(c);
        handler.searchFile("log.txt");
//        handler.searchFolder("New Folder");
        handler.searchFolder("2016 - The Stage");
//        handler.searchFileByPattern("%.txt");
        System.out.println();
        handler.searchFileByPattern("%.flac");
//        String path = "D/Music/Avenged Sevenfold/2016 - The Stage";
//        String path1 = "D/Music/Avenged Sevenfold";
//        System.out.println("Amount of inner folders & files in directory " + path + " : " + handler.calcAmount(path));
//        System.out.println("Amount of inner folders & files in directory " + path1 + " : " + handler.calcAmount(path1));
//        System.out.println(handler.calcAmount("D"));
//
//        System.out.println("Size of album Avenged Sevenfold - The Stage is " + handler.calcSize(path) + " kb.");
//        System.out.println(handler.calcSize("D"));


//        INSERT INTO `task01`.`folder` (`folderPath`, `folderName`, `folderParentFolder`) VALUES ('D/test_folder', 'test_folder', 'D');
//        INSERT INTO `task01`.`folder` (`folderPath`, `folderName`, `folderParentFolder`) VALUES ('D/test_folder/inner_folder', 'inner_folder', 'D/test_folder');
//        INSERT INTO `task01`.`file` (`filePath`, `fileName`, `fileParentFolder`, `fileSize`) VALUES ('D/test_folder/TestMain.txt', 'TestMain.txt', 'D/test_folder', '1');
//        INSERT INTO `task01`.`file` (`filePath`, `fileName`, `fileParentFolder`, `fileSize`) VALUES ('D/test_folder/inner_folder/TestMain.txt', 'TestMain.txt', 'D/test_folder/inner_folder', '1');
//        handler.searchFolder("inner_folder");
//        handler.searchFile("TestMain.txt");
//        handler.delete("D/test_folder");
//        handler.searchFolder("inner_folder");
//        handler.searchFile("TestMain.txt");
        ConnectionPool.returnConnection(c);
    }
}
