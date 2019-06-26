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
public class Meal {

    protected String description;
    protected int nutritionalValues = 0; // wartości odżywcze

    public String getDescription() {
        return description;
    }

    public double getNutritionalValues() {
        return nutritionalValues;
    }

    public Meal() {
        this.description = "w misce: ";
        this.nutritionalValues = 0;
    }

    @Override
    public String toString() {
        return "wartość odżywcza: " + getNutritionalValues() + "(" + getDescription() + ")";
    }
}
