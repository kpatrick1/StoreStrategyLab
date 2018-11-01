package solid.example;

public class DiscountStrategy implements  GetBillStrategy {
    @Override
    public double getBillAmount(double billAmount) {
        return billAmount - (billAmount * 0.5);
    }
}
