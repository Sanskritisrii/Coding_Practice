package org.OOps;

 public class BankingSystem {
    private int accountNumber;
    private String accountHolderName;
    private double balance;

    public BankingSystem(int accountNumber,String accountHolderName ){
        this.accountNumber =accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance=0;
    }
    public void deposit(double amount){
        this.balance+=amount;
    }
    public void withdraw(double amount){
        if(amount<=this.balance) {
            this.balance -= amount;
        }
    }
    public void getAccountInfo(){
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Holder name : " + accountHolderName);
        System.out.println("Balance : " + balance);
    }
}
