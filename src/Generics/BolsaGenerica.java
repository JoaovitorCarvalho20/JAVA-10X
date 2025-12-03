package Generics;

import java.util.ArrayList;
import java.util.List;

public class BolsaGenerica <T>{

    // Lista interna que vai guardar os itens do tipo T
    //  "é uma bolsa que guarda objetos genéricos"
    private List<T> equipamento;

    public BolsaGenerica() {
        // Quando a bolsa é criada, ela já nasce com uma lista vazia
        // Pronta pra receber os itens
        this.equipamento = new ArrayList<>();
    }

    // Método para adicionar um item (T) dentro da bolsa
    public void adicionarEquipamentos(T equipamento){
        // Aqui usamos a lista interna (this.equipamento)
        // e colocamos o item nela
        this.equipamento.add(equipamento);
    }

    // Retorna a lista de equipamentos
    // Útil pra ver tudo que foi guardado
    public List<T> getEquipamentos() {
        return equipamento;
    }

    // Troca toda a lista de equipamentos da bolsa por outra
    // (caso alguém queira substituir a lista inteira)
    public void setEquipamentos(List<T> equipamentos) {
        this.equipamento = equipamentos;
    }

    @Override
    public String toString() {
        // Representação textual da bolsa
        // Mostra tudo que está guardado dentro dela
        return "BolsaGenerica{" +
                "equipamentos=" + equipamento +
                '}';
    }
}
