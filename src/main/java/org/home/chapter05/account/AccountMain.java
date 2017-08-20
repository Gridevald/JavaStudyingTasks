package org.home.chapter05.account;

public class AccountMain {
    
    public static void main(String[] args) {
        Account myAcc = new Account(10001, "Pavel Yudzitski");
        myAcc.doTransaction(new Account.Transaction(1, 400, TransType.ADDING, "Zarplatka! ^_^"));
        myAcc.doTransaction(new Account.Transaction(5, 99.31, TransType.PAYMENT, "Kommunalka((("));
        myAcc.doTransaction(new Account.Transaction(102, 25.0, TransType.PAYMENT, "Belmarket"));
        myAcc.doTransaction(new Account.Transaction(12, 14.53, TransType.PAYMENT, "Minsktrans, metro"));
        myAcc.doTransaction(new Account.Transaction(51, 10, TransType.WITHDRAW, "Malinovka: BPS-ATM"));
    
        System.out.println(myAcc);
        System.out.println("Transactions: ");
        for (Account.Transaction t : myAcc.getTransactions()) {
            System.out.println(t);
        }
    }
}
