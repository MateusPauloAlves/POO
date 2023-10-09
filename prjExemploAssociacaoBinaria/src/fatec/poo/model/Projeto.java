package fatec.poo.model;

/**
 *
 * @author mateu
 */
public class Projeto {
    private int codigo;
    private String descricao;
    private String dtInicio;
    private String dtTermino;
    
    private Funcionario[] funcionario; //multiplicidade 1..*
    private int numFunc;

    public Projeto(int codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
        
        funcionario = new Funcionario[3];
    }

    public void setDtInicio(String dtInicio) {
        this.dtInicio = dtInicio;
    }

    public void setDtTermino(String dtTermino) {
        this.dtTermino = dtTermino;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getDtInicio() {
        return dtInicio;
    }

    public String getDtTermino() {
        return dtTermino;
    }
    
    public void addFuncionario(Funcionario funcionario){
        this.funcionario[numFunc++] = funcionario;
    }
    
    public void listarFuncionarios(){
        System.out.println("\n\nCódigo: " + codigo);
        System.out.println("Desscricao: " + descricao);
        System.out.println("Data Ínicio: " + dtInicio);
        System.out.println("Data Término: " + dtTermino);
        System.out.println("Qtde. Funcionários: " + numFunc);
        System.out.println("\nRegistro:\tNome:\t\tCargo:\t\tDepartamento:");
        for(int i=0; i < numFunc; i++){
            System.out.println(funcionario[i].getRegistro() + "\t\t" + funcionario[i].getNome() 
                    + "\t" + funcionario[i].getCargo() + "\t" + funcionario[i].getDepartamento().getNome());
        }
    }
}
