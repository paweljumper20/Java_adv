package taskmanager;

import taskmanager.controller.ApplicationController;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) throws IOException {
        ApplicationController ac = new ApplicationController();
        ac.addUser("Michał","Kruczkowski");
        ac.addTask("Nauka programowania",LocalDate.of(2020, 2, 1),ac.getUserByIndex(2));
        ac.addTask("Nauka Javy", LocalDate.of(2020, 2, 1),ac.getUserByIndex(2));
        ac.addTask("Nauka gita",LocalDate.of(2019, 2,23),ac.getUserByIndex(2));
        ac.setTaskStatus(true,2,0);
        ac.countAllTasks(2);
        ac.countClosedTasks(2);
        ac.countOpenTasks(2);
        ac.countuAfterDeadlineTasks(2);
        ac.printAllUsers();
        ac.saveTasksToFile();
        ac.getDataFromFile();


    }
}
