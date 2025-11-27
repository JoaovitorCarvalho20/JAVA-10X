package Intermediario.EntendendoMaisSobreOsPilares;

// Classe final, essa classe não pode ser alterada, dessa forma, não pode ser extendida
final public class Anbu {
   //TODO: criar uma classe final, e um metodo final

    String nome;

    void souAnbu(){
        System.out.println("Sou um ninja que responde ao HOKAGE");
    }

    // Como esse é um metodo Final, ele não pode ser alterado, ou seja não pode ser sobrescrito.
    final void atirarEstrelasNinja(){
        System.out.println("Atirando estrelas Ninja");
    }
}
