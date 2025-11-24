package Intermediario.Pilares;

import static java.lang.Boolean.FALSE;

public class Konoha {
    public static void main(String[] args) {
        //obj 1
        Uchiha sasuke = new Uchiha();
        sasuke.nome = "Sasuke Uchiha";
        sasuke.idade = 12;
        sasuke.aldeia = "Folha";
        System.out.println(sasuke);
        sasuke.ataqueespecial();
        sasuke.sharingan();

        //obj 2
        Uzumaki naruto = new Uzumaki();
        naruto.nome = "Naruto Uzumaki";
        naruto.idade = 13;
        naruto.aldeia = "Folha";
        System.out.println(naruto);
        naruto.ataqueespecial();
        naruto.ModoSabio();

        //obj 3
        Haruno sakura = new Haruno();
        sakura.nome = "Sakura Haruno";
        sakura.idade = 14;
        sakura.aldeia = "Folha";
        System.out.println(sakura);
        sakura.ataqueespecial();
        sakura.SocoForte();

        //obj 4
        Hyuga hinata = new Hyuga();
        hinata.nome = "Hinata Hyuga";
        hinata.idade = 11;
        hinata.aldeia = "Folha";
        System.out.println(hinata);
        hinata.ataqueespecial();
        hinata.ByakuganAtivado();


        //obj 5
        Hokage hokage = new Hokage( "Hiruzen", 60, FALSE);

        System.out.println( hokage);



    }
}
