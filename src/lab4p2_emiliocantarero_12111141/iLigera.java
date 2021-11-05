package lab4p2_emiliocantarero_12111141;


public class iLigera extends Soldado{
    private ArmaBlanca a;
    private int daño=50;
    public iLigera() {
        super();
    }

    public iLigera(String nombre, String rango, int edad, int tiempo, float vida) {
        super(nombre, rango, edad, tiempo, vida);
        this.a=new ArmaBlanca();
    }

    public ArmaBlanca getA() {
        return a;
    }

    public void setA(ArmaBlanca a) {
        this.a = a;
    }

    @Override
    public String toString() {
        return super.toString()+"iLigera{" + "a=" + a + '}';
    }

    @Override
    public float ataque() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    
    
    
}
