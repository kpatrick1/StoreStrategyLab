package solid.example;

public class SaleStrategy implements GetBillStrategy {

    @Override
    public double getBillAmount(double billAmount) {
        return billAmount - (billAmount * 0.1);
    }
}
