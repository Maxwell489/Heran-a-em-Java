
package heranca2;

import javax.swing.JOptionPane;


public class Professor {
   private float salario;
   private String numeroRegistro;

    public Professor(float salario, String numeroRegistro) {
        this.salario = salario;
        this.numeroRegistro = numeroRegistro;
    }

    public Professor() {
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public String getNumeroRegistro() {
        return numeroRegistro;
    }

    public void setNumeroRegistro(String numeroRegistro) {
        this.numeroRegistro = numeroRegistro;
    }

    @Override
    public String toString() {
        return "Professor{" + "salario=" + salario + ", numeroRegistro=" + numeroRegistro + '}';
    }
   
}
