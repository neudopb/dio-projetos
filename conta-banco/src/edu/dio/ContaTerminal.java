package edu.dio;

import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String [] args) {
        Scanner in = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Nome: ");
        String nome = in.nextLine();

        System.out.print("Número da conta: ");
        int numero = in.nextInt();

        System.out.print("Agencia: ");
        String agencia = in.next();

        System.out.print("Saldo: ");
        double saldo = in.nextDouble();

        System.out.println("Olá ".concat(nome).concat(", obrigado por criar uma conta em nosso banco, sua agência é ")
                .concat(agencia).concat(", conta ").concat(Integer.toString(numero))
                .concat(" e seu saldo ").concat(Double.toString(saldo))
                .concat(" já está disponível para saque"));

        in.close();
    }
}
