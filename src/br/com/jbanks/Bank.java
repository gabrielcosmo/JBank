package br.com.jbanks;

import java.util.Scanner;

public class Bank{
    public static void main(String[] args) {
        System.out.println("=== Bem vindo ao Banco JBank!! ===");
        Scanner scanner = new Scanner(System.in);
        String next = "";

        System.out.println("Vamos abrir uma conta? ");
       
        System.out.print("Nome: ");
        String name = scanner.nextLine();

        System.out.println("=============");
    
        System.out.print("CPF: ");
        int cpf_in = scanner.nextInt();
        String cpf = Integer.toString(cpf_in);

        Client client = new Client(name, cpf);
        Savings savings = new Savings(client);

        savings.agency = 1;
        savings.number = (int) (Math.random() * 1000000);
        savings.balance = 0;
       
        System.out.println("=============");

        System.out.println("Sua conta foi criada com sucesso, " +  client.name + "!!");

        System.out.println("=== Dados ===");
        System.out.println("Titular: " + client.name);
        System.out.println("CPF: " + client.CPF);
        System.out.println("Numero da conta: " + savings.number);
        System.out.println("Saldo: " + savings.balance);

    }
}
