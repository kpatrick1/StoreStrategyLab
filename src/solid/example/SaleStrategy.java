package solid.example;

public class SaleStrategy implements GetBillStrategy {
    private static final double rate  = 0.1;
    @Override
    public double getBillAmount(double billAmount) {
        return billAmount - (billAmount * rate);
    }
}
