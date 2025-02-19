package consegna1;
import java.util.Scanner;

public class Esercizio3_1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Inserire il punteggio: ");

        int punteggio = input.nextInt();
        if(punteggio >= 0 && punteggio <= 100)
            System.out.println("Il punteggio è valido.");
        else
            System.out.println("Il punteggio non è valido.");
    }
}