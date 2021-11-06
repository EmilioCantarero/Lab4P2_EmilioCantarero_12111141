package lab4p2_emiliocantarero_12111141;

import java.util.ArrayList;
import javax.swing.JOptionPane;


public class Lab4P2_EmilioCantarero_12111141 {
static ArrayList<Escuadron> escuadrones = new ArrayList();
static ArrayList<ZonaConquistada> zonas=new ArrayList();
    public static void main(String[] args) {
        
        escuadrones.add(new Escuadron("Alfa"));
        escuadrones.get(0).getZonas().add(new ZonaConquistada("Paris", 150, 75, 80));
        escuadrones.get(0).getSoldados().add(new iLigera("Juan", "Soldado Raso", 30, 5, 125));
        escuadrones.get(0).getSoldados().add(new iLigera("Ramiro", "Teniente", 34, 7, 150));
        escuadrones.get(0).getSoldados().add(new Sargento("Pedro", "Teniente", 28, 8, 175));
        
        escuadrones.add(new Escuadron("Bravo"));
        escuadrones.get(1).getZonas().add(new ZonaConquistada("Roma", 200, 79, 23));
        escuadrones.get(1).getSoldados().add(new iLigera("Paco", "Soldado Raso", 21, 2, 100));
        escuadrones.get(1).getSoldados().add(new Capitan("Alexa", "Capitan", 31, 10, 200));
        escuadrones.get(1).getSoldados().add(new Sargento("Sebastian", "Cabo", 28, 5, 150));
        
        
        int opcion=20;
        while (opcion != 0) {
            try {
                opcion = menu();
                if (opcion == 1) {
                    crearZona();
                } else if (opcion == 2) {
                    listarZonas();
                } else if (opcion == 3) {
                    crearEscuadron();
                } else if (opcion == 4) {
                    listarEscuadrones();
                } else if (opcion == 5) {
                    eliminarEscuadron();
                } else if (opcion == 6) {
                    añadirSoldado();
                } else if (opcion == 7) {
                    listarSoldados();
                } else if (opcion == 8) {
                    listarSoldadosTipo();
                } else if (opcion == 9) {
                    eliminarSoldado();
                } else if (opcion == 10) {
                    pelea();
                }
            } catch (Exception NumberFormatException) {
                JOptionPane.showMessageDialog(null, "Entrada no valida");
            }

        }
        
        
    }
    
    static int menu(){
        int opcion;
            opcion=Integer.parseInt(JOptionPane.showInputDialog
            ("0- Salir\n"+
            "1- Crear zona\n"+
            "2- Listar zonas\n"+
            "3- Crear escuadron\n"+
            "4- Listar escuadrones\n"+
            "5- Eliminar escuadron\n"+
            "6- Añadir soldado a escuadron\n"+
            "7- Listar soldados de escuadron\n"+
            "8- Listar soldados de escuadron por tipo\n"+
            "9- Eliminar soldados de escuadron\n"+
            "10- Pelear"));
        return opcion;
    }
    
    static void crearZona(){
        String n;
        int t, x, y;
        n=JOptionPane.showInputDialog("Nombre de la zona");
        t=Integer.parseInt(JOptionPane.showInputDialog("Tamano"));
        x=Integer.parseInt(JOptionPane.showInputDialog("Coordenada en X"));
        y=Integer.parseInt(JOptionPane.showInputDialog("Coordenada en Y"));
        zonas.add(new ZonaConquistada(n, t, x, y));
    }
    static void listarZonas(){
        String salida="";
        for (int i = 0; i < escuadrones.size(); i++) {
            salida=salida+escuadrones.get(i).getZonas() + "\n";
        }
        JOptionPane.showMessageDialog(null, salida);
    }
    
    static void crearEscuadron(){
        String n;
        n=JOptionPane.showInputDialog("Nombre del escuadron");
        escuadrones.add(new Escuadron(n));
        escuadrones.get(escuadrones.size()-1).getZonas().add(asignarZona());
    }
    
    static ZonaConquistada asignarZona(){
        int opc=Integer.parseInt(JOptionPane.showInputDialog("Asigne una zona a este escuadron"));
        return zonas.get(opc);
    }
    static void listarEscuadrones(){
        String salida="";
        for (int i = 0; i < escuadrones.size(); i++) {
            salida=salida+escuadrones.get(i);
        }
        JOptionPane.showMessageDialog(null, salida);
    }
    
