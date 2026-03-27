package entities;

public class ProductAula {
    private String nme;
    private double price;
    private static int quantidadeTotal = 0;

    public ProductAula() {
        quantidadeTotal++;
    }

    public ProductAula(String name, double price) {
        this.nme = name;
        this.price = price;
        quantidadeTotal++;
    }

    public void exibirDados(){
        System.out.println("Os dados do produto são: ");
        System.out.println("Nome: " + nme + " | " + "Preço: R$" + price + ".");
    }

    public static void exibirQuantidadeTotal() {
        System.out.println(quantidadeTotal);
    }

}
