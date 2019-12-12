package Interfaces;

public class DatabaseConnectorImpl implements DatabaseConnector {

    private boolean isDriverInstalled = true;


    @Override
    public boolean databaseDriverCheck() {
        return isDriverInstalled;
    }

    @Override
    public void setConnection(String username, String password, String databaseName) {
        System.out.println("Connected");
        // odwołanie do składowej finalnej interfejsu
        // odwołanie do składowej statycznej
        System.out.println(DatabaseConnector.HOST + ":" + DatabaseConnector.PORT + "/" + databaseName);
        System.out.println("Username: " + username);
        System.out.println("Password: " + password);
    }

    @Override
    public void setAutoCommit(boolean autoCommit) {
        if(autoCommit == true){
            System.out.println("Transakcje");
        } else {
            System.out.println("Brak transakcji");
        }
    }

    @Override
    public void closeConnection() {
        System.out.println("Connection is closed");
    }
    public void executeQuery(String SQL){
        System.out.println("Query: " + SQL + " is executed");
    }



}