    static void eliminarEscuadron(){
        int opc=Integer.parseInt(JOptionPane.showInputDialog("Escuadron que desea eliminar"));
        escuadrones.remove(opc);
        JOptionPane.showMessageDialog(null, "Escuadron eliminado exitosamente   ");
    }
    static void añadirSoldado(){
        
        int opc=Integer.parseInt(JOptionPane.showInputDialog("Escuadron al que deseas agregar\n "
                + "un nuevo soldado"));
        
        String n, r;
        int e, t;
        float v;
        
        n=JOptionPane.showInputDialog("Nombre");
        r=JOptionPane.showInputDialog("Rango");
        e=Integer.parseInt(JOptionPane.showInputDialog("Edad"));
        t=Integer.parseInt(JOptionPane.showInputDialog("Tiempo en el ejercito"));
        v=Float.parseFloat(JOptionPane.showInputDialog("Vida"));
        
        int tipo=menuSoldados();
        if (tipo==0){
            escuadrones.get(opc).getSoldados().add(new iLigera(n, r, e, t, v));
        }else if(tipo==1){
            escuadrones.get(opc).getSoldados().add(new IPesada(n, r, e, t, v));
        }else if(tipo==2){
            escuadrones.get(opc).getSoldados().add(new Sargento(n, r, e, t, v));
        }else if(tipo==3){
            escuadrones.get(opc).getSoldados().add(new Capitan(n, r, e, t, v));
        }else if(tipo==4){
            escuadrones.get(opc).getSoldados().add(new SuperSoldado(n, r, e, t));
        }
    }
    static int menuSoldados(){
        int opcion;
            opcion=Integer.parseInt(JOptionPane.showInputDialog
            ("0- Infanteria ligera\n"+
             "1- Infanteria pesada\n"+
             "2- Sargento\n"+
             "3- Capitan\n"+
             "4- Super soldado"));
        return opcion;
    }
    static void  listarSoldados(){
        int opc=opc=Integer.parseInt(JOptionPane.showInputDialog
            ("Escuadron que deseas listar"));
        String salida="";
        for (int i=0; i<escuadrones.get(opc).getSoldados().size(); i++){
            salida=salida+escuadrones.get(opc).getSoldados().get(i);
        }
        JOptionPane.showMessageDialog(null, salida);
    }
    
    static void listarSoldadosTipo(){
        int opc=opc=Integer.parseInt(JOptionPane.showInputDialog
            ("Escuadron que deseas listar"));
        int tipo=tipo=Integer.parseInt(JOptionPane.showInputDialog
            ("Tipo de soldado que deseas listar\n"+
                    "1- Infanteria ligera\n"+
                    "2- Infanteria pesada\n"+
                    "3- Sargento\n"+
                    "4- Capitan\n"+
                    "5- Super Soldado"));
        String salida="";
        
        if (tipo==1){
            for (int i = 0; i < escuadrones.get(opc).getSoldados().size(); i++) {
                if (escuadrones.get(opc).getSoldados().get(i) instanceof iLigera){
                    salida=salida+escuadrones.get(opc).getSoldados().get(i) + "\n";
                }
            }
        }else if (tipo==2){    
            for (int i = 0; i < escuadrones.get(opc).getSoldados().size(); i++) {
                if(escuadrones.get(opc).getSoldados().get(i) instanceof IPesada){
                    salida=salida+escuadrones.get(opc).getSoldados().get(i)+ "\n";
                }
            }
        }else if(tipo==3){   
            for (int i = 0; i < escuadrones.get(opc).getSoldados().size(); i++) {
                if(escuadrones.get(opc).getSoldados().get(i) instanceof Sargento){
                    salida=salida+escuadrones.get(opc).getSoldados().get(i)+ "\n";
                }
            }
        }else if(tipo==4){
            for (int i = 0; i < escuadrones.get(opc).getSoldados().size(); i++) {
                if(escuadrones.get(opc).getSoldados().get(i) instanceof Capitan){
                    salida=salida+escuadrones.get(opc).getSoldados().get(i)+ "\n";
                }
            }
        }else if(tipo==5){
            for (int i = 0; i < escuadrones.get(opc).getSoldados().size(); i++) {
                if(escuadrones.get(opc).getSoldados().get(i) instanceof SuperSoldado){
                    salida=salida+escuadrones.get(opc).getSoldados().get(i)+ "\n";
                    
                }
            }
        }
            JOptionPane.showMessageDialog(null, salida);
        
    }
    static void eliminarSoldado(){
        int opc=Integer.parseInt(JOptionPane.showInputDialog
            ("Elige el escuadron"));
        
        int opc1=Integer.parseInt(JOptionPane.showInputDialog
            ("Posicion del soldado a eliminar"));
        
        escuadrones.get(opc).getSoldados().remove(opc1);
    }
    
