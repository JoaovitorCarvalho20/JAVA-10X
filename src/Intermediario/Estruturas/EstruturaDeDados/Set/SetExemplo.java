package Intermediario.Estruturas.EstruturaDeDados.Set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExemplo {

    public static void main(String[] args) {
        /* Quando usar o set
        Remover duplicatas
        Verificar se algo ja existe
        Garantir unicidade
        filtros e validacoes
        * */


        Set<String> jutsus = new HashSet<>(); // Não garante a ordem que foi adicionado

        jutsus.add("Rasengan");
        jutsus.add("Chidori");
        jutsus.add("Rasengan"); // ignorado
        jutsus.add("Chidori"); // ignora

        System.out.println(jutsus);

        System.out.println("====================================");

        Set <String> equipe7 = new LinkedHashSet<>(); // Garante orden de inserção

        equipe7.add("Naruto");
        equipe7.add("Sasuke");
        equipe7.add("Sakura");

        System.out.println(equipe7);

        System.out.println("====================================");

        Set <Integer> poderes = new TreeSet<>(); // Faz a ordenação automatica

        poderes.add(300);
        poderes.add(400);
        poderes.add(700);

        System.out.println(poderes);

    }


}
