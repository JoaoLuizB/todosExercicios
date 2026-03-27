import java.util.Scanner;
import java.util.Locale;

public class MainExe2 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int num1, num2, A, B, horaInicial, horaFinal, duracao, itemQuant, itemMenu;
        double total, intervalo;
        String quadrante;
        
        //Exercício 1
        System.out.print("Digite um número para saber se é POSITIVO ou NEGATIVO: ");
        num1 = sc.nextInt();
        if (num1 > 0) {
            System.out.println("POSITIVO");
        }
        else if (num1 < 0) {
            System.out.println("NEGATIVO");
        }
        else {
            System.out.println("0 NÃO É POSITIVO NEM NEGATIVO.");
        }

        System.out.println();

        //Exercício 2
        System.out.print("Digite um número para saber se é PAR ou ÍMPAR: ");
        num2 = sc.nextInt();
        if (num2%2 == 0) {
            System.out.println(num2 + " é PAR.");
        }
        else {
            System.out.println(num2 + " é ÍMPAR.");
        }

        System.out.println();

        //Exercício 3
        System.out.print("Digite um número (A) para saber se é múltiplo: ");
            A = sc.nextInt();
        System.out.print("Digite o segundo número (B) para saber se é múltiplo: ");
            B = sc. nextInt();
        if (A>B && A % B == 0){
            System.out.println("SÃO MÚLTIPLOS.");
        }
        else if (B>A && B % A == 0){
            System.out.println("SÃO MUTIPLOS.");
        }
        else {
            System.out.println("NÃO SÃO MULTIPLOS.");
        }

        System.out.println();

        //Exercício 4
        System.out.print("Digite a hora inicial: ");
        horaInicial = sc.nextInt();
        System.out.print("Digite a hora final: ");
        horaFinal = sc.nextInt();
        if (horaFinal > horaInicial) {
            duracao = horaFinal - horaInicial;
        }
        else {
            duracao = 24 - (horaFinal + horaInicial);
        }
        System.out.println("A duração foi de: " + duracao);

        System.out.println();

        //Exercicio 5
        System.out.println("[1] Cachorro Quente - Preço: R$ 4.00;");
        System.out.println("[2] X-Salada - Preço: R$ 4.50;");
        System.out.println("[3] X-Bacon - Preço: R$ 5.00;");
        System.out.println("[4] Torrada Simples - Preço: R$ 2.00;");
        System.out.println("[5] Refrigerante - Preço: R$ 1.50;");
        System.out.print("Qual sua opção desejada?: ");
        itemMenu = sc.nextInt();
        System.out.print("Quantas unidades irar querer? ");
        itemQuant = sc.nextInt();
        if (itemMenu == 1) {
            total = itemQuant * 4.00;
            System.out.printf("Total: R$ %.2f%n", total);
        } else if (itemMenu == 2) {
            total = itemQuant * 4.50;
            System.out.printf("Total: R$ %.2f%n", total);
        } else if (itemMenu == 3) {
            total = itemQuant * 5.00;
            System.out.printf("Total: R$ %.2f%n", total);
        } else if (itemMenu == 4) {
            total = itemQuant * 2.00;
            System.out.printf("Total: R$ %.2f%n", total);
        } else {
            total = itemQuant * 1.50;
            System.out.printf("Total: R$ %.2f%n", total);
        }

        System.out.println();

        //Exercicio 6

        System.out.print("Diga um número: ");
        intervalo = sc.nextDouble();
        if (intervalo >= 0 && intervalo <= 25) {
            System.out.print("Este número pertence ao intervalo de [0,25]");
        } else if (intervalo > 25 && intervalo <= 50) {
            System.out.print("Este número pertence ao intervalo [25,50]");
        } else if (intervalo > 50 && intervalo <= 75) {
            System.out.print("Este número pertece ao intervalo [50,75]");
        } else if (intervalo > 75 && intervalo <= 100) {
            System.out.print("Este número pertece ao intervalo de [75,100]");
        } else {
            System.out.print("Fora do intervalo");
        }

        System.out.println();
        System.out.println();

//        Exercício 7
        System.out.print("Digite um número de 0 a 10 para ser o valor X: ");
        double x = sc.nextDouble();
        System.out.print("Digite um número de 0 a 10 para ser o valor Y: ");
        double y = sc.nextDouble();
        if (y == 0 && x == 0) {
            System.out.print("Origem.");
        } else if (x > 0 && y > 0) {
            quadrante = "Quadrante 1";
            System.out.print(quadrante);
        } else if (x < 0 && y > 0) {
            quadrante = "Quadrante 2";
            System.out.print(quadrante);
        } else if (x < 0 && y < 0) {
            quadrante = "Quadrante 3";
            System.out.print(quadrante);
        } else if (x > 0 && y < 0) {
            quadrante = "Quadrante 4";
            System.out.print(quadrante);
        } else if (y == 0) {
            System.out.print("Eixo X.");
        } else if (x == 0) {
            System.out.print("Eixo Y.");
        } else {
            System.out.print("Fora do limite.");
        }

        System.out.println();
        System.out.println();

//      Exercício 8

        System.out.print("Digite o valor do salário para saber o valor do imposto a pagar: ");
        double salario = sc.nextDouble();
        double imposto;
        if (salario >= 0.00 && salario <= 2000.00) {
            System.out.print("Isento de impostos.");
        } else if (salario > 2000.00 && salario <= 3000.00) {
            imposto = salario * ((double) 8/100);
            System.out.printf("Deverá pagar %.2f%n de impostos.", imposto);
        } else if (salario > 3000.00 && salario <= 4500.00) {
            imposto = salario * ((double) 18/100);
            System.out.printf("Deverá pagar %.2f%n de impostos.", imposto);
        } else {
            imposto = salario * ((double) 28/100);
            System.out.printf("Deverá pagar %.2f%n de impostos.", imposto);
        }

        sc.close();
    }
}
