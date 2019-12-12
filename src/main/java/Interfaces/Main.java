package Interfaces;

public class Main {
    public static void main(String[] args) {
     DatabaseConnectorImpl db = new DatabaseConnectorImpl();
        System.out.println("Sprawdzenie sterownika: ");
        System.out.println(db.databaseDriverCheck());
        if(db.databaseDriverCheck() == true){
            db.setConnection("pawel",
                            "123","java_app");
            db.executeQuery("Select * from users");
            db.closeConnection();
        } else System.out.println("Not connected: bad credentials");


    }
}
