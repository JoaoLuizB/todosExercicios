package util;

public class CurrencyConverter{
    public double dolPrice;
    public double dolMany;

    double tax;
    public double tax() {
        return tax = (dolMany * dolPrice) * 0.06;
    }

    public double dolBuy() {
        double grossPrice = (dolMany * dolPrice);
        return  grossPrice + tax();
    }
}
