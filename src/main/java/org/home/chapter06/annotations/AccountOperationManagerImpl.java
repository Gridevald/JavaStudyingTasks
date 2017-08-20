package org.home.chapter06.annotations;

public class AccountOperationManagerImpl implements AccountOperationManager{
    
    @BankingAnnotation(securityLevel = SecurityLevelEnum.HIGH)
    public double depositInCash(int accountNumber, double amount) {
        //move some money on account
        return 0; //stub
    }
    
    @BankingAnnotation(securityLevel = SecurityLevelEnum.HIGH)
    public boolean withdraw(int accountNumber, double amount) {
        //move acceptable amount of money from account
        return true; //stub
    }
    
    @BankingAnnotation(securityLevel = SecurityLevelEnum.LOW)
    public boolean convert(double amount) {
        //convert money
        return true; //stub
    }
    
    @BankingAnnotation
    public boolean transfer(int accountNumber, double amount) {
        //transfer money to accountNumber
        return true; //stub
    }
}
