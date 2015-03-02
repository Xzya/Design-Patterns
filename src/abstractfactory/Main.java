package abstractfactory;


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
