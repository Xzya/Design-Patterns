package simplefactory;


public class Main {

    public static void main(String[] args) {
        Animal animal;
        AnimalFactory animalFactory = new AnimalFactory();
        
        animal = animalFactory.createInstance(new Dog());
        System.out.println(animal.toString());
        
        animal = animalFactory.createInstance(new Cat());
        System.out.println(animal.toString());
        
        animal = animalFactory.createInstance(new Hamster());
        System.out.println(animal.toString());
    }

}
