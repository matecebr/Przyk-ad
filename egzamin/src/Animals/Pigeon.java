/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Animals;

import Meal.Meal;

/**
 *
 * @author student
 */
public class Pigeon extends Animal{

    public Pigeon() {
        super.setTypesOfFood(TypesOfFood.Herbivorous);
    }

    @Override
    public void Eat(Meal meal) {
        if (meal == null) {
            throw new UnsupportedOperationException("Brak utworzonego posiłku!");
        }
        System.out.println("Gołąb: "+meal.getDescription());
        super.levelOfHunger += meal.getNutritionalValues();
        System.out.println("Poziom głodu: "+super.levelOfHunger);
    }

    @Override
    public String toString() {
        return "Gołąb " + super.toString();
    }
}
