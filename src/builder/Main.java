package builder;


public class Main {

    public static void main(String[] args) {
        Dog caine1 = new DogBuilder().name("Azor")
                .color("Maro")
                .age(3)
                .build();
        System.out.println(caine1.toString());
        
        Dog caine2 = new DogBuilder().name("Max")
                .color("Alb")
                .age(5)
                .weight(3)
                .height(25)
                .build();
        System.out.println(caine2.toString());

    }

}
