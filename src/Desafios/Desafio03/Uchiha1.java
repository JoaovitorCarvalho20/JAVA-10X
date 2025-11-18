package Desafios.Desafio03;

public class Uchiha1 extends Ninjas{
        public String habilidadeEspecial;
        public void mostrarHabilidade(){
            System.out.println("A habilidade especial e : " + habilidadeEspecial);
        }

    @Override
    public void mostrarInformacoes() {
        super.mostrarInformacoes();
        System.out.println("A habilidade especial e : " + habilidadeEspecial);
    }
}
