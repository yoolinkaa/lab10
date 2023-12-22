package ua.edu.ucu.apps.task2;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDate;

@Getter
@AllArgsConstructor
public class TwitterUser {
    private String userMail;
    private Country country;
    private LocalDate lastActiveTime;
}