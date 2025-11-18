package Desafios;

import java.util.Scanner;

public class Desafio01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String[] nome = new String[3];
        int[] idade = new int[3];
        String [] missao = new String[3];
        String [] nivelDaMissao = new String[3];
        String [] statusDaMissao = new String[3];

        System.out.println("=== Cadastro de Ninjas ===");

        for (int i = 0; i < nome.length; i++) {
            System.out.println("\nDigite o nome do ninja " + (i + 1) + ": ");
            nome[i] = entrada.nextLine();

            System.out.println("Digite a idade do ninja " + (i + 1) + ": ");
            idade[i] = entrada.nextInt();
            entrada.nextLine();

            System.out.println("Digite a missao do ninja " + (i + 1) + ": ");
            missao[i] = entrada.nextLine();

            System.out.println("Digite o nivel da missao ");
            nivelDaMissao[i] = entrada.nextLine();

            System.out.println("Digite o status da missao ");
            statusDaMissao[i] = entrada.nextLine();

        }

        System.out.println("\n=== Lista de Ninjas Cadastrados ===");
        for (int i = 0; i < nome.length; i++) {
            System.out.println("Ninja " + (i + 1) + ": " + nome[i] + " - " + idade[i] + " anos " + " Missao - " + missao[i] + " Nivel da missao : "+ nivelDaMissao[i] + " Status da missao : " + statusDaMissao[i]);
        }

        entrada.close();
    }


    }

