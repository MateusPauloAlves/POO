
import fatec.poo.model.Cliente;
import fatec.poo.model.Instrutor;
import java.text.DecimalFormat;

/**
 *
 * @author mateu
 */
public class Aplic {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.0");
        
        //instanciação de um objeto da classe Aluno
        Instrutor objInstrutor = new Instrutor(1010, "Carlos Silveira", "(11) 98748-7675");
        
        objInstrutor.setEmail("carlos.silveira@istrutor.com");
        objInstrutor.setAreaAtuacao("Vendedor de Carros");
        System.out.println("Indentificação: " + objInstrutor.getIndentificacao());
        System.out.println("Nome: " + objInstrutor.getNome());
        System.out.println("Telefone: " + objInstrutor.getTelefone());
        System.out.println("Área de Atuação: " + objInstrutor.getAreaAtuacao());
        System.out.println("E-mail: " + objInstrutor.getEmail());
        
        
        //instanciação de um objeto da classe Professor
        Cliente objCliente = new Cliente("888.777.666-55", "Munas", "(11) 97463-2738");
        
        objCliente.setAltura(1.75);
        objCliente.setPeso(88.43);
        objCliente.setEmail("munas.zerobala@cliente.com");
        System.out.println("\n\nCPF: " + objCliente.getCpf());
        System.out.println("Nome: " + objCliente.getNome());
        System.out.println("Telefone: " + objCliente.getTelefone());
        System.out.println("Altura: " + df.format(objCliente.getAltura()) + " m");
        System.out.println("Peso: " + df.format(objCliente.getPeso()) + " Kg");
        System.out.println("IMC: " + df.format(objCliente.calcIMC()) + " Kg/m²");
        System.out.println("E-mail: " + objCliente.getEmail());
    }
    
}
