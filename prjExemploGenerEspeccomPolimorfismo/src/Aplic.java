
import fatec.poo.model.FuncionarioHorista;
import fatec.poo.model.FuncionarioMensalista;
import java.text.DecimalFormat;

/**
 *
 * @author 0030482211023
 */
public class Aplic {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#,##0.00");
        FuncionarioHorista funcHor = new FuncionarioHorista(1010, "Pedro Silveira", "14/05/1978", 15.80);
        
        funcHor.setQtdeHorTrab(90);
        funcHor.setCargo("Programador");
        
        System.out.println("Funcionario: " + funcHor.getRegistro() + "|| Nome: " + funcHor.getNome() + 
                "|| Data de Admissão: " + funcHor.getDtAdmissao() + "|| Cargo: " + funcHor.getCargo());
        System.out.println("Salario Bruto       => " + df.format(funcHor.calcSalBruto()));
        System.out.println("Gratificacao        => " + df.format(funcHor.calcGratificacao()));
        System.out.println("Desconto            => " + df.format(funcHor.calcDesconto()));
        System.out.println("Salario Liquido     => " + df.format(funcHor.calcSalLiquido()));
        
        
        FuncionarioMensalista funcMen = new FuncionarioMensalista(2020, "Tutancâmon", "06/01/1341 a.c.", 15.80);
        
        funcMen.setNumSalMin(80);
        funcMen.setCargo("Engenheiro");
        
        System.out.println("\n\nFuncionario: " + funcMen.getRegistro() + "|| Nome: " + funcMen.getNome() + 
                "|| Data de Admissão: " + funcMen.getDtAdmissao() + "|| Cargo: " + funcMen.getCargo());
        System.out.println("Salario Bruto       => " + df.format(funcMen.calcSalBruto()));
        System.out.println("Desconto            => " + df.format(funcMen.calcDesconto()));
        System.out.println("Salario Liquido     => " + df.format(funcMen.calcSalLiquido()));
    }
    
}
