package application;

import java.util.Locale;
import java.util.Scanner;

public class MaiorPosicao {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.printf("How many number you'll type? ");
        int n = sc.nextInt();

        double  [] vect = new double[n];


        System.out.printf("Type a number: ");
        vect[0] = sc.nextInt();
        double maior = vect[0];
        int posicao = 0;

        for (int i = 1; i < n; i++){
            System.out.printf("Type a number: ");
            vect[i] = sc.nextInt();


            if (vect[i] > maior) {
                maior = vect[i];
                posicao = i;

            }
        }

        System.out.printf("BIGGEST VALUE: %.1f%n", maior);
        System.out.println("POSITION: " + posicao);


        sc.close();
    }
}
