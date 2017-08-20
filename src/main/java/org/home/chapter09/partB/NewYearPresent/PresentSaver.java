package org.home.chapter09.partB.NewYearPresent;

import java.io.*;

public class PresentSaver {

    public void save(SweetPresent present, String path) {
        try (FileOutputStream fos = new FileOutputStream(new File(path));
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(present);
            System.out.println("Saved OK! :)");
        } catch (FileNotFoundException e) {
            System.err.println("Can't findFile/make file! " + e);
        } catch (NotSerializableException e) {
            System.err.println("Can't serialize! " + e);
        } catch (IOException e) {
            System.err.println("ERROR: " + e);
        }
    }
    
    public SweetPresent load(String path) throws InvalidObjectException{
        try (FileInputStream fis = new FileInputStream(new File(path));
             ObjectInputStream ois = new ObjectInputStream(fis)) {
            System.out.println("Loaded well! :)");
            return (SweetPresent) ois.readObject();
        } catch (ClassNotFoundException e) {
            System.err.println("Class not exist! " + e);
        } catch (FileNotFoundException e) {
            System.err.println("Can't findFile file! " + e);
        } catch (InvalidClassException e) {
            System.err.println("Wrong version of class! " + e);
        } catch (IOException e) {
            System.err.println("ERROR: " + e);
        }
        throw new InvalidObjectException("Loading failed :(");
    }
}
