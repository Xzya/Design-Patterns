package factorymethod;


public class Main {
    
    public static void display(IAnimalCreator creator){
        IAnimal animal = creator.createObject();
        System.out.println(animal.makeSound());
    }

    public static void main(String[] args) {
        display(new CatCreator());
        display(new DogCreator());
    }

}
