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
 * @author student
 */
public class Rice extends MealDecorator{
    
    public Rice(Meal bowl) {
        super(bowl);
    }
    @Override
    public String getDescription() {
        return bowl.getDescription() + ", ryż";
    }

    @Override
    public double getNutritionalValues() {
        return bowl.getNutritionalValues() + 1000;
    }
}
