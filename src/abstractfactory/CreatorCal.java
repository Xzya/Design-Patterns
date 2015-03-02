package abstractfactory;


public class CreatorCal implements IAnimalCreator {

    @Override
    public IAnimalApa createAnimalDeMare() {
        return new CalDeMare();
    }

    @Override
    public IAnimalPamant createAnimalDePamant() {
        return new Cal();
    }

}
