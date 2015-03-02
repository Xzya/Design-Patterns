package factorymethod.program;

import factorymethod.clase.CaineCreator;
import factorymethod.clase.PisicaCreator;
import factorymethod.interfete.IAnimal;
import factorymethod.interfete.IAnimalCreator;

public class Main {
    
    public static void afiseaza(IAnimalCreator creator){
        IAnimal animal = creator.createObject();
        System.out.println(animal.vorbeste());
    }

    public static void main(String[] args) {
        afiseaza(new PisicaCreator());
        afiseaza(new CaineCreator());
    }

}
