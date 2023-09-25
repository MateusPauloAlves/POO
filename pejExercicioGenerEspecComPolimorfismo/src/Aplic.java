
import fatec.poo.model.PessoaFisica;
import fatec.poo.model.PessoaJuridica;
import java.text.DecimalFormat;

/**
 *
 * @author mateu
 */
public class Aplic {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("###0.00");
        PessoaFisica objPF = new PessoaFisica("555.444.333-21", "Jão", 8000);
        PessoaJuridica objPJ = new PessoaJuridica("101.999.888.777-66", "Lorax", 8000);
        
        objPF.addCompras(8000);
        objPF.addCompras(2000);
        objPF.addCompras(3000);
        objPF.setBase(400);
        
        System.out.println("Nome: " + objPF.getNome());
        System.out.println("CPF: " + objPF.getCPF());
        System.out.println("Valor Ano Inscrição: R$ " + df.format(objPF.getAnoInscricao()));
        System.out.println("Valor Compra Total: R$" + df.format(objPF.getTotalCompras()));
        System.out.println("Valor Base: R$ " + df.format(objPF.getBase()));
        System.out.println("Valor Bônus: R$ " + df.format(objPF.calcBonus(10000)));
        
        
        objPJ.addCompras(2000);
        objPJ.addCompras(2000);
        objPJ.addCompras(500);
        objPJ.setTaxaIncentivo(5);
        
        System.out.println("\n\nNome: " + objPJ.getNome());
        System.out.println("CPF: " + objPJ.getCGC());
        System.out.println("Valor Ano Inscrição: R$ " + df.format(objPJ.getAnoInscricao()));
        System.out.println("Valor Compra Total: R$" + df.format(objPJ.getTotalCompras()));
        System.out.println("Taxa Incentivo: " + objPJ.getTaxaIncentivo() + "%");
        System.out.println("Valor Bônus: R$ " + df.format(objPJ.calcBonus(10000)));
    }
    
}
