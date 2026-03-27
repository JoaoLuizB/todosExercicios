import com.sun.source.doctree.SystemPropertyTree;

import java.util.Scanner;
import java.util.Locale;

public class MainExe1 {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String nome;
        int a, b, res, c, d, e, f, dif, ide, hrTb, QtdRou1, QtdRou2, IdeRou1, IdeRou2;
        double pi, raio, area, sal, VlrHr, VlrRou1, VlrRou2, VlrF1, VlrF2, VlrF, baseA, baseB, altRai, areaTri, areaCir, areaTra, areaQua, areaRet;
        pi = 3.14159;

        //Exercício 1
        System.out.print("Digite o elemento A: ");
        a = sc.nextInt();
        System.out.print("Digite o elemento B: ");
        b = sc.nextInt();

        res = a + b;

        System.out.println("O resultado de" + " " + a + " +" + " " + b + " é igual a: " + res);

        System.out.println();

        //Exercício 2
        System.out.print("Digite o raio do círculo: ");
        raio = sc.nextDouble();

        area = pi*(Math.pow(raio, 2.0));

        System.out.printf("A área do círculo é: %.4f%n ", area);

        System.out.println();

        //Exercício 3
        System.out.print("Digite o valor A: ");
        c = sc.nextInt();
        System.out.print("Digite o valor B: ");
        d = sc.nextInt();
        System.out.print("Digite o valor C: ");
        e = sc.nextInt();
        System.out.print("Digite o valor D: ");
        f = sc.nextInt();

        dif = (c*d) - (e*f);

        System.out.println("A diferença entre os elemento A e B para os elementos C e D é de: " + dif);

        System.out.println();

        //Exercício 4
        sc.nextLine();
        System.out.print("Digite o nome do funcionário: ");
        nome = sc.nextLine();
        System.out.print("Digite o identificador do funcionário: ");
        ide = sc.nextInt();
        System.out.print("Em seguida, digite as horas trabalhadas: ");
        hrTb = sc.nextInt();
        System.out.print("Agora diga o valor da hora trabalhada correspondente ao colaborador: ");
        VlrHr = sc.nextDouble();

        sal = hrTb*VlrHr;

        System.out.printf("O salário do colaborador %s com identificador %d é de: R$ %.2f%n", nome, ide, sal);

        System.out.println();

        //Exercício 5
        System.out.print("Digite o código identificador da roupa 1: ");
        IdeRou1 = sc.nextInt();
        System.out.print("Digite a quantidade de peças da roupa 1 que irá levar: ");
        QtdRou1 = sc.nextInt();
        System.out.println("Digite o valor unitário da roupa 1: ");
        VlrRou1 = sc.nextDouble();
        System.out.print("Digite o código identificador da roupa 2: ");
        IdeRou2 = sc.nextInt();
        System.out.print("Digite a quantidade de peças da roupa 2 que irá levar: ");
        QtdRou2 = sc.nextInt();
        System.out.println("Digite o valor unitário da roupa 2: ");
        VlrRou2 = sc.nextDouble();

        VlrF1 = QtdRou1 * VlrRou1;
        VlrF2 = QtdRou2 * VlrRou2;
        VlrF = VlrF1 + VlrF2;

        System.out.printf("O valor final a pagar é: R$ %.2f%n", VlrF);

        System.out.println();

        //Exercicio 6
        sc.nextLine();
        System.out.print("Digite o valor da base/lado A: ");
        baseA = sc.nextDouble();
        sc.nextLine();
        System.out.print("Digite o valor da base/lado B: ");
        baseB = sc.nextDouble();
        sc.nextLine();
        System.out.print("Digite o valor da altura/raio C: ");
        altRai = sc.nextDouble();

        areaTri = (baseA * altRai)/2.0;
        areaCir = pi * (Math.pow(altRai, 2.0));
        areaTra = ((baseA + baseB)*altRai)/2.0;
        areaQua = baseB*baseB;
        areaRet = baseA*baseB;

        System.out.printf("Área do triângulo: %.3f%n", areaTri);
        System.out.printf("Área do círculo é: %.3f%n", areaCir);
        System.out.printf("Área do trapézio é: %.3f%n", areaTra);
        System.out.printf("Área do quadrado é: %.3f%n", areaQua);
        System.out.printf("Área do retângulo é: %.3f%n", areaRet);
        sc.close();
    }
}
