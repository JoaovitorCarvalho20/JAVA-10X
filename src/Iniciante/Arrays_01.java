package Iniciante;

import java.util.ArrayList;
import java.util.List;

public class Arrays_01 {
    public static void main(String[] args) {

        String [] ninjas = new String[4];
        ninjas[0] = "Naruto";
        ninjas[1]= "Sasuke";
        ninjas[2]= "Sakura";
//        System.out.println(ninjas[0]);
//        System.out.println(ninjas[1]);
//        System.out.println(ninjas[2]);
//        System.out.println(ninjas[3]);
        for(int i=0 ; i<4; i++ ){
            System.out.println(ninjas[i]);
        }


        List<String> nomes  = new ArrayList<>();
        nomes.add(0,"Sasuke");
        System.out.println(nomes);
        nomes.addFirst("Naruto");
        System.out.println(nomes);
        nomes.clear();
        System.out.println(nomes);

    }
}
