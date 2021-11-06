package lab4p2_emiliocantarero_12111141;


public class IPesada extends Soldado{
    private Bomba b;
    private double daño=150;
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
    public double ataque(Soldado rival) {
        if (rival instanceof iLigera){
            return daño*1.05;
        }
        return daño;
    }


    
}
