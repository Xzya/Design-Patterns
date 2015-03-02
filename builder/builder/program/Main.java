package builder.program;

import builder.clase.Caine;
import builder.clase.CaineBuilder;

public class Main {

    public static void main(String[] args) {
        Caine caine1 = new CaineBuilder().nume("Azor")
                .culoare("Maro")
                .varsta(3)
                .build();
        System.out.println(caine1.toString());
        
        Caine caine2 = new CaineBuilder().nume("Max")
                .culoare("Alb")
                .varsta(5)
                .greutate(3)
                .inaltime(25)
                .build();
        System.out.println(caine2.toString());

    }

}
