package Intermediario.Estruturas.EstruturaDeDados.Heaps;

import java.util.Objects;

public class NinjaHeap {
    String nome;
    int poder;

    public NinjaHeap(String nome, int poder) {
        this.nome = nome;
        this.poder = poder;
    }

    @Override
    public String toString() {
        return "NinjaHeap{" +
                "nome='" + nome + '\'' +
                ", poder=" + poder +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        NinjaHeap ninjaHeap = (NinjaHeap) o;
        return poder == ninjaHeap.poder && Objects.equals(nome, ninjaHeap.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, poder);
    }
}
