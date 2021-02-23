
package heranca2;

public class Aluno extends Pessoa{
    private float nota1;
    private float nota2;
    private String RGM;
    private float Media;
    
    public Aluno(float nota1, float nota2, String RGM) {
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.RGM = RGM;
        Media = 0;
    }

    public Aluno() {
    
    }

    public float getNota1() {
        return nota1;
    }

    public void setNota1(float nota1) {
        this.nota1 = nota1;
    }

    public float getNota2() {
        return nota2;
    }

    public void setNota2(float nota2) {
        this.nota2 = nota2;
    }

    public String getRGM() {
        return RGM;
    }

    public void setRGM(String RGM) {
        this.RGM = RGM;
    }

    @Override
    public String toString() {
        return "Aluno{" + "nota1=" + nota1 + ", nota2=" + nota2 + ", RGM=" + RGM + '}';
    }
    
    public void calculoMedia(){
        Media = ((nota1 + nota2) / 2);
    }

    public float getMedia() {
        return Media;
    }

    public void setMedia(float Media) {
        this.Media = Media;
    }
    
    public static void main(String[] args) {
     
    }
    
}
