package consegna1;
import java.util.Scanner;

public class Esercizio3_3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Inserire si o no: ");
        String risposta = input.nextLine().toLowerCase();

        boolean accettato;
        accettato = risposta.equals("si") || risposta.equals("s");

        if(accettato)
            System.out.println("risposta accettata");
        else
            System.out.println("risposta rifiutata");
    }
}
