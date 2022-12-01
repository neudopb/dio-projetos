package edu.dio;

import java.util.Scanner;

public class Contador {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Primeiro valor: ");
        int primeiroValor = in.nextInt();

        System.out.print("Segundo valor: ");
        int segundoValor = in.nextInt();

        try {
            contar(primeiroValor, segundoValor);
        } catch (ParametrosInvalidosException e) {
            System.err.println("O segundo parâmetro deve ser maior que o primeiro");
        }
    }

    public static void contar(int primeiroValor, int segundoValor) throws ParametrosInvalidosException {

        if(primeiroValor > segundoValor)
            throw new ParametrosInvalidosException();

        int contador = segundoValor - primeiroValor;

        for(int i = 1; i < contador; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}
