package br.com.jbanks;

public interface IEntity {
    public  String name = "";
    public String CPF = "";

    String getName();
    void setName(String _name);
    String getCPF();
    void setCPF(String _CPF);

}
