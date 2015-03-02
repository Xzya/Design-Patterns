package adapter;

public class Person implements Thing {
    
    private String name;
    
    public Person(String _name) {
        name = _name;
    }

    @Override
    public String talk() {
        return "Hi, I'm " + name + ".";
    }

}
