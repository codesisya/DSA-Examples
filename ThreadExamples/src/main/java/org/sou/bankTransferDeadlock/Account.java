package org.sou.bankTransferDeadlock;

public class Account {
  private int balance = 10000;
  public void deposit(int amt){
    balance = balance + amt;
  }
  public void withdraw(int amt){
    balance = balance - amt;
  }
  public  int getBalance(){
    return balance;
  }
  public static void transfer(Account a1, Account a2, int amt){
    a1.withdraw(amt);
    a2.deposit(amt);
  }
}
