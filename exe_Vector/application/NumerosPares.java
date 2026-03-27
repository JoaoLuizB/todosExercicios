package application;

import java.util.Locale;
import java.util.Scanner;

public class NumerosPares {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.printf("How many numbers u gonan type? ");
        int n = sc.nextInt();
        int[] vect = new int[n];

        for (int i = 0; i < n; i++){
            System.out.print("Type the numbers: ");
            vect[i] = sc.nextInt();
        }

        int cont = 0;

        System.out.print("NUMEROS PARES: ");
        for (int i = 0; i < n; i++){
            if (vect[i] % 2 == 0){
                cont++;
                System.out.print(vect[i] + " ");
            }
        }



        System.out.print("\nQUANTIDADE DE PARES: " + cont);

        sc.close();
    }
}
