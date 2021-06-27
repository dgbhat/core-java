package car_dealership;
/**
 * Use of Getters and Setters VS use of Constructor
 * access for member variables: private and public accordingly
 * Encapsulation
 * */
public class Customer {

    public String name;
    public String address;
    private int cash;
    private int creditBalance;
    private boolean finance;

    public Customer(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public int getCash() {
        return cash;
    }

    public void setCash(int cash) {
        this.cash = cash;
    }

    public int getCreditBalance() {
        return creditBalance;
    }

    public void setCreditBalance(int creditBalance) {
        this.creditBalance = creditBalance;
    }

    public boolean isFinance() {
        return finance;
    }

    public void setFinance(boolean finance) {
        this.finance = finance;
    }

    public void purchaseCar(Car car, Employee employee, boolean finance) {
        System.out.println(this.name + " is buying a car");
        employee.sellCar(car, this, finance);
    }
}
