package Interfaces;

public interface DatabaseConnector extends TransactionManager {
   // pole finalne
   public final String PORT = "3306";
   // pole statyczne
    public static final String HOST = "localhost";

   boolean databaseDriverCheck();
   void setConnection(String username,String password,String databaseName);
   void closeConnection();

}
