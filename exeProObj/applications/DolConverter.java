package applications;
import java.util.Scanner;
import java.util.Locale;
import util.CurrencyConverter;

public class DolConverter  {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        CurrencyConverter conv = new CurrencyConverter();


        System.out.println("What is the dollar price? ");
        conv.dolPrice = sc.nextDouble();
        System.out.println("How many dollar you'll bought? ");
        conv.dolMany = sc.nextDouble();


        System.out.printf("Amount to be paid in reais: %.2f%n", conv.dolBuy());

        sc.close();
    }
}
