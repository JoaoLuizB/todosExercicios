package application;

import java.util.Locale;
import java.util.Scanner;

public class SomaVectores {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many values each vector it's gonna have: ");
        int n = sc.nextInt();

        double[] vectA = new double[n];
        double[] vectB = new double[n];
        double[] vectC = new double[n];

        System.out.println();
        for (int i = 0; i < n; i++){
            System.out.print("Type a number for vectA: ");
            vectA[i] = sc.nextDouble();
        }

        System.out.println();
        for (int i = 0; i < n; i++){
            System.out.print("Type a number for vectB: ");
            vectB[i] = sc.nextDouble();
        }


        for (int i = 0; i < n; i++){
            vectC[i] = vectA[i] + vectB[i];
        }

        System.out.println("\nResultant vector: ");
        for (int i = 0; i < n; i++){
            System.out.println(vectC[i]);
        }

        sc.close();
    }
}
