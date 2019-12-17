package exceptionGenerator;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class MyException1 extends Exception implements MyException {


    public MyException1(){
        System.out.println("Jest to błąd numer1");
    }
    public String getMessage(){
        LocalDateTime dateNow = LocalDateTime.now();
        return "Czas wystąpienia wyjątku: " + dateNow;
    }

//    public void printStackTrace(){
//        System.out.println(getClass().getName());
//
//    }
}
