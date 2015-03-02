package builder;


public class DogBuilder implements IDogBuilder {
    
    private String name;
    private int age;
    private double weight;
    private String color;
    private double height;
    
    public DogBuilder name(String _name) {
        name = _name;
        return this;
    }
    
    public DogBuilder age(int _age) {
        age = _age;
        return this;
    }
    
    public DogBuilder weight(double _weight) {
        weight = _weight;
        return this;
    }

    public DogBuilder color(String _color) {
        color = _color;
        return this;
    }
    
    public DogBuilder height(double _height) {
        height = _height;
        return this;
    }

    @Override
    public Dog build() {
        return new Dog(name, age, weight, color, height);
    }
    
    
    
}
