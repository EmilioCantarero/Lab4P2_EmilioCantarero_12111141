package lab4p2_emiliocantarero_12111141;


public class IPesada extends Soldado{
    private Bomba b;

    public IPesada() {
        super();
    }

    public IPesada(String nombre, String rango, int edad, int tiempo, float vida) {
        super(nombre, rango, edad, tiempo, vida);
        this.b = new Bomba();
    }

    public Bomba getB() {
        return b;
    }

    public void setB(Bomba b) {
        this.b = b;
    }


    @Override
    public float ataque() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    
}
