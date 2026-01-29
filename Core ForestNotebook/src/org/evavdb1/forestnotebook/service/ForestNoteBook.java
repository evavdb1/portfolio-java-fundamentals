package org.evavdb1.forestnotebook.service;
import org.evavdb1.forestnotebook.entities.animal_entities.*;
import org.evavdb1.forestnotebook.entities.plant_entities.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ForestNoteBook {

    private List<Carnivore> carnivores = new ArrayList<>();
    private List<Omnivore> omnivores = new ArrayList<>();
    private List<Herbivore> herbivores = new ArrayList<>();

    private int plantCount = 0;
    private int animalCount = 0;

    private List<Animal> animals = new ArrayList<>();
    private List<Plant> plants = new ArrayList<>();


    public ForestNoteBook() {    }


    public List<Carnivore> getCarnivores() {        return carnivores;    }
    public void setCarnivores(List<Carnivore> carnivores) {        this.carnivores = carnivores;    }
    public List<Omnivore> getOmnivores() {        return omnivores;    }
    public void setOmnivores(List<Omnivore> omnivores) {        this.omnivores = omnivores;    }
    public List<Herbivore> getHerbivores() {        return herbivores;    }
    public void setHerbivores(List<Herbivore> herbivores) {        this.herbivores = herbivores;    }
    public List<Plant> getPlants() {        return plants;    }

    public int getPlantCount() {        return plantCount;    }
    public int getAnimalCount() {        return animalCount;    }


    public void addAnimal(Animal animal) {
        if (!animals.contains(animal)) {
            animals.add(animal);
            animalCount++;

            if (animal instanceof Carnivore) {
                carnivores.add((Carnivore) animal);
            } else if (animal instanceof Omnivore) {
                omnivores.add((Omnivore) animal);
            } else if (animal instanceof Herbivore) {
                herbivores.add((Herbivore) animal);
            }
        }
    }

    public void addPlant(Plant plant) {
        if (!plants.contains(plant)) {
            plants.add(plant);
            plantCount++;
        }
    }

    public void printNoteBook() {
        System.out.println("Animals: ");
        for (Animal animal : animals) {
            System.out.println(animal);
        }
        System.out.println();
        System.out.println("Plants: ");
        for (Plant plant : plants) {
            System.out.println(plant);
        }
    }
    public void printNames() {
        System.out.print("\nlist of plants: ");
        for (Plant plant : getPlants()) {
            System.out.print(plant.getName() + " ");
        }
        System.out.print("\nlist of carnivores: " );
        for (Carnivore carnivore : getCarnivores()) {
            System.out.print(carnivore.getName() + " ");
        }
        System.out.print("\nlist of herbivores: " );
        for (Herbivore herbivore : getHerbivores()) {
            System.out.print(herbivore.getName() + " ");
        }
        System.out.print("\nlist of omnivores: " );
        for (Omnivore omnivore : getOmnivores()) {
            System.out.print(omnivore.getName() + " ");
        }
        System.out.println();
    }

    public void sortAnimalsByName() {
        animals.sort(Comparator.comparing(Animal::getName));
    }

    public void sortPlantsByName() {
        plants.sort(Comparator.comparing(Plant::getName));
    }

    public void sortAnimalsByHeight() {
        animals.sort(Comparator.comparingDouble((Animal::getHeight)));
    }

    public void sortPlantsByHeight() {
        plants.sort(Comparator.comparingDouble((Plant::getHeight)));
    }
}
