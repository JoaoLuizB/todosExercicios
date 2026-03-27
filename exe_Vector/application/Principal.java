package application;

import entities.ProductAula;
import java.util.Scanner;


public class Principal {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Digite quantos produtos vc irá digitar: ");
        int n = sc.nextInt();
        sc.nextLine();

        String nome;
        double preco;

        ProductAula product1 = null;

        System.out.println();
        for (int i = 0; i < n; i++) {
            System.out.println("Digite o nome e o preço do produto: ");
            System.out.println("Digite o nome do produto: ");
            nome = sc.nextLine();
            System.out.println("Digite o preço do produto: ");
            preco = sc.nextDouble();
            sc.nextLine();

            product1 = new ProductAula(nome, preco);
            System.out.println();
            product1.exibirDados();
        }

        product1.exibirQuantidadeTotal();




        sc.close();
    }
}
