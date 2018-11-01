package solid.example;

public class LiquidationStrategy implements GetBillStrategy {
    @Override
    public double getBillAmount(double billAmount) {
        return billAmount - (billAmount * 0.75);
    }
}
