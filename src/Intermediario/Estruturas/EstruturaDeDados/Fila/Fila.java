package Intermediario.Estruturas.EstruturaDeDados.Fila;

import java.util.ArrayDeque;
import java.util.Queue;

public class Fila {

    public static void main(String[] args) {
        Queue <TarefasNnja> tarefasNnjaQueue = new ArrayDeque<>();

        TarefasNnja t1 = new TarefasNnja("Salvar gatos", 'v');
        TarefasNnja t2 = new TarefasNnja("Salvar cachorro", 'f');
        TarefasNnja t3 = new TarefasNnja("Salvar passarinho", 'v');
        TarefasNnja t4 = new TarefasNnja("Salvar ornintorrinco", 'f');

        tarefasNnjaQueue.add(t1);
        tarefasNnjaQueue.add(t2);
        tarefasNnjaQueue.add(t3);
        tarefasNnjaQueue.add(t4);

        System.out.println( tarefasNnjaQueue);

        System.out.println(tarefasNnjaQueue.peek());






    }
}
