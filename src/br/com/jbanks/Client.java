package br.com.jbanks;

public class Client implements IEntity{
    public  String name, CPF;
    private Savings savings;
    private Checking checking;

    public Client(String _name, String _CPF){
        this.name = _name;
        this.CPF = _CPF;
    }
    
    public String getName(){
        return this.name;
    }

    public void setName(String _name){
        this.name = _name;
    }

    public String getCPF(){
        return this.CPF;
    }

    public void setCPF(String _CPF){
        this.CPF = _CPF;
    }

    public Savings getSavings(){
        return this.savings;
    }

    public void setSavings(Savings _savings){
        this.savings = _savings;
    }

    public Checking getChecking(){
        return this.checking;
    }

    public void setChecking(Checking _checking){
        this.checking = _checking;
    }
}
