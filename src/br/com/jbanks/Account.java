package br.com.jbanks;

public abstract class Account {
    public int agency, number;
    public double balance;
    public Client holder;

    public abstract void deposit(double value);

    public abstract void transfer(double value, Account account);

    public abstract void withdraw(double value);

}
