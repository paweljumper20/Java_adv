package taskmanager.controller;

import java.io.FileNotFoundException;
import java.io.IOException;

public interface FileManager {
    final String FILE_PATH = "C:\\Users\\LEGION\\Desktop\\projects\\java_adv\\src\\main\\java\\taskmanager\\resource\\tasks.csv";
    // metoda zapisująca dane o taaskach i użytkownikach do pliku
    void saveTasksToFile() throws IOException;
    void getDataFromFile() throws FileNotFoundException;
}
