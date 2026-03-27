import java.util.Locale;
import java.util.Scanner;
public class Main1 {

    public static void main(String[] args ){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int a, b, c;
        double delta, x1, x2;

        System.out.print("Digite o valor de A: ");
        a = sc.nextInt();
        System.out.print("Digite o valor de B: ");
        b = sc.nextInt();
        System.out.print("Digite o valor de C: ");
        c = sc.nextInt();

        delta = (Math.pow(b, 2.0)) - 4*a*c;
        x1 = (-b + Math.sqrt(delta))/(2*a);
        x2 = (-b - Math.sqrt(delta))/(2*a);

        System.out.println("O valor de Delta é: " + delta);
        System.out.println("O valor de x1 é: " + x1);
        System.out.println("O valor de x2 é: " + x2);



        sc.close();
    }
}
