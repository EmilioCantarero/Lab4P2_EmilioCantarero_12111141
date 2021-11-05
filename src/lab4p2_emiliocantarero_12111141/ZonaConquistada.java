package lab4p2_emiliocantarero_12111141;


public class ZonaConquistada {
    private String nombre;
    private int tam, cX, cY;

    public ZonaConquistada() {
    }

    public ZonaConquistada(String nombre, int tam, int cX, int cY) {
        this.nombre = nombre;
        this.tam = tam;
        this.cX = cX;
        this.cY = cY;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTam() {
        return tam;
    }

    public void setTam(int tam) {
        this.tam = tam;
    }

    public int getcX() {
        return cX;
    }

    public void setcX(int cX) {
        this.cX = cX;
    }

    public int getcY() {
        return cY;
    }

    public void setcY(int cY) {
        this.cY = cY;
    }

    @Override
    public String toString() {
        return "ZonaConquistada{" + "nombre=" + nombre + ", tam=" + tam + ", cX=" + cX + ", cY=" + cY + '}';
    }
    
    
}
