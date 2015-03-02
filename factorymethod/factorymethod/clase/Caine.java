package factorymethod.clase;

import factorymethod.interfete.IAnimal;

public class Caine implements IAnimal {

    @Override
    public String vorbeste() {
        return "Ham";
    }

}
