package Interfaces;

public interface TransactionManager {
    // metoda zarządzająca transakcjami
    // jeżeli autoCommit == true to transakcje aktywne
    // jeżely
    void setAutoCommit(boolean autoCommit);
}
