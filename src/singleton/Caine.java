package singleton;

public class Caine {

    private String nume;
    private int varsta;
    private double greutate;
    private String culoare;
    private int inaltime;

    private static Caine instance = null;

    private Caine(String nume, int varsta, double greutate, String culoare,
            int inaltime) {
        super();
        this.nume = nume;
        this.varsta = varsta;
        this.greutate = greutate;
        this.culoare = culoare;
        this.inaltime = inaltime;
    }

    public static Caine getInstance() {
        if (instance == null){
            synchronized (Caine.class) {
                if (instance == null){
                    instance = new Caine("Azorel",
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
        return "Caine [nume=" + nume + ", varsta=" + varsta + ", greutate="
                + greutate + ", culoare=" + culoare + ", inaltime=" + inaltime
                + "]";
    }

    public static void main(String[] args) {
        Caine caine1 = Caine.getInstance();
        System.out.println(caine1.toString());
        Caine caine2 = Caine.getInstance();
        System.out.println(caine2.toString());
    }
}
