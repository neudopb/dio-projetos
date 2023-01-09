package edu.dio;

public class ContaPoupanca extends Conta {

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void extrato() {
        System.out.println("******************************");
        System.out.println("    EXTRATO CONTA POUPANÇA    ");
        System.out.println(super.toString());
        System.out.println("******************************");
    }
}
