package abstractfactory.program;

import abstractfactory.clase.CreatorCal;
import abstractfactory.clase.CreatorPisica;
import abstractfactory.interfete.IAnimalApa;
import abstractfactory.interfete.IAnimalCreator;
import abstractfactory.interfete.IAnimalPamant;

public class Main {
    
    private static void afisare(IAnimalCreator creator) {
        IAnimalPamant animalDePamant = creator.createAnimalDePamant();
        IAnimalApa animalDeApa = creator.createAnimalDeMare();
        
        System.out.println(animalDePamant.descriere());
        System.out.println(animalDeApa.descriere());
    }

    public static void main(String[] args) {
        afisare(new CreatorCal());
        afisare(new CreatorPisica());
    }

}
