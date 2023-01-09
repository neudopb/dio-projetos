package edu.dio;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Banco banco = new Banco("Diobank");
        List<Conta> contas = new ArrayList<>();

        Cliente cliente1 = new Cliente("Neudo");
        Cliente cliente2 = new Cliente("Francisco");

        Conta cc = new ContaCorrente(cliente1);
        Conta cp = new ContaPoupanca(cliente2);

        contas.add(cc);
        contas.add(cp);
        banco.setContas(contas);

        cc.depositar(100);
        cc.sacar(150);
        cc.transferir(50, cp);

        cc.extrato();
        cp.extrato();

        banco.listClientes();
    }
}
