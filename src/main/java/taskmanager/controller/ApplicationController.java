package taskmanager.controller;

import taskmanager.model.Task;
import taskmanager.model.User;

import java.io.*;
import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class ApplicationController implements UserManager, TaskManager, FileManager {
    @Override
    public Task addTask(String taskName, LocalDate deadline, User user) {
        Task task = new Task(taskName, LocalDate.now(), false, user);
        List<Task> tasks = user.getTasks();
        tasks.add(task);
        user.setTasks(tasks);
        return task;
    }

    @Override
    public void setTaskStatus(boolean status, int userIndex, int taskIndex) {
        // znajdz uzytkownnika po jego indeksie
        // znajdz zadanie po indeksie zadania w liscie uzytkownika
        // zaktualizuj status
        User user = UserManager.users.get(userIndex);
        List<Task> userTasks = user.getTasks();
        Task task = userTasks.get(taskIndex);
        task.setStatus(status);

    }

    @Override
    public void countAllTasks(int userIndex) {
        System.out.println("All tasks: " + UserManager.users.get(userIndex).getTasks().size());
    }

    @Override
    public void countClosedTasks(int userIndex) {
        int closedCounter = 0;
        for (Task t : UserManager.users.get(userIndex).getTasks()) {
            if (t.isStatus()) {
                closedCounter++;
            }
        }
        System.out.println("Closed tasks: " + closedCounter);
    }


    @Override
    public void countOpenTasks(int userIndex) {
        int openedCounter = 0;
        for (Task t : UserManager.users.get(userIndex).getTasks()) {
            if (!t.isStatus()) {
                openedCounter++;
            }
        }
        System.out.println("Open tasks: " + openedCounter);
    }


    @Override
    public void countuAfterDeadlineTasks(int userIndex) {
        int afterDeadlineCounter = 0;
        for (Task t : UserManager.users.get(userIndex).getTasks()) {
            if (t.getDeadline().isBefore(LocalDate.now())) {
                afterDeadlineCounter++;
            }
        }
        System.out.println("Open tasks: " + afterDeadlineCounter);
    }


    @Override
    public void addUser(String name, String lastName) {
        User user = new User(name, lastName);
        UserManager.users.add(user);

    }

    @Override
    public List<User> getAllUsers() {
        return UserManager.users;
    }

    @Override
    public User getUserByIndex(int index) {
        return UserManager.users.get(index);
    }

    public void printAllUsers() {
        UserManager.users.forEach(System.out::println);
    }


    @Override
    public void saveTasksToFile() throws IOException {
        FileWriter pw = new FileWriter(FileManager.FILE_PATH);
        for (User u:UserManager.users) {
            for (Task t:u.getTasks()) {
                pw.append(t.getTaskName() + ";" + t.getDeadline() + ";" + t.isStatus() + ";" + u.getName() + ";" + u.getLastName() + "\n");
            }
        }pw.close();
    }

    @Override
    public void getDataFromFile() throws FileNotFoundException {
        Scanner s = new Scanner(new File(FileManager.FILE_PATH));
        while(s.hasNext()){
            String line []= s.nextLine().split(";");
            System.out.println("Task: " + line[0]);
            System.out.println("Deadline: " + line[1]);
            System.out.println("Status: " + line[2]);
            System.out.println("User: " + line[3] + " " + line[4]);
            s.nextLine();
        }
    }
}
