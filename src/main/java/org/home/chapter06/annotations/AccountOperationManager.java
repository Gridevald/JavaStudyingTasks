package org.home.chapter06.annotations;

public interface AccountOperationManager {
    
    double depositInCash(int accountNumber, double amount);
    
    boolean withdraw(int accountNumber, double amount);
    
    boolean convert(double amount);
    
    boolean transfer(int accountNumber, double amount);
}
