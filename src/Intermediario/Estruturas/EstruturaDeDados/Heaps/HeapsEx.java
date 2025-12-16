package Intermediario.Estruturas.EstruturaDeDados.Heaps;

import java.util.PriorityQueue;

public class HeapsEx {
    public static void main(String[] args) {

        PriorityQueue<NinjaHeap> priorityQueue = new PriorityQueue<>((a,b)-> a.poder - b.poder);

        //TODO: ((a,b)-> a.poder - b.poder); Aqui é onde podemos definir a forma de comparação


        priorityQueue.add(new NinjaHeap("Sakura", 500));
        priorityQueue.add(new NinjaHeap("Naruto", 400));
        priorityQueue.add(new NinjaHeap("Sasuke", 300));

        System.out.println("===================================");
        // Ve o que esta no topo da arvore
        System.out.println("Quem esta no topo da arvore ?");
        System.out.println(priorityQueue.peek().nome);

        System.out.println("===================================");
        // Retira uem esta no topo da arvore
        System.out.println("Retira quem esta no topo da arvore ");

        System.out.println(priorityQueue.poll());

        System.out.println("===================================");
        System.out.println("Quem esta no topo da arvore ?");

        //Ve quem esta no topo da arvore
        System.out.println(priorityQueue.peek().nome);

        System.out.println("===================================");

    }
}
