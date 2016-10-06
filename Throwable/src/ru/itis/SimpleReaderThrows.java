package ru.itis;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by admin on 06.10.2016.
 */
public class SimpleReaderThrows {
    // считываем один символ из файла
    public  int readFromFile(String fileName) throws FileNotFoundException, IOException {
        FileReader reader = new FileReader(fileName);
        return reader.read();

    }
}
