package applications;

import java.util.Locale;
import java.util.Scanner;
import entities.Rectangle;

public class Program {
    public static void main(String[]args ) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Rectangle rect = new Rectangle();

        System.out.print("Digite a largura e altura do triângulo, respectivamente: ");
        rect.widht = sc.nextDouble();
        rect.height = sc.nextDouble();


        System.out.printf("Area = %.2f%n", rect.area());
        System.out.printf("Perimeter = %.2f%n", rect.perimeter());
        System.out.printf("Diagonal = %.2f%n", rect.diagonal());






        sc.close();
    }
}
