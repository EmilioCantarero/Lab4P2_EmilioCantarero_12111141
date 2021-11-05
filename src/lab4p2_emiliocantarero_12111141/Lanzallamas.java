package lab4p2_emiliocantarero_12111141;


public class Lanzallamas {
    private float daño=110;
    private final String nombre="Lanzallamas";

    public Lanzallamas() {
    }

    public float getDaño() {
        return daño;
    }

    public void setDaño(float daño) {
        this.daño = daño;
    }

    @Override
    public String toString() {
        return "Lanzallamas{" + "daño=" + daño + ", nombre=" + nombre + '}';
    }
    
    
}
