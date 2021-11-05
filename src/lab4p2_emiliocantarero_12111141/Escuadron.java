package lab4p2_emiliocantarero_12111141;

import java.util.ArrayList;

public class Escuadron {
    private String nombre;
    ArrayList<Soldado> soldados = new ArrayList();
    ArrayList<ZonaConquistada> zonas = new ArrayList();

    public Escuadron() {
    }

    public Escuadron(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Soldado> getSoldados() {
        return soldados;
    }

    public void setSoldados(ArrayList<Soldado> soldados) {
        this.soldados = soldados;
    }

    public ArrayList<ZonaConquistada> getZonas() {
        return zonas;
    }

    public void setZonas(ArrayList<ZonaConquistada> zonas) {
        this.zonas = zonas;
    }

    @Override
    public String toString() {
        return "Escuadron: "+ nombre + ", zona: " + zonas.get(0).getNombre() + "\n";
                
    }
    
    
}
