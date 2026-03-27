package applications;
import entities.Employee;

import java.util.Locale;
import java.util.Scanner;

public class Program1 {
    public static void main (String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Employee fcnr = new Employee();

        System.out.print("Digite o nome do funcionário: ");
        fcnr.name = sc.nextLine();
        System.out.print("Digite o salário do funcionário: ");
        fcnr.grossSalary = sc.nextDouble();
        System.out.print("Digite a quantidade de imposto a ser cobrado: ");
        fcnr.tax = sc.nextDouble();

        System.out.println();
        System.out.println("Employee: " + fcnr.name + ", $ " + fcnr.netSalary());
        System.out.print("Qual será a porcentagem de aumento do salário? ");
        double percentage = sc.nextDouble();
        fcnr.increaseSalary(percentage);


        sc.nextLine();
        System.out.println("Data update: " + fcnr.name + ", $ " + String.format("%.2f%n", fcnr.netSalary()));



        sc.close();
    }
}
