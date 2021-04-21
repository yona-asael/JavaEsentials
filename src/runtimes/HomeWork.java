package runtimes;

import Corral.Corral;
import Corral.Donkey;
import Corral.FarmAnimal;
import Corral.Hen;
import Corral.Horse;

public class HomeWork {

    public static void run(boolean run) {
        if(run) {
            System.out.println("---------Home Work 1: The farm---------");
            FarmAnimal[] anims = {new Hen(), new Horse(), new Donkey()};
            Corral corral = new Corral( anims );
            corral.allWeight(); 
            corral.allNames();
            // System.out.println("The animal searched " + ( corral.findAnimal("Doby") ? "extists" : "not extists") );;
        }
    }
}
