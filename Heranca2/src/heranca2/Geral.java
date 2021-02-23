
package heranca2;


public class Geral {


    public static void main(String[] args) {
        AlunoEAD objAlunoEAD = new AlunoEAD();
        objAlunoEAD.setNome("Max");
        objAlunoEAD.setIdade(18);
        objAlunoEAD.setNota1(3.75f);
        objAlunoEAD.setNota2(2.99f);
        objAlunoEAD.setPeso(98.34f);
        objAlunoEAD.setRGM("237228");
        
        System.out.println("A Media é" + objAlunoEAD.getMedia());
        
        objAlunoEAD.calculoMedia();
        
        System.out.println("A Media é" + objAlunoEAD.getMedia());
        
        if(objAlunoEAD.getMedia()>=6){
            System.out.println("Aprovado");
        }else{
            System.out.println("Reprovado");
        }
            
        
        
    }
    
}
