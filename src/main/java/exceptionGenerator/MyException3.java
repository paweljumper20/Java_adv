package exceptionGenerator;

import java.time.LocalDateTime;

public class MyException3 extends Exception implements MyException {


    public MyException3(){
        System.out.println("Jest to błąd numer3");
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
