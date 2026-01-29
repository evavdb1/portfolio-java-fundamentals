package org.evavdb1.forestnotebook.entities.animal_entities;
import org.evavdb1.forestnotebook.entities.plant_entities.Plant;
import java.util.HashSet;
import java.util.Set;

public class Herbivore extends Animal {

    private Set<Plant> plantDiet;

    public Herbivore(String name) {
        super(name);
        this.plantDiet = new HashSet<>();
    }

    public Herbivore(String name, double weight, double height, double length) {
        super(name, weight, height, length);
        this.plantDiet = new HashSet<>();
    }

    public Set<Plant> getPlantDiet() {        return plantDiet;    }
    public void setPlantDiet(Set<Plant> plantDiet) {        this.plantDiet = plantDiet;    }

    public void addPlantToDiet(Plant plant) {
        plantDiet.add(plant);
        }

    public void printDiet() {
        if (plantDiet.isEmpty()) {
            System.out.println("plant diet is empty");
        } else {
            System.out.print("plant diet: ");
            for (Plant plant : plantDiet) {
                System.out.print(plant.getName() + " ");
            }
        }
    }

    @Override
    public String toString() {
        return getName() +", "+ getHeight() + " cm high, this herbivore is on a plant diet";
    }
}
