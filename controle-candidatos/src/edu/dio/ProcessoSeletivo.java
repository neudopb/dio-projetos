package edu.dio;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {

    public static void main(String[] args) {
        // https://glysns.gitbook.io/java-basico/controle-de-fluxo/cases

        double salarioBase = 2000.0;
        String [] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO","MÔNICA","FABRÍCIO","MIRELA","DANIELA","JORGE"};

        System.out.println("PROCESSO SELETIVO\n");
        String [] candidatosSelecionados = selecionarCandidatos(candidatos, salarioBase);

        System.out.println("\nCANDIDATOS SELECIONADOS\n");
        exibirCandidatosSelecionados(candidatosSelecionados);

        System.out.println("\nLIGAR PARA CANDIDATOS\n");
        for(String candidato : candidatosSelecionados)
            ligarCandidatos(candidato);
    }

    public static String[] selecionarCandidatos(String[] candidatos, double salarioBase) {
        String[] candidatosSelecionados = new String[5];

        int totalSelecionados = 0;
        int proximoCandidato = 0;

        while (totalSelecionados < 5 && proximoCandidato < candidatos.length) {
            String candidato = candidatos[proximoCandidato++];
            double salarioPretendido = valorPretendido();

            if(avaliarCandidatos(candidato, salarioBase, salarioPretendido)) {
                candidatosSelecionados[totalSelecionados++] = candidato;
            }
        }

        System.out.println("\nTOTAL SELECIONADOS: " + totalSelecionados);
        System.out.println("TOTAL DE CANDIDATOS CONSULTADOS: " + proximoCandidato);

        String[] listaFinal = new String[totalSelecionados];

        for(int i = 0; i < totalSelecionados; i++)
            listaFinal[i] = candidatosSelecionados[i];

        return listaFinal;
    }

    public static boolean avaliarCandidatos(String candidato, double salarioBase, double salarioPretendido) {
        boolean selecionar = false;

        if(salarioBase > salarioPretendido) {
            System.out.println(candidato + " (R$ " + formatarValor(salarioPretendido) + ") : LIGAR PARA O CANDIDATO");
            selecionar = true;
        } else if(salarioBase == salarioPretendido) {
            System.out.println(candidato + " (R$ " + formatarValor(salarioPretendido) + ") : LIGAR PARA O CANDIDATO, COM CONTRA PROPOSTA");
            selecionar = true;
        } else {
            System.out.println(candidato + " (R$ " + formatarValor(salarioPretendido) + ") : AGUARDAR RESULTADO DOS DEMAIS CANDIDATOS");
        }

        return selecionar;
    }

    public static void exibirCandidatosSelecionados(String[] candidatosSelecionados) {
        for(int i = 0; i < candidatosSelecionados.length; i++) {
            System.out.println((i+1) + "º candidato é: " + candidatosSelecionados[i]);
        }
    }

    public static void ligarCandidatos(String candidato) {
        int tentativas = 0;
        boolean continuarTentando = true;
        boolean atendeu = false;

        do {
            atendeu = atender();
            continuarTentando = !atendeu;

            if(continuarTentando)
                tentativas++;
            else
                System.out.println("CONTATO REALIZADO COM SUCESSO");

        } while (continuarTentando && tentativas < 3);

        if(atendeu)
            System.out.println("CONSEGUIMOS CONTATO COM " + candidato + " NA " + (tentativas+1) + "° TENTATIVA.");
        else
            System.out.println("NÃO CONSEGUIMOS CONTATO COM " + candidato + ", " + tentativas + "° TENTATIVAS REALIZADAS.");
    }

    public static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1700, 2300);
    }

    public static boolean atender() {
        return new Random().nextInt(3)==1;
    }

    public static String formatarValor(double valor) {
        return String.format("%.2f", valor);
    }
}
