package fileio;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileService {

    public void readFile(String path) throws FileNotFoundException {
        File file = new File(path);

        Scanner s = new Scanner(file);
        while (s.hasNext())
            System.out.println(s.nextLine());
    }

    public static void main(String[] args) throws FileNotFoundException {
        FileService fs = new FileService();
        fs.readFile("C:\\Users\\LEGION\\Desktop\\projects\\java_adv\\src\\main\\java\\fileio\\text.txt");
        fs.readCsvFile("C:\\Users\\LEGION\\Desktop\\projects\\java_adv\\src\\main\\java\\fileio\\data.csv");
    }

    public void readCsvFile(String path) throws FileNotFoundException {
        File file = new File(path);
        Scanner s = new Scanner(file);
        int i = 0;

        while (s.hasNext()) {

            String line = s.nextLine();
            i++;
            if (i == 1) {
                continue;
            }
            String elements[] = line.split(";");
            System.out.println("ID: " + elements[0]);
            System.out.println("NAME: " + elements[1]);
            System.out.println("LASTNAME: " + elements[2]);
            System.out.println("==========================");
        }
    }

}
