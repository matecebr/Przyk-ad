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
public class VitaminCoctail extends MealDecorator{
   
    
     public VitaminCoctail(Meal bowl) {
        super(bowl);
    }

   
     
     

    public String getDescription() {
        return bowl.getDescription() + ", koktajl witaminowy";
    }

    public double getNutritionalValues() {
        return bowl.getNutritionalValues() + 40;
    }
}
