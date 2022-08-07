package br.com.jbanks;

import java.util.function.Function;

public class Checking extends Account {

    private int transferLimit;
    private int transfers;
    private double movementLimit;
    private double movemented;

    public Checking(Client client){
        this.holder = client;
    }
   
    private void movementAccount(double value, Function<Double, Void> action){
        if (this.movemented <= this.movementLimit && this.transfers <= this.transferLimit) {
            action.apply(value);
            this.movemented += value;
            this.transfers++;
        }
    }

    @Override
    public void deposit(double value) {
        this.movementAccount(value, new Function<Double, Void>() {
            @Override
            public Void apply(Double value){
                balance += value;
                return null; }
        });
    }

    @Override
    public void transfer(double value, Account account) {
        this.movementAccount(value, new Function<Double,Void>() {
            @Override
            public Void apply(Double value) {
                account.deposit(value);
                return null;
            }
        });
       
    }

    @Override
    public void withdraw(double value) {
        this.movementAccount(value, new Function<Double,Void>() {
            @Override
            public Void apply(Double value) {
                balance -= value;
                return null;
            }
        });
    }
}
