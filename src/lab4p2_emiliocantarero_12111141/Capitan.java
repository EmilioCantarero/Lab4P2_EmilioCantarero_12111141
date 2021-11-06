package lab4p2_emiliocantarero_12111141;


public class Capitan extends Soldado{
    private Lanzallamas l;
    private double daño=110;

    public Capitan() {
        super();
    }

    public Capitan(String nombre, String rango, int edad, int tiempo, double vida) {
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
    public double ataque(Soldado rival) {
        if (rival instanceof iLigera){
            return daño*1.25;
        }else if(rival instanceof IPesada){
            return daño*1.20;
        }else if(rival instanceof Sargento){
            return daño*1.15;
        }
        return daño;
    }


    
}
