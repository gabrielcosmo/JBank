package br.com.jbanks;

public class Savings extends Account{

    public Savings(Client client){
        this.holder = client;
    }

    @Override
    public void deposit(double value) {
       this.balance += value;
    }

    @Override
    public void transfer(double value, Account account) {
        account.deposit(value);
    }

    @Override
    public void withdraw(double value) {
       this.balance -= value;
    }
}