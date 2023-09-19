
import fatec.poo.model.FuncionarioComissionado;
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
        
        
        FuncionarioComissionado funcCom = new FuncionarioComissionado(3030, "Marcão", "06/01/2000", 5);
        
        funcCom.setSalBase(1200);
        funcCom.setCargo("Madereiro");
        funcCom.addVendas(8000);
        funcCom.addVendas(1500);
        funcCom.addVendas(500);

        System.out.println("\n\nFuncionario: " + funcCom.getRegistro() + "|| Nome: " + funcCom.getNome() + 
                "|| Data de Admissão: " + funcCom.getDtAdmissao() + "|| Cargo: " + funcCom.getCargo());
        System.out.println("Total Vendas        => " + funcCom.getTotalVendas());
        System.out.println("Taxa Comissão       => " + funcCom.getTaxaComissao() + "%");
        System.out.println("Total Vendas        => " + funcCom.getTotalVendas());
        System.out.println("Salario Bruto       => " + df.format(funcCom.calcSalBruto()));
        System.out.println("Gratificacao        => " + df.format(funcCom.calcGratificacao()));
        System.out.println("Desconto            => " + df.format(funcCom.calcDesconto()));
        System.out.println("Salario Liquido     => " + df.format(funcCom.calcSalLiquido()));
    }
    
}
