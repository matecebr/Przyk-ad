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
public abstract class Animal {

    private TypesOfFood typesOfFood;
    private static int lastId = 0;
    private int id;

    public TypesOfFood getTypesOfFood() {
        return typesOfFood;
    }

    protected void setTypesOfFood(TypesOfFood typesOfFood) {
        this.typesOfFood = typesOfFood;
    }

    public int getId() {
        return id;
    }

    protected int healthLevel;
    protected int levelOfHunger;

    public Animal() {
        this.healthLevel = 100;
        this.levelOfHunger = 100;

        this.id = lastId;
        lastId++;
    }

    public abstract void Eat(Meal meal);

    @Override
    public String toString() {
        return String.format("ID: %d\n\ttyp pokarmu: %s\n\tpoziom zdrowia: %d\n\tpoziom głodu: %d",
                this.id,
                this.typesOfFood,
                this.healthLevel,
                this.levelOfHunger);
    }
}
