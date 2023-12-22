package ua.edu.ucu.apps.task3;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class ReportBuilder {
    private Database database;

    public Report buildReport() {
        String userData = database.getUserData();
        String statistics = database.getStatistics();

        return new Report(statistics, userData);
    }
}