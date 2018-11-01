package solid.example;

public class Customer {

    private String customerName;
    private double billAmount;
    private char discountType;
    private GetBillStrategy DiscountStrategy;

    public Customer(String customerName, double billAmount, GetBillStrategy DiscountStrategy) {
        this.customerName = customerName;
        this.billAmount = billAmount;
        this.discountType = discountType;
        this.DiscountStrategy = DiscountStrategy;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
/*
    public double getBillAmount() {
        double tempBill;
        switch(discountType) {
            case 'S':
            case 's': tempBill = billAmount - (billAmount * 0.1);
            case 'D':
            case 'd': tempBill = billAmount - (billAmount * 0.5);
            case 'L':
            case 'l': tempBill = billAmount - (billAmount * 0.75);
            default: tempBill = billAmount;
        }
        return tempBill;
    }
*/
    public double getBillAmount() {
        return DiscountStrategy.getBillAmount(billAmount);
    }

    public void setBillAmount(double billAmount) {
        this.billAmount = billAmount;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerName='" + customerName + '\'' +
                ", billAmount=" + billAmount +
                ", discountType=" + discountType +
                '}';
    }
}
