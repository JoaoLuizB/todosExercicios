package application;

import java.util.Locale;
import java.util.Scanner;

public class MediaPares {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite quantos elementos terá o vetor: ");
        int n = sc.nextInt();

        int[] vetor = new int[n];

        for (int i = 0; i < n; i++){
            System.out.printf("Digite o valor " + (i+1) + " do vetor: ");
            vetor[i] = sc.nextInt();
        }

        int count = 0;
        int sum = 0;
        double media = 0;

        for (int i = 0; i < n; i++){
            if (vetor[i] % 2 == 0){
                count += 1;
                sum += vetor[i];
            }
        }
        if (count > 0){
            media = (double) sum/ count;
            System.out.printf("\nMédia dos números pares: %.1f%n", media);
        }

        if (count == 0){
            System.out.print("\nNenhum número par.");
        }


        sc.close();

    }
}
