package com.codandosimples;

public class Main {

    public static void main(String[] args) {
        Conta conta = new Conta();
        conta.numeroDaConta = 123;
        conta.saldo = 250;

        System.out.println("Numero da conta: " + conta.numeroDaConta);
        System.out.println("Saldo da conta: " + conta.saldo);
    }
}
