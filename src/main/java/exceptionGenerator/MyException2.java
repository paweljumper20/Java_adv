package exceptionGenerator;

import java.time.LocalDateTime;


public class MyException2 extends Exception implements MyException {


        public MyException2(){
            System.out.println("Jest to błąd numer2");
        }
        public String getMessage(){
            LocalDateTime dateNow = LocalDateTime.now();
            return "Czas wystąpienia wyjątku: " + dateNow;
        }

//        public void printStackTrace(){
//            System.out.println(getClass().getName());
//
//        }
    }

