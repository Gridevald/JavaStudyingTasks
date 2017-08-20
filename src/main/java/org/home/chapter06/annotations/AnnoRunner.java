package org.home.chapter06.annotations;

public class AnnoRunner {
    
    public static void main(String[] args) {
        
        AccountOperationManager account = new AccountOperationManagerImpl();
        AccountOperationManager securityAccount = SecurityFactory.createSecurityObject(account);
        securityAccount.depositInCash(101, 5.5);
        securityAccount.withdraw(102, 3);
        securityAccount.convert(1);
        securityAccount.transfer(103, 2);
    }
}