    static void pelea(){
        JOptionPane.showMessageDialog(null,"Elija los escuadrones que lucharan");
        
        int e1=Integer.parseInt(JOptionPane.showInputDialog("Escuadron 1(La zona de este escuadron entrara en disputa)"));
        int e2=Integer.parseInt(JOptionPane.showInputDialog("Escuadron 2"));
        
        JOptionPane.showMessageDialog(null,"Elija ahora el soldado que luchara primero");
        int s1=Integer.parseInt(JOptionPane.showInputDialog("Soldado escuadron 1"));
        int s2=Integer.parseInt(JOptionPane.showInputDialog("Soldado escuadron 2"));
        
        atacar(e1, e2, s1, s2);

    }
    static void atacar(int e1, int e2, int s1, int s2){
        while (escuadrones.get(e1).getSoldados().size()>0 && escuadrones.get(e2).getSoldados().size()>0){
            
            JOptionPane.showMessageDialog(null, "El " + escuadrones.get(e1).getSoldados().get(s1).getRango() 
                    + " " + escuadrones.get(e1).getSoldados().get(s1).getNombre() +
                    " ataco al "+ escuadrones.get(e2).getSoldados().get(s2).getRango()+ " "+
                    escuadrones.get(e2).getSoldados().get(s2).getNombre() + " haciendole " +
                    escuadrones.get(e1).getSoldados().get(s1).ataque(escuadrones.get(e2).getSoldados().get(s2)) + " puntos de daño");
            
            escuadrones.get(e2).getSoldados().get(s2).setVida(escuadrones.get(e2).getSoldados().get(s2).getVida()-escuadrones.get(e1).getSoldados().get(s1).ataque(escuadrones.get(e2).getSoldados().get(s2)));
            JOptionPane.showMessageDialog(null,escuadrones.get(e2).getSoldados().get(s2).getVida() );
            
            if (escuadrones.get(e2).getSoldados().get(s2).getVida() <= 0) {
                JOptionPane.showMessageDialog(null, "El " + escuadrones.get(e2).getSoldados().get(s2).getRango()
                        + " " + escuadrones.get(e2).getSoldados().get(s2).getNombre() + " ha muerto");
                escuadrones.get(e2).getSoldados().remove(s2);
                if (escuadrones.get(e2).getSoldados().size() > 0) {
                    int opcion = Integer.parseInt(JOptionPane.showInputDialog("Que desea hacer\n"
                            + "1- Enviar otro soldado\n"
                            + "2- Huir"));

                    if (opcion == 1) {

                        JOptionPane.showMessageDialog(null, "El siguiente soldado llega al campo de combate");
                        s2 = 0;
                    } else if (opcion == 2) {
                        JOptionPane.showMessageDialog(null, "Has huido, la zona que disputabas se mantiene en manos de tu rival");
                        escuadrones.get(e1).getZonas().add(escuadrones.get(e2).getZonas().get(0));
                        escuadrones.get(e2).getZonas().remove(0);
                        break;
                    } 
                }
            }
            
            
          JOptionPane.showMessageDialog(null, "El " + escuadrones.get(e2).getSoldados().get(s2).getRango() 
                    + " " + escuadrones.get(e2).getSoldados().get(s2).getNombre() +
                    " ataco al "+ escuadrones.get(e1).getSoldados().get(s1).getRango()+ " "+
                    escuadrones.get(e1).getSoldados().get(s1).getNombre() + " haciendole " +
                    escuadrones.get(e2).getSoldados().get(s2).ataque(escuadrones.get(e1).getSoldados().get(s1)) + " puntos de daño");
            
            escuadrones.get(e1).getSoldados().get(s1).setVida(escuadrones.get(e1).getSoldados().get(s1).getVida()-escuadrones.get(e2).getSoldados().get(s2).ataque(escuadrones.get(e1).getSoldados().get(s1)));  
            if (escuadrones.get(e1).getSoldados().get(s1).getVida() <= 0) {
                JOptionPane.showMessageDialog(null, "El " + escuadrones.get(e1).getSoldados().get(s1).getRango()
                        + " " + escuadrones.get(e1).getSoldados().get(s1).getNombre() + " ha muerto");
                escuadrones.get(e1).getSoldados().remove(s1);
                if (escuadrones.get(e1).getSoldados().size() > 0) {
                    int opcion = Integer.parseInt(JOptionPane.showInputDialog("Que desea hacer\n"
                            + "1- Enviar otro soldado\n"
                            + "2- Huir"));

                    if (opcion == 1) {

                        JOptionPane.showMessageDialog(null, "El siguiente soldado llega al campo de combate");
                        s1 = 0;
                    } else if (opcion == 2) {
                        JOptionPane.showMessageDialog(null, "Has huido, la zona en disputa pasa a manos de tu rival");
                        escuadrones.get(e2).getZonas().add(escuadrones.get(e1).getZonas().get(0));
                        escuadrones.get(e1).getZonas().remove(0);
                        break;
                    } 
                }
            }
            
            
            }
        if (escuadrones.get(e1).getSoldados().isEmpty()){
                JOptionPane.showMessageDialog(null, "El escuadron" + " " + escuadrones.get(e1).getNombre() + " ha sido aniquilado");
                
                JOptionPane.showMessageDialog(null, "La zona que controlaban pasa a manos del escuadron " + escuadrones.get(e2).getNombre());
                escuadrones.get(e2).getZonas().add(escuadrones.get(e1).getZonas().get(0));
                escuadrones.get(e1).getZonas().remove(0);
                escuadrones.remove(e1);
                
            
        }else if(escuadrones.get(e2).getSoldados().isEmpty()){
            JOptionPane.showMessageDialog(null, "El escuadron" + " " +  escuadrones.get(e2).getNombre() + " ha sido aniquilado");
            escuadrones.remove(e2);
                JOptionPane.showMessageDialog(null, "Mantienes la zona en disputa");

        }
    }
    
}
