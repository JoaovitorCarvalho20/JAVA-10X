package Desafios;

import java.util.Scanner;

public class Desafio02 {
    public static void main(String[] args) {

                Scanner input = new Scanner(System.in);

                int amount = 100;
                String[] NinjaName = new String[amount];
                int[] NinjaAge = new int[amount];
                int count = 0; // controla quantos ninjas foram cadastrados

                while (true) {
                    System.out.println("\n============== Cadastro Ninja ==============");
                    System.out.println("1 - Cadastrar ninja");
                    System.out.println("2 - Listar ninjas");
                    System.out.println("3 - Sair");
                    System.out.print("Escolha uma opção: ");
                    int option = input.nextInt();
                    input.nextLine(); // limpa o buffer

                    switch (option) {
                        case 1:
                            if (count < amount) {
                                Ninjaadd(NinjaName, NinjaAge, count);
                                count++;
                            } else {
                                System.out.println("⚠ Limite de ninjas atingido!");
                            }
                            break;

                        case 2:
                            ListNinja(NinjaName, NinjaAge, count);
                            break;

                        case 3:
                            System.out.println("Saindo do programa...");
                            return; // encerra o programa aqui

                        default:
                            System.out.println(" Opção inválida! Tente novamente.");
                    }
                }
            }

            public static void Ninjaadd(String[] NinjaName, int[] NinjaAge, int i) {
                Scanner input = new Scanner(System.in);
                System.out.print("Digite o nome do Ninja: ");
                NinjaName[i] = input.nextLine();

                System.out.print("Digite a idade do Ninja: ");
                NinjaAge[i] = input.nextInt();
                input.nextLine();
                System.out.println(" Ninja cadastrado com sucesso!");
            }

            public static void ListNinja(String[] NinjaName, int[] NinjaAge, int count) {
                System.out.println("\n============= Lista de Ninjas Cadastrados =============");
                if (count == 0) {
                    System.out.println("Nenhum ninja cadastrado ainda!");
                } else {
                    for (int i = 0; i < count; i++) {
                        System.out.println("Nome: " + NinjaName[i] + " | Idade: " + NinjaAge[i]);
                    }
                }
            }
        }
