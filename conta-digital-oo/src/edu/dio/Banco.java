package edu.dio;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter @Setter
public class Banco {

    private String nome;
    private List<Conta> contas;

    public Banco(String nome) {
        this.nome = nome;
        contas = new ArrayList<>();
    }

    public void listClientes() {
        System.out.println("******************************");
        System.out.println("           CLIENTES           ");
        for(Conta conta: this.contas) {
            System.out.println("Nome: " + conta.getCliente().getNome());
        }
        System.out.println("******************************");
    }
}
