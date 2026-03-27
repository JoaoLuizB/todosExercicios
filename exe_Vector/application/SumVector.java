package application;

import java.util.Locale;
import java.util.Scanner;

public class SumVector {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many number you're going to type? ");
        int n = sc.nextInt();
        double[] vect = new double[n];
        int i;
        double sum = 0;

        for (i=0; i<n; i++) {
            System.out.print("Type a number: ");
            vect[i] = sc.nextDouble();
            sum += vect[i];
        }

        System.out.println();

        System.out.print("VALUES = ");
        for (i=0; i<n; i++) {
            System.out.printf("%.1f ", vect[i]);
        }


        System.out.printf("\nSUM = %.1f\n", sum);
        double avg = sum / n;
        System.out.printf("AVERAGE = %.1f\n", avg);


        sc.close();
    }
}
