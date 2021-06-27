package zoopack3;

/**
 * POLYMORPHISM [ABSTRACT CLASS]
 * To define Common Properties in Super Class. ex, move() method in <class>Animal<class/> => Bird moves differently than Mammal(Polymorphism). move() must be implemented in <class>Bird,Mammal</class>
 * Objects can not be created from an Abstract class. It has to be extended if we need to create an object of its properties
* */
public class Zoo {

    /**Notice monkey is of type Animal
     * Object that is going to get created is of type Monkey class. Hence we can make use of common method moveAnimal()
     * Reference variable to this object is of Animal type (Super).
     **/
    public static void createAnimal() {
        Animal monkey = new Mammal("Monkey", 10, "Brown");
//        monkey.run();

        Animal newDove = new Dove("Dove", 1, "Gray");
//        newDove.fly();

        moveAnimal(monkey);
        moveAnimal(newDove);
    }

    /*New common method using power of abstraction*/
    public static void moveAnimal(Animal animal) {
        animal.move();
    }

    public static void main(String[] args) {
        createAnimal();
    }
}
