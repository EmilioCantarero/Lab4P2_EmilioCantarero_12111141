package lab4p2_emiliocantarero_12111141;


public class SuperSoldado extends Soldado{
    private ArmaBlanca a;
    private Bomba b;
    private Escopeta e;
    private Lanzallamas l;
    
    
    public SuperSoldado() {
        super();
    }

    public SuperSoldado(String nombre, String rango, int edad, int tiempo) {
        super(nombre, rango, edad, tiempo, 1000);
        this.a=new ArmaBlanca();
        this.b=new Bomba();
        this.e=new Escopeta();
        this.l=new Lanzallamas();
    }

    public ArmaBlanca getA() {
        return a;
    }

    public void setA(ArmaBlanca a) {
        this.a = a;
    }

    public Bomba getB() {
        return b;
    }

    public void setB(Bomba b) {
        this.b = b;
    }

    public Escopeta getE() {
        return e;
    }

    public void setE(Escopeta e) {
        this.e = e;
    }

    public Lanzallamas getL() {
        return l;
    }

    public void setL(Lanzallamas l) {
        this.l = l;
    }

    @Override
    public double ataque(Soldado rival) {
        return 0;
    }


    
    
}
