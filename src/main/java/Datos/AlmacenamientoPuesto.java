
package Datos;

import Logico.Puestos;
import java.util.ArrayList;

/**
 *
 * @author Andrés
 */
public class AlmacenamientoPuesto {
    private ArrayList<Puestos> listaPuestos;

    public AlmacenamientoPuesto() {
        this.listaPuestos = new ArrayList();
        
        
    }

    public ArrayList<Puestos> getListaPuesto() {
        return listaPuestos;
    }

    public void setListaPuesto(ArrayList<Puestos> listaPuesto) {
        this.listaPuestos = listaPuesto;
    }
    
    //Métodos del CRUD
    
    public void insertarPuesto(Puestos puesto){
        if (this.listaPuestos != null){
            this.listaPuestos.add(puesto);
        }
    }
    
    public void editarPuesto(int index, Puestos newPuesto){
        if (index >= 0 && newPuesto != null && !listaPuestos.isEmpty()){
            this.listaPuestos.set(index, newPuesto);
        }
    }
    
    public boolean eliminarPuesto(Puestos puesto){
        if(this.listaPuestos.contains(puesto)){
            this.listaPuestos.remove(puesto);
            return true;
        }
        return false; //
    }
    
    
    
}
