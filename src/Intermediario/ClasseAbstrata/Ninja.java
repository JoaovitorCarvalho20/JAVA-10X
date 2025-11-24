package Intermediario.ClasseAbstrata;

public abstract class Ninja {
    public String nome;
    public int idade;

    public void mostrarInfo(){
        System.out.println( "O nome é " + nome);
        System.out.println("A idade é " + idade);
    }

    public abstract void clonesDaSombras (); // Metodo abstrato, necessita de implementaçao na classe que for usada
// A principal diferença de uma interface para uma classe abstrata, é que a interface nao pode ter atributos
// na verdade pode, so que eles vao ser do tipo FINAL, o que acaba restringindo o seu uso, diferente da classe abstrata.

}
