package singleton;

public class Dog {

    private String name;
    private int age;
    private double weight;
    private String color;
    private int height;

    private static Dog instance = null;

    private Dog(String name, int age, double weight, String color,
            int height) {
        super();
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.color = color;
        this.height = height;
    }

    public static Dog getInstance() {
        if (instance == null){
            synchronized (Dog.class) {
                if (instance == null){
                    instance = new Dog("Azorel",
                            3,
                            4.5,
                            "Alb",
                            30
                            );
                }
            }
        }
        return instance;
    }
    
    @Override
    public String toString() {
        return "Caine [name=" + name + ", age=" + age + ", weight="
                + weight + ", color=" + color + ", height=" + height
                + "]";
    }

    public static void main(String[] args) {
        Dog caine1 = Dog.getInstance();
        System.out.println(caine1.toString());
        Dog caine2 = Dog.getInstance();
        System.out.println(caine2.toString());
    }
}
