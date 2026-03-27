import java.util.Locale;
import java.util.Scanner;

public class MainExe3 {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int x, y, pl1, pl2, cmb, alc = 0, gas = 0, die = 0;


        System.out.print("Escolha uma senha: ");
        x = sc.nextInt();
        System.out.println(".");
        System.out.println(".");
        System.out.println(".");
        System.out.print("Digite a senha para entrar: ");
        y = sc.nextInt();
        while (y != x) {
            System.out.println("Senha errada, digite novamente!");
            System.out.print("Digite a senha para entrar: ");
            y = sc.nextInt();

        }
        System.out.print("Acesso permitido!");

        System.out.println();
        System.out.println();


        System.out.print("Digite o valor X: ");
        pl1 = sc.nextInt();
        System.out.print("Digite o valor Y: ");
        pl2 = sc.nextInt();

        while (pl1 != 0 && pl2 != 0) {
            if (pl1 > 0 && pl2 > 0) {
                System.out.println("Pertence ao Primeiro quadrante.");
            }
            else if (pl1 < 0 && pl2 > 0) {
                System.out.println("Pertence ao Segundo quadrante.");
            } else if (pl1 < 0 && pl2 < 0) {
                System.out.println("Pertence ao Terceiro quadrante.");
            } else {
                System.out.println("Pertence ao Quarto quadrante.");
            }
            System.out.print("Digite o próximo valor de X: ");
            pl1 = sc.nextInt();
            System.out.print("Digite o próximo valor de Y: ");
            pl2 = sc.nextInt();
        }

        System.out.println();
        System.out.println();


        System.out.println("Escolha o combústivel qual você abastece: ");
        System.out.println("[1] Álcool");
        System.out.println("[2] Gasolina");
        System.out.println("[3] Diesel");
        System.out.println("[4] Fim");
        System.out.print("Digite um número (de 1 a 4): ");
        cmb = sc.nextInt();
        while (cmb != 4){
            if (cmb == 1) {
                alc += 1;
            } else if (cmb == 2) {
                gas += 1;
            } else if (cmb == 3) {
                die += 1;
            } else if (cmb < 1 && cmb > 4) {
                System.out.println("Valor inválido");
            } else {
                System.out.println("Fim da contagem.");
            }
            cmb = sc.nextInt();
        }

        System.out.println("MUITO OBRIGADO POR NOS AVALIAR!");
        System.out.println("Álcool: " + alc);
        System.out.println("Gasolina: " + gas);
        System.out.println("Diesel: " + die);










        sc.close();

    }
}
