package builder.clase;

public class Caine {
    
    private String nume;
    private int varsta;
    private double greutate;
    private String culoare;
    private double inaltime;
    
    public Caine() {
        this("Azorel", 3, 4.5, "Alb", 30);
    }
    
    public Caine(String nume, int varsta, double greutate, String culoare,
            double inaltime) {
        super();
        this.nume = nume;
        this.varsta = varsta;
        this.greutate = greutate;
        this.culoare = culoare;
        this.inaltime = inaltime;
    }

    @Override
    public String toString() {
        return "Caine [nume=" + nume + ", varsta=" + varsta + ", greutate="
                + greutate + ", culoare=" + culoare + ", inaltime=" + inaltime
                + "]";
    }

}
