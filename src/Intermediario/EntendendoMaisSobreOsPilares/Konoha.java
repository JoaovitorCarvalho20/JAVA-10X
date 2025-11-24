package Intermediario.EntendendoMaisSobreOsPilares;

import javax.sound.midi.Soundbank;

public class Konoha {
    public static void main(String[] args) {

        //obj 1
        Uchiha itachi = new Uchiha("Uchiha Itachi", "Folha", 20, Rank.JONIN,153);
        itachi.mostrarInf();
        itachi.ScharinganAtivado();


        System.out.println("================================= ");
        //obj 2
        Hatake kakaschi = new Hatake("Uchiha Itachi","folha",40, Rank.KAGE,250);
        kakaschi.mostrarInf();
        kakaschi.MatarPessoa();
        kakaschi.ScharinganAtivado();



    }
}
