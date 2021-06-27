package human;
/**
* Objects Demo is done in here
* */
public class Earth {
    public static void createHuman() {
        Human tom;
        tom = new Human();
        tom.name = "Tom";
        tom.age = 5;
        tom.height = 110;
        tom.eyeColor = "Brown";
        tom.speak();

        Human simpleTom =  new Human();
        simpleTom.speak();
    }

    /*Example with a CONSTRUCTOR in the human.Human Class*/
    public static void createHuman2() {

        Human2 joe = new Human2("Joe", 25, 170, "Blue");
        joe.speak();
    }

    public static void main(String[] args) {
        createHuman();
        createHuman2();
    }
}
