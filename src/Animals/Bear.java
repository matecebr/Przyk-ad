/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Animals;

import Meal.Meal;

/**
 *
 * @author LeopardProMK
 */
public class Bear extends Animal {

    public Bear() {
        super.setTypesOfFood(TypesOfFood.Omnivorous);
    }

    @Override
    public void Eat(Meal bowl) {
        if (bowl == null) {
            throw new UnsupportedOperationException("Brak utworzonego posiłku!");
        }
        System.out.println("Niedźwiedź zjada: " + bowl.getDescription());
        super.levelOfHunger += bowl.getNutritionalValues();
        System.out.println("Poziom głodu: " + super.levelOfHunger);
    }

    @Override
    public String toString() {
        return "Niedźwiedź " + super.toString();
    }
}
