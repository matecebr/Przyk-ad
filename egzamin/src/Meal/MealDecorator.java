/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Meal;

/**
 *
 * @author LeopardProMK
 */
public class MealDecorator extends Meal {

    protected Meal bowl;

    public MealDecorator(Meal bowl) {
        this.bowl = bowl;
    }
    
    @Override
    public String getDescription() {
        return bowl.getDescription();
    }

    @Override
    public double getNutritionalValues() {
        return bowl.getNutritionalValues();
    }

    @Override
    public String toString() {
        return bowl.toString() + "+"; 
    }    
    
}
