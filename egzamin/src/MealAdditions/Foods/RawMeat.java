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
public class RawMeat  extends MealDecorator{
    
    public RawMeat(Meal bowl) {
        super(bowl);
    }
    @Override
    public String getDescription() {
        return bowl.getDescription() + ", świeże mięso";
    }

    @Override
    public double getNutritionalValues() {
        return bowl.getNutritionalValues() + 10;
    }
}
