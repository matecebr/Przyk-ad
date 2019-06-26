/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ZooSimulation;

import java.util.Scanner;

/**
 *
 * @author LeopardProMK
 */
public class Client {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**
         * *********************************
         */
        IZooOperation myZoo = new Zoo();
        /**
         * ********* SYMULATOR ZOO *********
         */
        while (true) {
            int numberOfSelectedAction = generateMenu();
            runSelectedActions(myZoo, numberOfSelectedAction);
        }
        /**
         * *********************************
         */
    }

    static int generateMenu() {

        int numberOfSelectedAction;
        Scanner input = new Scanner(System.in);

        System.out.println("===========================================");
        System.out.println("|         MENU  SYMULATOR ZOO             |");
        System.out.println("===========================================");
        System.out.println("| Options:                                |");
        System.out.println("|        1. Dodaj nowe zwierze            |");
        System.out.println("|        2. Wyświetl wszystkie zwierzęta  |");
        System.out.println("|        3. Nakarm wybrane zwierze        |");
        System.out.println("|        4. Wyjście                       |");
        System.out.println("===========================================");

        numberOfSelectedAction = input.nextInt();
        return numberOfSelectedAction;
    }

    static void runSelectedActions(IZooOperation myZoo, int numberOfSelectedAction) {
        switch (numberOfSelectedAction) {
            case 1:// Dodaj nowe zwierze   
                myZoo.AddNewAnimal();
                break;
            case 2:// Wyświetl wszystkie zwierzęta 
                myZoo.ShowAllAnimals();
                break;
            case 3:// Nakarm wybrane zwierze   
                myZoo.GiveFoodToSelectedAnimal();
                break;
            case 4:// Wyjście
                System.exit(0);
        }
    }
}
