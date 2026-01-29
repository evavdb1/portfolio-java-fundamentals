package org.evavdb1.forestnotebook;
import org.evavdb1.forestnotebook.entities.animal_entities.*;
import org.evavdb1.forestnotebook.entities.plant_entities.*;
import org.evavdb1.forestnotebook.service.ForestNoteBook;

public class NatureApp {
    public static void main(String[] args) {
// create notebook
        ForestNoteBook notebook01 = new ForestNoteBook();

// create plants and add to notebook
        Tree oak = new Tree("Oak", 35, LeafType.HAND );
        notebook01.addPlant(oak);
        Flower cactus = new Flower("Cactus", 0.35, Scent.SWEET);
        notebook01.addPlant(cactus);
        Flower dandelion = new Flower("Dandelion", 0.20, Scent.EARTHY);
        notebook01.addPlant(dandelion);
        Weed grass = new Weed("Grass", 0.40, 20);
        notebook01.addPlant(grass);
        Bush blackberry = new Bush("Blackberry", 1.50, "berries", LeafType.HAND );
        notebook01.addPlant(blackberry);
        Tree eucalyptus = new Tree("Eucalyptus", 3.50, LeafType.HEART);
        notebook01.addPlant(eucalyptus);
        Bush bamboo = new Bush("Bamboo", 4.00, "no fruit", LeafType.SPEAR);
        notebook01.addPlant(bamboo);

//create animals and add to notebook
        Herbivore camel = new Herbivore("Camel", 500, 180, 2.50);
        camel.addPlantToDiet(grass);
        camel.addPlantToDiet(cactus);
        notebook01.addAnimal(camel);
        Herbivore goat = new Herbivore("Goat", 50, 70, 0.90);
        goat.addPlantToDiet(grass);
        goat.addPlantToDiet(dandelion);
        goat.addPlantToDiet(oak);
        notebook01.addAnimal(goat);
        Herbivore koala = new Herbivore("Koala", 13, 40, 0.70);
        koala.addPlantToDiet(eucalyptus);
        notebook01.addAnimal(koala);
        Omnivore panda = new Omnivore("Panda", 130, 80, 1.70 );
        panda.addPlantToDiet(bamboo);
        panda.setMaxFoodSize(0.5);
        notebook01.addAnimal(panda);
        Omnivore bear = new Omnivore("Bear", 300, 120, 2.00);
        bear.addPlantToDiet(blackberry);
        bear.setMaxFoodSize(60);
        notebook01.addAnimal(bear);
        Omnivore crow = new Omnivore("Crow",1, 45, 1.00 );
        crow.addPlantToDiet(cactus);
        crow.setMaxFoodSize(0.1);
        notebook01.addAnimal(crow);
        Carnivore anaconda = new Carnivore("Anaconda", 250, 40, 9.00);
        anaconda.setMaxFoodSize(150);
        notebook01.addAnimal(anaconda);
        Carnivore lion = new Carnivore("Lion",200, 110,2.00 );
        lion.setMaxFoodSize(30);
        notebook01.addAnimal(lion);
        Carnivore cat = new Carnivore("Cat", 3.00, 24, 0.70);
        cat.setMaxFoodSize(0.5);
        notebook01.addAnimal(cat);

// print count and notebook
        System.out.println("Total animals seen: " + notebook01.getAnimalCount());
        System.out.println("Total plants seen: " + notebook01.getPlantCount());
        System.out.println();
        System.out.println(" *** The notebook *** ");
        System.out.println();
        notebook01.printNoteBook();

// print plants and carnivores, herbivores and omnivores
        System.out.println("----------     ----------");
        notebook01.printNames();

// sort animals and plans to name and print
        notebook01.sortAnimalsByName();
        notebook01.sortPlantsByName();
        System.out.println();
        System.out.println("----------     ----------");
        System.out.println(" - sorted by name - ");
        notebook01.printNoteBook();

// sort plants and animals to height and print
        notebook01.sortAnimalsByHeight();
        notebook01.sortPlantsByHeight();
        System.out.println();
        System.out.println(" - sorted bij height - ");
        notebook01.printNoteBook();

    }
}
