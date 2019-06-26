/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ZooSimulation;

import Meal.Meal;

/**
 *
 * @author student
 */
public class ToSeason {

    private String season = "";

    public Meal PrepareFood(String season, Meal bowl) {
        Seasons checkSeason = new Seasons();

        switch (season) {

            case "wiosna":
                checkSeason.Spring(bowl);
                break;
            case "lato":
                checkSeason.Summer(bowl);
                break;
            case "jesień":
                checkSeason.Autumn(bowl);
                break;
            case "zima":
                checkSeason.Winter(bowl);
                break;
            default:
                break;

        }
        return bowl;
    }

}
