package edu.dio;

public class ContaCorrente extends Conta {

    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void extrato() {
        System.out.println("******************************");
        System.out.println("    EXTRATO CONTA CORRENTE    ");
        System.out.println(super.toString());
        System.out.println("******************************");
    }
}
