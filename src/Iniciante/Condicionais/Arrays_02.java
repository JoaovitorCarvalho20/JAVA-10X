package Iniciante.Condicionais;

public class Arrays_02 {
    public static void main(String[] args) {
        //Arrays de Arrays

        String [][] ninjasAldeias = new String[3][3];

        ninjasAldeias[0][0] = "Konora";
        ninjasAldeias[0][1] = "Naruto";
        ninjasAldeias[0][2] = "Sasuke";

        ninjasAldeias[1][0] = "Nevoa";
        ninjasAldeias[1][1] = "Zabuza";
        ninjasAldeias[1][2] = "Haku";

        ninjasAldeias[2][0] = "Deserto";
        ninjasAldeias[2][1] = "Gaara";
        ninjasAldeias[2][2] = "Temari";


        for (int i = 0; i < ninjasAldeias.length; i++) {
            for (int j = 0; j < ninjasAldeias.length ; j++) {
                System.out.println(ninjasAldeias[i][j]);
            }
        }






    }
}
