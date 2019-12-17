package exceptionGenerator;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Random;

public class Main {

    FileWriter fw;

    public void getFile() {
        try {
            fw = new FileWriter(
                    new File("C:\\Users\\PROXIMO\\Desktop\\TARR1\\java_advanced\\src\\main\\java\\exceptionGenerator\\exceptions\\out\\exception_logs.csv"),
                    true);
        } catch (IOException e) {
            System.out.println("Plik nie istnieje!");
        }
    }

    public void randomExceptionGenerator() {
        Random random = new Random();
        Exception ex = null;
        int randomInteger = random.nextInt(3); // losuje wartości 0 lub 1 lub 2
        try {
            switch (randomInteger) {
                case 0:
                    throw new MyException1();
                case 1:
                    throw new MyException2();
                case 2:
                    throw new MyException3();
            }
        } catch (MyException1 e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
            ex = new MyException1();
        } catch (MyException2 e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
            ex = new MyException2();
        } catch (MyException3 e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
            ex = new MyException3();
        }
        try {
            fw.append(LocalDateTime.now() + ";" + ex.getClass().getName() + ex.getMessage() + "\n");
            fw.close();
        } catch (IOException e) {
            System.out.println("Plik nie istnieje");
        }
    }
    public static void main(String[] args) {
        Main main = new Main();
        main.getFile();
        main.randomExceptionGenerator();
        // Napisz program który generuje losowo jeden z 3 własnych typów wyjątków:
        // -> MyException1()
        // -> MyException2()
        // -> MyException3()
        // Każdy z wyjątków posiada konstruktor zwracający typ danego wyjątku
        // Każdy z wyjątków posiada własną metodę getMessage() i printStackTrace()
        // getMessage() -> zwraca datę i czas wystąpienia wyjątku
        // printStackTarace() -> zawraca Klasę w której wystąpił dany wyjątek

        // Dopisuj każdorazowo do pliku CSV wystąpienia poszczególnych wyjątków
        // przy każdym uruchomieniu programu
        // DATA; ExceptionClass; StackTrace

    }
}