/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Animals.AnimalFactory;

import Animals.Animal;
import Animals.Bear;
import Animals.Giraffe;
import Animals.Gorilla;
import Animals.Lion;

/**
 *
 * @author LeopardProMK
 */
public class AnimalFactory {

     public static Animal Create(TypesOfAnimals typesOfAnimals) {
        Animal animal = null;
        switch (typesOfAnimals) {
            case BearType:
                animal = new Bear();
                break;
            case GiraffeType:
                animal = new Giraffe();
                break;
            case GorillaType:
                animal = new Gorilla();
                break;
            case LionType:
                animal = new Lion();
                break;
            default:
                break;
        }
        return animal;
    }
}
