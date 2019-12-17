package Reception;

public class ReservationException extends Exception {   // jeżeli wyjątek rozszerza klasę exception
                                                        // będzie możliwy do zgłoszenia w klauzuli throw
                                                        // będziemy mogli go obsłużyć w try catch


    public ReservationException(){
        System.out.println("W naszym hotelu nie można przypisac gości do pokoju nr 13");
    }
    public String getMessage(){
        return "Podałeś pokój nr 13, jest to numer zabroniony";
    }
}
