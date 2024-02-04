import java.util.Random;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        System.out.println("Ce code choisi 5 chiffres-nombres aleatiorement et les classe dans l'ordre ");

        int [] notes = new int [5];
        int buffer = 0 ;
        Random rd  = new Random();
        for (int i = 0; i < notes.length ; i++) {
            notes [i] = rd.nextInt(20);
        }
        for (int i = 0; i < notes.length ; i++) {
            System.out.print(notes [i] + "  ") ;
        }
        System.out.println();
        for (int i = 0; i < notes.length; i++) {
            for (int j = 0; j < notes.length-1 ; j++) {
                if (notes [j]> notes [j+1] ){
                    buffer = notes[j];
                    notes [j] = notes [j+1];
                    notes [j+1] = buffer;
                }
            }
        }
        for (int i = 0; i < notes.length ; i++) {
            System.out.print(notes [i] + "  ") ;
        }
    }
}