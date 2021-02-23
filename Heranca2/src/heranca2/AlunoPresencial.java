
package heranca2;


public class AlunoPresencial extends Aluno{
    
    private String DiasdeAula;
    private String horarioAula;

    public String getDiasdeAula() {
        return DiasdeAula;
    }

    public void setDiasdeAula(String DiasdeAula) {
        this.DiasdeAula = DiasdeAula;
    }

    public String getHorarioAula() {
        return horarioAula;
    }

    public void setHorarioAula(String horarioAula) {
        this.horarioAula = horarioAula;
    }
    
}
