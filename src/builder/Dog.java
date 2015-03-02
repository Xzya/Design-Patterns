package builder;

public class Dog {
    
    private String name;
    private int age;
    private double weight;
    private String color;
    private double height;
    
    public Dog() {
        this("Azorel", 3, 4.5, "Alb", 30);
    }
    
    public Dog(String name, int age, double weight, String color,
            double height) {
        super();
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.color = color;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Caine [name=" + name + ", age=" + age + ", weight="
                + weight + ", color=" + color + ", height=" + height
                + "]";
    }

}
