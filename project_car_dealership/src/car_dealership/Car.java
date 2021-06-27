package car_dealership;

import java.util.Objects;

/**
 * toString()
 * equals()
 * */
public class Car {
    public String modelName;
    public int price;
    private boolean sold;

    public Car(String modelName, int price) {
        this.modelName = modelName;
        this.price = price;
    }

    public boolean isSold() {
        return sold;
    }

    public void setSold(boolean sold) {
        this.sold = sold;
    }

    @Override
    public String toString() {
        return "Car{" +
                "modelName='" + modelName + '\'' +
                ", price=" + price +
                ", sold=" + sold +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return price == car.price &&
                sold == car.sold &&
                modelName.equals(car.modelName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(modelName, price, sold);
    }
}
