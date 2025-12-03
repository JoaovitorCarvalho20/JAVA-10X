package Generics;

public class konoha {
    public static void main(String[] args) {
       Equipamentos Kunai =new Equipamentos("Kunai");
       Equipamentos KunaiEsplosiva  =new Equipamentos("Kunai Esplosiva");
       Equipamentos Pergaminho =new Equipamentos("Pergaminho");



        BolsaGenerica <Equipamentos> bolsaGenerica = new BolsaGenerica<>();
        bolsaGenerica.adicionarEquipamentos(Kunai);
        bolsaGenerica.adicionarEquipamentos(KunaiEsplosiva);
        bolsaGenerica.adicionarEquipamentos(Pergaminho);

        System.out.println( bolsaGenerica);
    }

}
