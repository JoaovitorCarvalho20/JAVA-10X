package Intermediario.Estruturas.EstruturaDeDados.Lista;

import java.util.ArrayList;
import java.util.List;

public class KonohaLista {
    public static void main(String[] args) {
        //TODO : Estudando sobre listas

        List <String> ninjas = new ArrayList<>();

        // Metodo para adicionar elementos
        ninjas.add(" Naruto Uzumaki");
        ninjas.add("Sasuke Uchiha");
        ninjas.add("Sakura Haruno");
        ninjas.add("Sarutobi Senju");

        System.out.println(ninjas);

        System.out.println("=======================");

        // Metodo para apagar
        ninjas.remove(0);
        System.out.println(ninjas);

        System.out.println("=======================");

        // Metodo contem
        System.out.println(ninjas.contains("Sakura Haruno"));

        System.out.println("=======================");

        // O equals compara tamanho e cada elemento na mesma ordem; se qualquer um diferir, retorna false.
        List <String> ninjas2 = new ArrayList<>();
        ninjas2.add(" Naruto Uzumaki");
        ninjas2.add("Sasuke Uchiha");
        ninjas2.add("Sakura Haruno");
        ninjas2.add("Sarutobi Senju");
        ninjas2.add("Tobirama Senju");

        System.out.println(ninjas.equals(ninjas2));

        System.out.println("=======================");
        //Sublista, pega um intervalo da lista
        System.out.println(ninjas2.subList(1,4));











    }
}
