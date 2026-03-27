import java.util.Locale;
import java.util.Scanner;

public class MainExeFor {
    public static void main (String[] args) {


        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int x, intI = 0, intO = 0, fat = 1, sub;

       System.out.print("Digite um número de 1 a 1000: ");
       x = sc.nextInt();

       for (int y = 1; y <= x; y++) {
           if (y % 2 != 0) {
               System.out.println(y);
           }
       }


       System.out.println();
       System.out.println();

       System.out.print("Digite a quantidade de números que irá digitar: ");

       



       for (int N = sc.nextInt(); N != 0; N--) {
           System.out.print("Digite o valor: ");
           int X = sc.nextInt();
           if (X >= 10 && X <= 20) {
               intI += 1;
           } else {
               intO += 1;
           }
       }
       System.out.println(intI + " in.");
       System.out.println(intO + " out.");


       System.out.println();
       System.out.println();


       System.out.print("Digite a quantidade de vezes que irá digitar: ");
       int qtF = 1;
       for (int qtn = sc.nextInt();qtF <= qtn; qtF++) {
           System.out.print("Digite os números que deseja ter a média ponderada: ");
           double v1 = sc.nextDouble();
           double v2 = sc.nextDouble();
           double v3 = sc.nextDouble();
           double mP = (v1 * 2.0 + v2 * 3.0 + v3 * 5.0) / 10.0;
           System.out.printf("%.2f%n", mP);
       }


       System.out.println();
       System.out.println();

       System.out.print("Digite a quantidade de pares que deseja fazer a divisão: ");
       int pN = sc.nextInt();
       for (int i = 1; i <= pN; i++){
           System.out.print("Digite os valores: ");
           double v1 = sc.nextDouble();
           double v2 = sc.nextDouble();
           if (v2 == 0) {
               System.out.println("Divisão impossível.");
           } else {
               double div = v1 / v2;
               System.out.printf("%.1f%n", div);
           }

       }

       System.out.println();
       System.out.println();


        System.out.print("Digite o valor para encontrar o fatorial: ");
        int vF = sc.nextInt();
        for (int i = 1; i <= vF; i++) {
            fat *= i;
        }
        System.out.println(fat);


        System.out.println();
        System.out.println();


        System.out.print("Digite um valor inteiro para ver seus divisores: ");
        int divI = sc.nextInt();
        for (int i = 1; i <= divI; i++) {
            if (divI % i == 0) {
                int resul = divI / i;
                System.out.println(resul);
            }
        }

        System.out.print("Digite o número de linhas que deseja mostrar: ");
       int nL = sc.nextInt();
       for (int i = 1; i <= nL; i++) {
           double a2 = Math.pow(i, 2);
           double a3 = Math.pow(i, 3);
           System.out.println(i + " " + a2 + " " + a3);
       }



       sc.close();
    }
}
