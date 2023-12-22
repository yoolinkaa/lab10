package ua.edu.ucu.apps.task3;

public class Authorization extends Авторизація {
    public boolean authorize(БазаДаних db) {
        return авторизуватися(db);
    }
}