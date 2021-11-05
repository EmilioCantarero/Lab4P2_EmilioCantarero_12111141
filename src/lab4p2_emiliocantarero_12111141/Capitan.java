package lab4p2_emiliocantarero_12111141;


public class Capitan extends Soldado{
    private Lanzallamas l;

    public Capitan() {
        super();
    }

    public Capitan(String nombre, String rango, int edad, int tiempo, float vida) {
        super(nombre, rango, edad, tiempo, vida);
        this.l = new Lanzallamas();
    }

    public Lanzallamas getL() {
        return l;
    }

    public void setL(Lanzallamas l) {
        this.l = l;
    }


    @Override
    public float ataque() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    
}
