
package Logico;

import java.time.LocalDate;

/**
 *
 * @author Andrés
 */
public class Colaborador {
    private int Cedula;
    private String nombre;
    private LocalDate fechaNac;
    private LocalDate fechaIngreso;
    private LocalDate fechaDespedida;
    private String direccion;
    private int telefono;
    private String email;
    private Puestos Puesto;
    private int cedJefe;

    public Colaborador(int Cedula, String nombre, LocalDate fechaNac, LocalDate fechaIngreso, LocalDate fechaDespedida, String direccion, int telefono, String email, Puestos Puesto, int cedJefe) {
        this.Cedula = Cedula;
        this.nombre = nombre;
        this.fechaNac = fechaNac;
        this.fechaIngreso = fechaIngreso;
        this.fechaDespedida = fechaDespedida;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
        this.Puesto = Puesto;
        this.cedJefe = cedJefe;
    }
    
      public Colaborador() {
        this.Cedula = 0;
        this.nombre = "";
        this.fechaNac = null;
        this.fechaIngreso = null;
        this.fechaDespedida = null;
        this.direccion = "";
        this.telefono = 0;
        this.email = "";
        this.Puesto = null;
        this.cedJefe = 0;
    }

    public int getCedula() {
        return Cedula;
    }

    public void setCedula(int Cedula) {
        this.Cedula = Cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(LocalDate fechaNac) {
        this.fechaNac = fechaNac;
    }

    public LocalDate getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(LocalDate fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public LocalDate getFechaDespedida() {
        return fechaDespedida;
    }

    public void setFechaDespedida(LocalDate fechaDespedida) {
        this.fechaDespedida = fechaDespedida;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Puestos getPuesto() {
        return Puesto;
    }

    public void setPuesto(Puestos Puesto) {
        this.Puesto = Puesto;
    }

    public int getCedJefe() {
        return cedJefe;
    }

    public void setCedJefe(int cedJefe) {
        this.cedJefe = cedJefe;
    }
    
    
}
