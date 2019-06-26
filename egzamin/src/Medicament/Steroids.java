/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Medicament;

import Meal.Meal;
import Meal.MealDecorator;

/**
 *
 * @author student
 */
public class Steroids extends MealDecorator{
    
    public Steroids(Meal bowl) {
        super(bowl);
    }
    @Override
    public String getDescription() {
        return bowl.getDescription() + ", sterydy";
    }

    @Override
    public double getNutritionalValues() {
        return bowl.getNutritionalValues() + 50;
    }
    
}
