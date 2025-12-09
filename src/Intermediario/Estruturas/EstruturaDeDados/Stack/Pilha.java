package Intermediario.Estruturas.EstruturaDeDados.Stack;

import java.util.Stack;

public class Pilha {
    public static void main(String[] args) {
        Stack<String> jutsus = new Stack<>();

        //O metodo push, a diciona os itens no topo da pilha
        jutsus.push("Clone das sombras");
        jutsus.push("Rasengan");
        jutsus.push("Bola de fogo");
        jutsus.push("Caixao de areia");

        System.out.println( jutsus);

        System.out.println("===============================");
        // O metodo peek ve quem esta no topo da lista
        System.out.println(jutsus.peek());

        System.out.println("===============================");
        // O metodo pop, retira o ultimo item que entrou na pilha
        System.out.println(jutsus.pop());
        System.out.println( jutsus);

        System.out.println("===============================");
        // O metodo empty, verifica se a pilha esta vazia
        System.out.println(jutsus.empty());

        System.out.println("===============================");
        // O metodo add, permite adicionar intens, bastando passar seu index e o elemento, aceita valores repitidos
        jutsus.add(3, "Dragao de agua");
        jutsus.add(4, "Dragao de agua");
        System.out.println( jutsus);
        System.out.println(jutsus.peek());

        System.out.println("===============================");
        jutsus.set(4,"Prisao de gelo");
        jutsus.set(5,"Prisao de gelo");

        System.out.println(jutsus);
        System.out.println(jutsus.peek());








    }
}
