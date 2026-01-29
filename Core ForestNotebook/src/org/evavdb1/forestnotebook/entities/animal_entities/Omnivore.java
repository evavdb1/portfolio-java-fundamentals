package org.evavdb1.forestnotebook.entities.animal_entities;
import org.evavdb1.forestnotebook.entities.plant_entities.Plant;
import java.util.HashSet;
import java.util.Set;

public class Omnivore extends Animal {

    private Set<Plant> plantDiet;
    private double maxFoodSize;

    public Omnivore(String name) {
        super(name);
        this.plantDiet = new HashSet<>();;
        this.maxFoodSize = maxFoodSize;
    }

    public Omnivore(String name, double weight, double height, double length) {
        super(name, weight, height, length);
        this.plantDiet = new HashSet<>();;
        this.maxFoodSize = maxFoodSize;
    }

    public Set<Plant> getPlantDiet() {        return plantDiet;    }
    public void setPlantDiet(Set<Plant> plantDiet) {        this.plantDiet = plantDiet;    }
    public double getMaxFoodSize() {        return maxFoodSize;    }
    public void setMaxFoodSize(double maxFoodSize) {        this.maxFoodSize = maxFoodSize;    }

    public void addPlantToDiet(Plant plant) {
        plantDiet.add(plant);
    }

    @Override
    public String toString() {
        return super.getName() + ", "+ super.getHeight() + " cm high, this omnivore is on a plant and meat diet, the max weight of meat is: " + maxFoodSize + "kg";
    }
}
