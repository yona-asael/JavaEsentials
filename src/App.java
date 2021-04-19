import entities.Animal;
import entities.Cow;
import entities.Dog;

public class App {

    public static void main(String[] args) throws Exception {
        System.out.println("----- Essentials----");
        Animal cat = new Animal("Moew", "cat");
        System.out.println( cat.toString() );

        Dog dog = new Dog();
        System.out.println(dog.toString());
        dog.doGuau();
        dog.doJump();

        Cow cow = new Cow();
        System.out.println(cow.toString());
        cow.doMu();
        cow.doWalk();
    }

}
