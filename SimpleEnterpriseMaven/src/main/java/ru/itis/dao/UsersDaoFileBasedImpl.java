package ru.itis.dao;

import com.google.common.base.Splitter;
import ru.itis.models.User;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class UsersDaoFileBasedImpl implements UsersDao {

    private BufferedReader fileReader;

    public UsersDaoFileBasedImpl(String fileName) {
        try {
            fileReader = new BufferedReader(new FileReader(fileName));
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
    }

    @Override
    public List<User> getAll() {
        List<User> result = new ArrayList<>();
        try {
            String currentLine = fileReader.readLine();
            while (currentLine != null) {
                User currentUser = parseStringAsUser(currentLine);
                result.add(currentUser);
                currentLine = fileReader.readLine();
            }
        } catch (IOException e) {
            System.out.println("SomeError");
        }
        return result;
    }

    private User parseStringAsUser(String line) {
        Splitter splitter = Splitter.on(" ");

        List<String> lines = splitter.splitToList(line);

        String name = lines.get(0);
        String password = lines.get(1);
        int age = Integer.parseInt(lines.get(2));

        return new User(name, password, age);
    }
}
