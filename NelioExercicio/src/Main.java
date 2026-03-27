import java.util.Locale;
import java.util.Scanner;

// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);



        String product1 = "Computer";
        String product2 = "Office desk";
        int age = 30;
        int code = 5290;
        char gender = 'F';
        double price1 = 2100.0;
        double price2 = 650.50;
        double measure = 53.234567;

        int a, b;
        float c;

        c = 56.1f;
        a = 4;
        b = 2;
        System.out.println(c);
        System.out.println(a/b);

        System.out.println("Products: ");
        System.out.printf("%s, which price is $ %.2f%n", product1, price1);
        System.out.printf("%s, which price is $ %.2f%n%n", product2, price2);
        System.out.printf("Record: %d years old, code %d and gender %s.%n", age, code, gender);
        System.out.printf("Measue with eight decimal places: %.8f.%n", measure);
        System.out.printf("Rouded (three decimal places): %.3f.%n", measure);
        System.out.printf("US decimal point: %.3f.%n", measure);



    }
}