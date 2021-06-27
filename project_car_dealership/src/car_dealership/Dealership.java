package car_dealership;

/**
 * Use of Getters and Setters VS use of Constructor
 * access for member variables: private and public accordingly
 * Encapsulation
 * */
public class Dealership {
    public static void main(String[] args) {
        Customer customer = new Customer("Tom","#1357 5cross Basavangudi");
        customer.setCash(12000);
        customer.setCreditBalance(0);
        customer.setFinance(true);

        Customer customer2 = new Customer("Phil","#1357 5cross Basavangudi");
        customer2.setCash(12000);
        customer2.setCreditBalance(10);
        customer2.setFinance(true);

        Customer customer3 = new Customer("Duff","#1357 5cross Basavangudi");
        customer3.setCash(12000);
        customer3.setCreditBalance(0);
        customer3.setFinance(false);

        Employee employee = new Employee();
        employee.seteCode(101);
        employee.setCarsSold(0);
        employee.setRevenueGenerated(0);

        Car car = new Car("i20 Grand",25000);
        car.setSold(false);

        customer.purchaseCar(car, employee, customer.isFinance());
        customer2.purchaseCar(car, employee, customer2.isFinance());
        customer3.purchaseCar(car, employee, customer3.isFinance());

    }
}
