package Reception;

import java.util.InputMismatchException;

public class Reception {
    public void bookRoom(int roomNumber) {
        try {
            if (roomNumber == 13) {
                throw new ReservationException();
            }
            System.out.println("Przypisano gości do pokoju o numerze " + roomNumber);
        }catch (InputMismatchException |ReservationException e) {
            System.out.println("W naszym hotelu nie można przypisać gości do pokoju numer 13!");
        }
    }

    public static void main(String[] args) {
        Reception rp = new Reception();

        rp.bookRoom(18);
    }
}
