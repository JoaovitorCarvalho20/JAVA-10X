package Iniciante;

public class Condicional {

    public static void main(String[] args) {
        String nome = "Naruto";
        int idade = 16;
        int numeroDeMissoes = 21;
        //Iniciante.Condicionais
        if(idade >=16 && numeroDeMissoes >=15 ){
            System.out.println("chunin");
        }else if(idade >= 16 && numeroDeMissoes > 20){
            System.out.println("jonin");
        } else {
            System.out.println("genin");

        }
        System.out.println(numeroDeMissoes >=8 ? " Esta indo bem":"Esta indo mau"); // Operador ternario
        System.out.println(numeroDeMissoes <=7 ? "Esta indo mau": "Esta indo bem ");
    }


}
