
package lab4p2_emiliocantarero_12111141;


public class Escopeta {
    private float daño=140;
    private final String nombre="Escopeta";

    public Escopeta() {
    }

    public float getDaño() {
        return daño;
    }

    public void setDaño(float daño) {
        this.daño = daño;
    }

    @Override
    public String toString() {
        return "Escopeta{" + "da\u00f1o=" + daño + ", nombre=" + nombre + '}';
    }
    
    
}
