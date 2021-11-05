package lab4p2_emiliocantarero_12111141;


public class Bomba {
    private float daño=150;
    private final String nombre="Bomba";

    public Bomba() {
    }

    public float getDaño() {
        return daño;
    }

    public void setDaño(float daño) {
        this.daño = daño;
    }

    @Override
    public String toString() {
        return "Bomba{" + "da\u00f1o=" + daño + ", nombre=" + nombre + '}';
    }
    
    
}
