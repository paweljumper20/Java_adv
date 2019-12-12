package taskmanager.controller;

import taskmanager.model.User;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public interface UserManager {
    // lista agregująca użytkowników
    List<User> users = new LinkedList<>(Arrays.asList(
            new User("Jan","Kowalski"),
            new User("Adam","Nowak")
    ));
    // metoda do dodawania uytkowników
    void addUser(String name,String lastName);
    // metoda do pobierania aktualnej listy użytkowników
    List<User> getAllUsers();
    // metooda wyszukująca użytkownika po indeksie
    User getUserByIndex(int index);
}
