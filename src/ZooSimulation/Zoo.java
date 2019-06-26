package ZooSimulation;

import Animals.Animal;
import Animals.TypesOfFood;
import Animals.AnimalFactory.AnimalFactory;
import Animals.AnimalFactory.TypesOfAnimals;

import Meal.Meal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author LeopardProMK2
 */
public class Zoo implements IZooOperation {

    private List<Animal> allAnimals;

    public Zoo() {
        this.allAnimals = new ArrayList<Animal>();

        PrepareTestMockData();
    }

    /* Mock */
    void PrepareTestMockData() {
        this.allAnimals.add(AnimalFactory.Create( TypesOfAnimals.BearType));
        this.allAnimals.add(AnimalFactory.Create( TypesOfAnimals.GiraffeType));
        this.allAnimals.add(AnimalFactory.Create( TypesOfAnimals.LionType));
        this.allAnimals.add(AnimalFactory.Create( TypesOfAnimals.BearType));
    }

    @Override
    public void AddNewAnimal() {
        System.out.println("===========================================");
        System.out.println("|    Dodanie nowego zwierzęcia             |");
        System.out.println("===========================================");

        TypesOfAnimals typesOfAnimals = GetTypeOfAnimal();
        Animal newAnima = AnimalFactory.Create( typesOfAnimals);
        this.allAnimals.add(newAnima);
    }

    private TypesOfAnimals GetTypeOfAnimal() {
        Scanner input = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("Podaj typ zwierzęcia: ");
                String typesOfAnimalsStr = input.next();

                TypesOfAnimals typesOfAnimals = TypesOfAnimals.valueOf(typesOfAnimalsStr);

                return typesOfAnimals;

            } catch (java.lang.IllegalArgumentException exp) {
                System.out.println("Nie można stworzyć tego typu zwierzęcia!");
                ShowAvailableTypesOfAnimals();
            }
        }
    }

    private void ShowAvailableTypesOfAnimals() {
        System.out.println("Dostępne typy zwierząt:");
        TypesOfAnimals[] availableTypes = TypesOfAnimals.values();
        for (int i = 0; i < availableTypes.length; i++) {
            String info = String.format("\t%s", availableTypes[i]);
            System.out.println(info);
        }
        System.out.println("\n");
    }

    @Override
    public void ShowAllAnimals() {
        System.out.println("===========================================");
        System.out.println("|    Wyświetl wszystkie zwierzęta          |");
        System.out.println("===========================================");

        int countAnimals = this.allAnimals.size();
        for (int i = 0; i < countAnimals; i++) {
            System.out.println(this.allAnimals.get(i));
        }
    }

    @Override
    public void GiveFoodToSelectedAnimal() {
        System.out.println("===========================================");
        System.out.println("|    Nakarm wybrane zwierze               |");
        System.out.println("===========================================");

        int animaId = GetAnimalId();
        Animal animalToFeed = FindAnimalFromId(animaId);

        if (animalToFeed != null) {
            TypesOfFood typesOfFood = animalToFeed.getTypesOfFood();
            Meal bowl = PrepareFood(typesOfFood);
            animalToFeed.Eat(bowl);
        }
    }

    private int GetAnimalId() {
        System.out.println("Podaj ID zwierzęcia: ");
        Scanner input = new Scanner(System.in);
        int animaId = input.nextInt();
        return animaId;
    }

    private Animal FindAnimalFromId(int animaId) {
        Animal animalToFeed = null;

        int countAnimals = this.allAnimals.size();
        for (int i = 0; i < countAnimals; i++) {
            Animal animal = this.allAnimals.get(i);
            if (animal.getId() == animaId) {
                animalToFeed = animal;
            }
        }
        return animalToFeed;
    }

    private Meal PrepareFood(TypesOfFood typesOfFood) {

        Meal bowl = null;
        return bowl;
    }
}
