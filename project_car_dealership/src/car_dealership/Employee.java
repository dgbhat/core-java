package car_dealership;

public class Employee {
    int eCode;
    int carsSold;
    int revenueGenerated;

    public int geteCode() {
        return eCode;
    }

    public void seteCode(int eCode) {
        this.eCode = eCode;
    }

    public int getCarsSold() {
        return carsSold;
    }

    public void setCarsSold(int carsSold) {
        this.carsSold = carsSold;
    }

    public int getRevenueGenerated() {
        return revenueGenerated;
    }

    public void setRevenueGenerated(int revenueGenerated) {
        this.revenueGenerated = revenueGenerated;
    }

    public void sellCar(Car car, Customer customer, boolean finance) {
        if (finance == true) {
            if (runCreditHistory(customer) == true) {
                processTransaction(customer, car, finance);
            } else {
                declinePurchase(customer);
            }
        } else if (car.price <= customer.getCash()) {
            processTransaction(customer, car, finance);
        } else {
            declinePurchase(customer);
        }
    }

    public boolean runCreditHistory(Customer customer) {
        System.out.println("Finance is true");
        if (customer.getCreditBalance() == 0) {
            System.out.println("Running credit history:: No credit due");
            return true;
        } else {
            System.out.println("Running credit history:: Credit is due");
            return false;
        }
    }

    public void processTransaction(Customer customer, Car car, boolean finance) {
        if (finance == true) {
            int newCredit = car.price - customer.getCash() + customer.getCreditBalance();
            customer.setCreditBalance(newCredit);
        }
        car.setSold(true);
        this.setCarsSold(this.getCarsSold() + 1);
        this.setRevenueGenerated(this.getRevenueGenerated() + car.price);
        System.out.println("Car Sold: " + car);
    }

    public void declinePurchase(Customer customer) {
        System.out.println("Car Not sold due to insufficient money");
    }
}
