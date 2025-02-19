package consegna1;
import java.util.Scanner;

public class Esercizio3_2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Inserire un numero: ");
        int x = input.nextInt();

        x = x%2==0 ? x/=2 : x*3+1;

        System.out.println("x = " + x);
    }
}
