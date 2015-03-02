package simplefactory.program;

import simplefactory.clase.AnimalFactory;
import simplefactory.clase.Caine;
import simplefactory.clase.Hamster;
import simplefactory.clase.Pisica;
import simplefactory.interfete.Animal;

public class Main {

    public static void main(String[] args) {
        Animal animal;
        AnimalFactory animalFactory = new AnimalFactory();
        
        animal = animalFactory.createInstance(new Caine());
        System.out.println(animal.toString());
        
        animal = animalFactory.createInstance(new Pisica());
        System.out.println(animal.toString());
        
        animal = animalFactory.createInstance(new Hamster());
        System.out.println(animal.toString());
    }

}
