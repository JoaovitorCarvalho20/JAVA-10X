package Iniciante;

import java.util.Scanner;

public class SwitchCaso {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Escolha o seu ninja");
        System.out.println("1 - Naruto");
        System.out.println("2 - Sasuke");
        System.out.println("3 - Sakura");

        int escolha = entrada.nextInt();

        switch (escolha) {
            case 1 :
                System.out.println("Ele sera hokage");
                break;
            case 2:
                System.out.println("Ele sera o Hokage das sombras");
                break;
            case 3:
                System.out.println("Ela sera a mulher do Sasuke");
                break;
            default:
                System.out.println("Voce nao colocou uma entrada valida ");

        }


    }
}
