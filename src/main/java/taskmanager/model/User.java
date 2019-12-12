package taskmanager.model;


import lombok.Data;

import java.util.LinkedList;
import java.util.List;
@Data
public class User {
    private String name;
    private String lastName;
    // kazdy użytkownik ma swoją listę zadań
    private List<Task> tasks = new LinkedList<>();

    public User(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }
}
