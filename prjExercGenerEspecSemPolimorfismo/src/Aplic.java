
import fatec.poo.model.Cliente;
import fatec.poo.model.Instrutor;

/**
 *
 * @author mateu
 */
public class Aplic {
    public static void main(String[] args) {
        
        //instanciação de um objeto da classe Aluno
        Instrutor objInstrutor = new Instrutor(1010, "Carlos Silveira", "(11) 98748-7675");
        
        objInstrutor.setAreaAtuacao("Vendedor de Carros");
        System.out.println("Indentificação: " + objInstrutor.getIndentificacao());
        System.out.println("Nome: " + objInstrutor.getNome());
        System.out.println("Telefone: " + objInstrutor.getTelefone());
        System.out.println("Área de Atuação: " + objInstrutor.getAreaAtuacao());
        
        
        //instanciação de um objeto da classe Professor
        Cliente objCliente = new Cliente("888.777.666-55", "Munas", "(11) 97463-2738");
        
        objCliente.setAltura(1.75);
        objCliente.setPeso(88.43);
        System.out.println("\n\nCPF: " + objCliente.getCpf());
        System.out.println("Nome: " + objCliente.getNome());
        System.out.println("Telefone: " + objCliente.getTelefone());
        System.out.println("Altura: " + objCliente.getAltura() + "m");
        System.out.println("Peso: " + objCliente.getPeso() + "kg");
    }
    
}
