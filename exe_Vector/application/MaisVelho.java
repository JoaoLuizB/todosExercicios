package application;
import java.util.Locale;
import java.util.Scanner;

public class MaisVelho {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        System.out.print("Digite quantas pessoas irá digitar: ");
        int n = sc.nextInt();

        String[] vetPessoa = new String[n];
        int[] vetIdade = new int[n];

        for (int i = 0; i < n; i++){
            System.out.printf("\nDados da " + (i+1) + "a " + "pessoa: ");
            System.out.print("\nDigite o nome: ");
            sc.nextLine();
            vetPessoa[i] = sc.nextLine();
            System.out.print("Digite a idade: ");
            vetIdade[i] = sc.nextInt();
        }

        String maisVelho = vetPessoa[0];
        int maiorIdade = vetIdade[0];
 
        sc.nextLine();
        for (int i = 1; i < n; i++){
            if (vetIdade[i] > maiorIdade){
                maiorIdade = vetIdade[i];
                maisVelho = vetPessoa[i];
            }
        }

        System.out.println("\nPessoa mais velha: " + maisVelho);

        sc.close();
    }
}
