package edu.dio;

import lombok.Getter;

@Getter
public abstract class Conta implements IConta {

    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIA = 1;

    protected Cliente cliente;
    protected int agencia;
    protected int numero;
    protected double saldo;

    protected Conta(Cliente cliente) {
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIA++;
        this.cliente = cliente;
    }

    @Override
    public void sacar(double valor) {
        if(valor <= saldo)
            saldo -= valor;
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
    }

    @Override
    public void transferir(double valor, IConta contaDestino) {
        if(valor <= saldo) {
            this.sacar(valor);
            contaDestino.depositar(valor);
        }
    }

    @Override
    public String toString() {
        return "Titular: " + cliente.getNome() +
                "\nAgencia: " + agencia +
                "\nNumero: " + numero +
                "\nSaldo: " + saldo;
    }
}
