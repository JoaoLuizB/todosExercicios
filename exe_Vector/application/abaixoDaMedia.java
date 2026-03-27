package application;

import java.util.Locale;
import java.util.Scanner;

public class abaixoDaMedia {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many elements the vector 'll have it? ");
        int n = sc.nextInt();

        double[] vect = new double[n];

        double somaVetor = 0;

        for (int i = 0; i < n; i++){
            System.out.print("Type a number: ");
            vect[i] = sc.nextDouble();
            somaVetor += vect[i];
        }

        double mediaVetor = somaVetor / vect.length;

        System.out.printf("VECTOR AVG: %.3f%n", mediaVetor);
        System.out.println("\nBELOW AVG ELEMENTS: ");
        for (int i = 0; i < n; i++){
            if (vect[i] < mediaVetor){
                System.out.println(vect[i]);
            }
        }

        System.out.println("Olá");

        sc.close();
    }
}
