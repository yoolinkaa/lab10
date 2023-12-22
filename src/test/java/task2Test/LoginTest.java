package task2Test;

import ua.edu.ucu.apps.task2.Client;
import ua.edu.ucu.apps.task2.Login;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoginTest {
    @Test
    public void testLoginFacebook() {
        Login login = new Login();
        Client user = login.login("facebook");

        assertEquals(user.getEmail(), "taras.yaroshko@ucu.edu.ua");
        assertEquals(user.getCountry(), "UKRAINE");
        assertEquals(user.getLastActiveTime(), LocalDate.of(2021, 1, 1));
    }

    @Test
    public void testLoginTwitter() {
        Login login = new Login();
        Client user = login.login("twitter");

        assertEquals(user.getEmail(), "taras.yaroshko@ucu.edu.ua");
        assertEquals(user.getCountry(), "UKRAINE");
        assertEquals(user.getLastActiveTime(), LocalDate.of(2022, 1, 1));
    }

    @Test
    public void testLoginException() {
        Login login = new Login();
        try {
            login.login("google");
        } catch (IllegalArgumentException e) {
            assertEquals(e.getMessage(), "Incorrect login method");
        }
    }

}