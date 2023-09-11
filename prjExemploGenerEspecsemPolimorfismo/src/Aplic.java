
import fatec.poo.model.Aluno;
import fatec.poo.model.Professor;
import java.text.DecimalFormat;

/**
 *
 * @author 0030482211023
 */
public class Aplic {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#,##0.00");
        
        //instanciação de um objeto da classe Aluno
        Aluno objAluno = new Aluno(1010, "Carlos Silveira", "15/03/1978");
        
        objAluno.setMensalidade(1500);
        System.out.println("Registro Escolar: " + objAluno.getRegEscolar());
        System.out.println("Nome: " + objAluno.getNome());
        System.out.println("Data Nascimento: " + objAluno.getDataNascimento());
        System.out.println("Mensalidade: " + df.format(objAluno.getMensalidade()));
        
        
        //instanciação de um objeto da classe Professor
        Professor objProfessor = new Professor(9090, "Munas", "01/01/0001");
        
        objProfessor.setSalario(1500);
        System.out.println("\n\nRegistro Escolar: " + objProfessor.getRegFuncional());
        System.out.println("Nome: " + objProfessor.getNome());
        System.out.println("Data Nascimento: " + objProfessor.getDataNascimento());
        System.out.println("Mensalidade: " + df.format(objProfessor.getSalario()));
    }
    
}
