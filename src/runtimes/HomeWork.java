package runtimes;

import Corral.Corral;
import Corral.Donkey;
import Corral.FarmAnimal;
import Corral.Hen;
import Corral.Horse;

public class HomeWork {

    public static void run() {
        System.out.println("---------Home Work 1: The farm---------");
        FarmAnimal[] anims = {new Hen(), new Horse(), new Donkey()};
        Corral corral = new Corral( anims );
        corral.allWeight();
    }
}
