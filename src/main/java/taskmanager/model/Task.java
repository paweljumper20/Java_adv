package taskmanager.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;

@Data
@AllArgsConstructor
public class Task {
    private String taskName;
    private LocalDate deadline;
    private boolean status;
    // do kazdego zadania przypisany jest konkretny obiekt użytkownika
    private User user;

    @Override
    public String toString() {
        return "Task{" +
                "taskName='" + taskName + '\'' +
                ", deadline=" + deadline +
                ", status=" + status +
                '}';
    }
}
