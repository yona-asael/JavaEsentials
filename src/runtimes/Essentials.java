package runtimes;

import entities.Animal;
import entities.CarLight;
import entities.Cow;
import entities.Dog;
import entities.DomesticLight;
import entities.Light;
import entities.Response;

public class Essentials {

    public static void run(Boolean run) {
        if (run) {
            System.out.println("----- Essentials----");
            Animal cat = new Animal("Moew", "cat");
            System.out.println(cat.toString());

            Dog dog = new Dog();
            System.out.println(dog.toString());
            dog.doGuau();
            dog.doJump();

            Cow cow = new Cow();
            System.out.println(cow.toString());
            cow.doMu();
            cow.doWalk();

            CarLight carLight = new CarLight("High");
            carLight.turnOnTheLight();

            Light light = (Light) carLight;
            light.turnOnTheLight();

            DomesticLight domesticLight = new DomesticLight("High");
            domesticLight.turnOnTheLight();

            Light dLight = (Light) domesticLight;
            dLight.turnOnTheLight();
            
            Response<Cow> response = new Response<>(cow, "My dog", "200");
            System.out.println(response.toString());
        }
    }
}
