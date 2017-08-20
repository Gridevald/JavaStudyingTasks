package org.home.chapter05.account;

import java.text.DecimalFormat;
import java.text.Format;
import java.util.ArrayList;
import java.util.List;

public class Account {
    
    private int id;
    
    private String owner;
    
    private double accountValue;
    
    private List<Transaction> transactions;
    
    /**
     * Constructors
     */
    public Account() {
        transactions = new ArrayList<>();
    }
    
    public Account(int id) {
        this();
        setId(id);
    }
    
    public Account(int id, String owner) {
        this(id);
        setOwner(owner);
    }
    
    /**
     * Getters and Setters
     */
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        if (id > 0) {
            this.id = id;
        }
    }
    
    public String getOwner() {
        return owner;
    }
    
    public void setOwner(String owner) {
        this.owner = owner;
    }
    
    public double getAccountValue() {
        return accountValue;
    }
    
    public List<Transaction> getTransactions() {
        return transactions;
    }
    
    /**
     * Methods
     */
    public void doTransaction(Transaction transaction) {
        if (transaction.getType().equals(TransType.ADDING)) {
            accountValue += transaction.getTransactionValue();
        } else {
            if (validate(transaction)) {
                accountValue -=transaction.getTransactionValue();
            }
        }
        transactions.add(transaction);
    }
    
    private boolean validate(Transaction transaction) {
        return accountValue >= transaction.getTransactionValue();
    }
    
    @Override
    public String toString() {
        Format f = new DecimalFormat("#.###");
        StringBuilder sb = new StringBuilder();
        sb.append("Account #").append(id).append(".\n");
        sb.append("Owner: ").append(owner).append(".\n");
        sb.append("Balance: ").append(f.format(accountValue)).append("\n");
        return sb.toString();
    }
    
    /**
     * Inner class Transaction
     */
    public static class Transaction {
        
        private int id;
        
        private double transactionValue;
        
        private TransType type;
        
        private String name;
    
        /**
         * Constructors
         */
        public Transaction(){
        }
        
        public Transaction(int id, double transactionValue, TransType type) {
            setId(id);
            setTransactionValue(transactionValue);
            setType(type);
        }
        
        public Transaction(int id, double transactionValue, TransType type, String name) {
            this(id, transactionValue, type);
            setName(name);
        }
        
        /**
         * Getters and Setters
         */
        public int getId() {
            return id;
        }
        
        public void setId(int id) {
            if (id > 0) {
                this.id = id;
            }
        }
        
        public double getTransactionValue() {
            return transactionValue;
        }
        
        public void setTransactionValue(double transactionValue) {
            this.transactionValue = transactionValue;
        }
        
        public String getName() {
            return name;
        }
        
        public void setName(String name) {
            this.name = name;
        }
    
        public TransType getType() {
            return type;
        }
    
        public void setType(TransType type) {
            this.type = type;
        }
    
        /**
         * Methods
         */
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Trans. # ").append(id).append(" : ");
            if (type.equals(TransType.ADDING)) {
                sb.append("+ ");
            } else {
                sb.append("- ");
            }
            sb.append(transactionValue);
            sb.append(" - ").append(name).append(";");
            return sb.toString();
        }
    }
}
