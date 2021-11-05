package lab4p2_emiliocantarero_12111141;

import java.util.ArrayList;
import javax.swing.JOptionPane;


public class Lab4P2_EmilioCantarero_12111141 {
static ArrayList<Escuadron> escuadrones = new ArrayList();
 
    public static void main(String[] args) {
        
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
                }else if(escuadrones.get(opc).getSoldados().get(i) instanceof IPesada){
                    salida=salida+escuadrones.get(opc).getSoldados().get(i)+ "\n";
                }else if(escuadrones.get(opc).getSoldados().get(i) instanceof Sargento){
                    salida=salida+escuadrones.get(opc).getSoldados().get(i)+ "\n";
                }else if(escuadrones.get(opc).getSoldados().get(i) instanceof Capitan){
                    salida=salida+escuadrones.get(opc).getSoldados().get(i)+ "\n";
                }else if(escuadrones.get(opc).getSoldados().get(i) instanceof SuperSoldado){
                    salida=salida+escuadrones.get(opc).getSoldados().get(i)+ "\n";
                }
            }
            JOptionPane.showMessageDialog(null, salida);
        }
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

    }
    static void ataque(){
        
    }
    
}
