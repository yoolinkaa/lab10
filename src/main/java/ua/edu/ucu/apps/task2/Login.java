package ua.edu.ucu.apps.task2;

import java.time.LocalDate;

public class Login {
    public Client login(String loginMethod) {
        if (loginMethod.equals("twitter")) {
            return new TwitterClient(new TwitterUser(
                    "taras.yaroshko@ucu.edu.ua",
                    Country.UKRAINE,
                    LocalDate.of(2022, 1, 1)
            ));
        }

        if (loginMethod.equals("facebook")) {
            return new FacebookClient(new FacebookUser(
                    "taras.yaroshko@ucu.edu.ua",
                    Country.UKRAINE,
                    LocalDate.of(2021, 1, 1)
            ));
        }
        throw new IllegalArgumentException("Incorrect login method");
    }
}