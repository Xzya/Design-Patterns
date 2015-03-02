package adapter;

public class Main {
    
    private static void display(Thing thing) {
        System.out.println(thing.talk());
    }

    public static void main(String[] args) {
        
        Person person = new Person("Mike");
        Dog dog = new Dog();
        
        Thing dogAdapter = new DogAdapter(dog);
        
        display(person);
        display(dogAdapter);

    }

}
