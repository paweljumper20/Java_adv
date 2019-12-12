package fileio;

import java.io.*;
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
        fs.insertDataIntoFile("C:\\Users\\LEGION\\Desktop\\projects\\java_adv\\src\\main\\java\\fileio\\fromFileer.txt",
                "Ala ma kota");
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
        s.close();
    }

    public void insertDataIntoFile(String path,String data) throws FileNotFoundException {
        PrintWriter pw = new PrintWriter(new File(path));
        pw.println("NAGŁÓWEK");
        pw.println(data);
        pw.close();
    }

    public void appendDataIntoFile(String path,String data) throws IOException {
        FileWriter fw = new FileWriter(new File(path),true);
        fw.append(data);
        fw.close();
    }


}
