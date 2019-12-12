package taskmanager.controller;

import taskmanager.model.Task;
import taskmanager.model.User;

import java.time.LocalDate;

public interface TaskManager {
    // Metody abstrakcyjne
    // metoda do utworzenia taska

    Task addTask(String taskName, LocalDate deadline, User user);
    // metoda do zmiany statusu taska
    void setTaskStatus(boolean status,int userIndex,int taskIndex);
    // metody do statystyk wykonania zadań

    void countAllTasks(int userIndex);
    void countClosedTasks(int userIndex);
    void countOpenTasks(int userIndex);
    void countuAfterDeadlineTasks(int userIndex);


}
