
package Datos;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class GrupoPersonas {
    
    public ArrayList<Persona> Personas =new ArrayList<Persona>();
    public GrupoPersonas(){
        
    }
    
    public void AgregarPersona(String nombre,int edad){
        Persona p;
        p = new Persona(nombre,edad);
        Personas.add(p);
    }
    public void ImprimirDatos(){
        for (int i = 0; i < Personas.size(); i++) {
        JOptionPane.showMessageDialog(null, " El nombre capturado es "
        +Personas.get(i).getNombre()+"\n La edad de esta persona es = "+Personas.get(i).getEdad()
        , "Mensaje", JOptionPane.PLAIN_MESSAGE);
            
        }
            
        }
    public void validar(){
        
        
    }
    
    
}
