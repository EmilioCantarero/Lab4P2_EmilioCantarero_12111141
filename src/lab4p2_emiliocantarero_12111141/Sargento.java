package lab4p2_emiliocantarero_12111141;


public class Sargento extends Soldado{
    private Escopeta e;
    private int daño=140;

    public Sargento() {
        super();
    }

    public Sargento(String nombre, String rango, int edad, int tiempo, double vida) {
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
    public double ataque(Soldado rival) {
        if (rival instanceof IPesada){
            return daño*1.10;
        }else if (rival instanceof iLigera){
            return daño*1.15;
        }
        return daño;
    }

 
    
    
}
