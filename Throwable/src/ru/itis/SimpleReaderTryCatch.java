package ru.itis;


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class SimpleReaderTryCatch {
    // считываем один символ из файла
    public  int readFromFile(String fileName) {

        try {
            // Unhandled exception: java.io.FileNotFoundException
            FileReader reader = new FileReader(fileName);
            // Unhandled exception: java.io.IOException
            return reader.read();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("Some error with IO");
        }
        return -1;
    }
}
