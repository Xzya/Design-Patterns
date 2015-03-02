package abstractfactory;


public class CreatorPisica implements IAnimalCreator {

    @Override
    public IAnimalApa createAnimalDeMare() {
        return new PisicaDeMare();
    }

    @Override
    public IAnimalPamant createAnimalDePamant() {
        return new Pisica();
    }

}
