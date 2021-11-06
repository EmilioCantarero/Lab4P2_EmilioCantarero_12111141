
package lab4p2_emiliocantarero_12111141;

public abstract class Soldado {
    private String nombre, rango;
    private int edad, tiempo;
    private double vida;

    public Soldado() {
    }

    public Soldado(String nombre, String rango, int edad, int tiempo, double vida) {
        this.nombre = nombre;
        this.rango = rango;
        this.edad = edad;
        this.tiempo = tiempo;
        this.vida = vida;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRango() {
        return rango;
    }

    public void setRango(String rango) {
        this.rango = rango;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    public double getVida() {
        return vida;
    }

    public void setVida(double vida) {
        this.vida = vida;
    }

    @Override
    public String toString() {
        return rango +" "+ nombre + ", edad: " + edad + " años" + ", vida: " + vida + "\n";
    }
    
    public abstract double ataque(Soldado rival);
    
    
}
