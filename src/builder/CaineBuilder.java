package builder;


public class CaineBuilder implements ICaineBuilder {
    
    private String nume;
    private int varsta;
    private double greutate;
    private String culoare;
    private double inaltime;
    
    public CaineBuilder nume(String _nume) {
        nume = _nume;
        return this;
    }
    
    public CaineBuilder varsta(int _varsta) {
        varsta = _varsta;
        return this;
    }
    
    public CaineBuilder greutate(double _greutate) {
        greutate = _greutate;
        return this;
    }

    public CaineBuilder culoare(String _culoare) {
        culoare = _culoare;
        return this;
    }
    
    public CaineBuilder inaltime(double _inaltime) {
        inaltime = _inaltime;
        return this;
    }

    @Override
    public Caine build() {
        return new Caine(nume, varsta, greutate, culoare, inaltime);
    }
    
    
    
}
