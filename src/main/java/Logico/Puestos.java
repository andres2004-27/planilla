
package Logico;

/**
 *
 * @author Andrés
 */
public class Puestos {
    private int idPuesto;
    private String nomPuesto;
    private double Salario;

    public Puestos(int idPuesto, String nomPuesto, double Salario) {
        this.idPuesto = idPuesto;
        this.nomPuesto = nomPuesto;
        this.Salario = Salario;
    }
    public Puestos() {
        this.idPuesto = 0;
        this.nomPuesto = "";
        this.Salario = 0;
        
    
}

    public int getIdPuesto() {
        return idPuesto;
    }

    public void setIdPuesto(int idPuesto) {
        this.idPuesto = idPuesto;
    }

    public String getNomPuesto() {
        return nomPuesto;
    }

    public void setNomPuesto(String nomPuesto) {
        this.nomPuesto = nomPuesto;
    }

    public double getSalario() {
        return Salario;
    }

    public void setSalario(double Salario) {
        this.Salario = Salario;
    }
}
