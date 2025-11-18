package Iniciante.Condicionais;

import java.util.Scanner;

public class ScannerEntrada {

    public static void main(String[] args) {
        Scanner entrada =  new Scanner(System.in);

        System.out.println( "Qual o nome do ninja ? ");
        String nome = entrada.nextLine();
        System.out.println("O nome do ninja e " + nome);

        System.out.println("Qual e a idade do ninja ? ");
        int idade = entrada.nextInt();
        if (idade < 16){
            System.out.println("O "+ nome + " e novo em " );
        } else if (idade == 16) {
            System.out.println("O "+ nome + " e adolecente em ");
        }else{
            System.out.println("O "+ nome + " e velho em ");
        }

        entrada.close();
    }


}
