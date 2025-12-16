package Intermediario.Estruturas.EstruturaDeDados.HashMap;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx {
    public static void main(String[] args) {

        Map<String, String> ninjas = new HashMap<>();

        ninjas.put("Naruto","Hokage");
        ninjas.put("Sasuke","Renegado");
        ninjas.put("Sakura","Ninja Medica");

        System.out.println(ninjas);

        System.out.println("=================================");

        /*
        ninjas.clear();
        System.out.println(ninjas);
        **/
        // Verifica se existe a chave, de maneira semelhante, temos containvalue
        System.out.println(ninjas.containsKey("Naruto"));
        System.out.println(ninjas.containsKey("Sasuke"));
        System.out.println(ninjas.containsKey("Sakura"));

        System.out.println("=================================");
        //Tamanho
        System.out.println(ninjas.size());



    }
}
