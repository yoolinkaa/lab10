package ua.edu.ucu.apps.task1;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        User user = new User("Taras", "taras.yaroshko@ucu.edu.ua", 18);
        user.save();
    }
}