package Iniciante;

public class LacoDeRepeticao {
    public static void main(String[] args) {

        int numeroDeClones = 0 ;
        int numeroMaximoDeClones = 40 ;
        int i = 0;
        while (numeroDeClones <= numeroMaximoDeClones){
            System.out.println("clone Naruto "+ i);

      numeroDeClones = i++ ;
        }

        for (int j =0 ; j <= numeroMaximoDeClones; j++){
            System.out.println("Clone Sasuke "+ j);
        }


    }
}
