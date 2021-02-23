package heranca2;


public class AlunoEAD extends Aluno{
    
    private float descontoMensalidade;
    
    @Override
    public void calculoMedia(){
        super.calculoMedia();
        if (getMedia() >= 6){
            System.out.println("Aprovado");
        }else{
            System.out.println("Reprovado");
        }
        
    }

    public float getDescontoMensalidade() {
        return descontoMensalidade;
    }

    public void setDescontoMensalidade(float descontoMensalidade) {
        this.descontoMensalidade = descontoMensalidade;
    }
    
    
    public static void main(String[] args) {
        AlunoEAD objAluno = new AlunoEAD();
        objAluno.setNota1(5.5f);
        objAluno.setNota2(6);
        objAluno.calculoMedia();
        
    }
}
