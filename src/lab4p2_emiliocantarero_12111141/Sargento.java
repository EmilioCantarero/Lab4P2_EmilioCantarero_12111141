package lab4p2_emiliocantarero_12111141;


public class Sargento extends Soldado{
    private Escopeta e;

    public Sargento() {
        super();
    }

    public Sargento(String nombre, String rango, int edad, int tiempo, float vida) {
        super(nombre, rango, edad, tiempo, vida);
        this.e = new Escopeta();
    }

    public Escopeta getE() {
        return e;
    }

    public void setE(Escopeta e) {
        this.e = e;
    }

    @Override
    public String toString() {
        return super.toString()+"Sargento{" + "e=" + e + '}';
    }

    @Override
    public float ataque() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

 
    
    
}
