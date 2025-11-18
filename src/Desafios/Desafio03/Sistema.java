package Desafios.Desafio03;

import Intermediario.OOP.Ninja;
import Intermediario.OOP.Uchiha;

import java.util.Scanner;

public class Sistema {
    public static void main(String[] args) {
        Ninjas ninja1 = new Ninjas();
        ninja1.nome="Naruto";
        ninja1.idade=11;
        ninja1.nivelDeDificuldade= "10";
        ninja1.misso="Salvar gatos";
        ninja1.statusMissao = "concluido";
        ninja1.mostrarInformacoes();

        Uchiha1 ninja2 = new Uchiha1();
        ninja2.nome = "Sasuke";
        ninja2.idade=11;
        ninja2.nivelDeDificuldade= "10";
        ninja2.misso="Salvar gatos";
        ninja2.statusMissao = "concluido";
        ninja2.habilidadeEspecial = "Scharinga";
        ninja2.mostrarHabilidade();
        ninja2.mostrarInformacoes();
















    }
}
