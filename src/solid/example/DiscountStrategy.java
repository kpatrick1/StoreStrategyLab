package solid.example;

public class DiscountStrategy implements  GetBillStrategy {
    private static final double rate  = 0.5;
    @Override
    public double getBillAmount(double billAmount) {
        return billAmount - (billAmount * rate);
    }
}
