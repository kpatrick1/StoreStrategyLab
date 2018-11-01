package solid.example;

public class LiquidationStrategy implements GetBillStrategy {
    private static final double rate  = 0.75;
    @Override
    public double getBillAmount(double billAmount) {
        return billAmount - (billAmount * rate);
    }
}
