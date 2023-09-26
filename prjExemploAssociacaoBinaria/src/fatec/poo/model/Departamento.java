
package fatec.poo.model;

/**
 *
 * @author 0030482211023
 */
public class Departamento {
    private String sigla;
    private String nome;
    private Funcionario[] funcionarios; //multiplicidade 1..*
    private int numFunc;

    public Departamento(String sigla, String nome) {
        this.sigla = sigla;
        this.nome = nome;
        funcionarios = new Funcionario[3];
    }

    public String getSigla() {
        return sigla;
    }

    public String getNome() {
        return nome;
    }
    
    public void addFuncionario(Funcionario funcionario){
        this.funcionarios[numFunc++] = funcionario;
    }
    
    public void listarFuncionarios(){
        System.out.println("\n\nSigla: " + sigla);
        System.out.println("Nome: " + nome);
        System.out.println("Qtde. Funcionários: " + numFunc);
        System.out.println("Qtde. Funcionários: " + numFunc);
        System.out.println("\nRegistro:\tNome:\t\tCargo:");
        for(int i=0; i < numFunc; i++){
            System.out.println(funcionarios[i].getRegistro() + "\t\t" + funcionarios[i].getNome() + "\t" + funcionarios[i].getCargo());
        }
    }
}
