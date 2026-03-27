package applications;

import java.util.Locale;
import java.util.Scanner;
import entities.Students;
public class Program2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Students stu = new Students();

        System.out.print("Digite o nome do estudante: ");
        stu.name = sc.nextLine();
        System.out.print("Digite a nota 1 do estudante: ");
        stu.nota1 = sc.nextDouble();
        System.out.print("Digite a nota 2 do estudante: ");
        stu.nota2 = sc.nextDouble();
        System.out.print("Digite a nota 3 do estudante: ");
        stu.nota3 = sc.nextDouble();

        System.out.println();
        System.out.printf("Final grade = %.2f%n", stu.totalGrade());
        if (stu.totalGrade() < 60) {
            System.out.println();
            System.out.println("FAILED!!!");
            System.out.printf("Missing points: %.2f%n", stu.missPoints());
        } else {
            System.out.println();
            System.out.println("PASS!!!");
        }
        sc.close();
    }
}
