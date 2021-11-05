
package lab4p2_emiliocantarero_12111141;


public class ArmaBlanca {
    private float daño=50;
    private final String nombre="Arma Blanca";

    public ArmaBlanca() {
    }

    public float getDaño() {
        return daño;
    }

    public void setDaño(float daño) {
        this.daño = daño;
    }

    @Override
    public String toString() {
        return "ArmaBlanca{" + "da\u00f1o=" + daño + ", nombre=" + nombre + '}';
    }

    
    
    
}
