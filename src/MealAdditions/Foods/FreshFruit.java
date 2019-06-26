/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MealAdditions.Foods;

import Meal.Meal;
import Meal.MealDecorator;

/**
 *
 * @author LeopardProMK
 */
public class FreshFruit extends MealDecorator {

    public FreshFruit(Meal bowl) {
        super(bowl);
    }

    @Override
    public String getDescription() {
        return bowl.getDescription() + ", świeże owoce";
    }

    @Override
    public double getNutritionalValues() {
        return bowl.getNutritionalValues() + 5;
    }
}
