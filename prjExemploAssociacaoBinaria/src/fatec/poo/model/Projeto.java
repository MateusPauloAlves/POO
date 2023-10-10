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
    
    private Funcionario[] funcionarios; //multiplicidade 1..*
    private int numFunc;

    public Projeto(int codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
        
        funcionarios = new Funcionario[3];
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
        this.funcionarios[numFunc++] = funcionario;
    }
    
    public void listarFuncionarios(){
        System.out.println("\n\nCódigo: " + codigo);
        System.out.println("Desscricao: " + descricao);
        System.out.println("Data Ínicio: " + dtInicio);
        System.out.println("Data Término: " + dtTermino);
        System.out.println("Qtde. Funcionários: " + numFunc);
        System.out.println("\nRegistro:\tNome:\t\tCargo:\t\tDepartamento:");
        for(int i=0; i < numFunc; i++){
            System.out.println(funcionarios[i].getRegistro() + "\t\t" + funcionarios[i].getNome() 
                    + "\t" + funcionarios[i].getCargo() + "\t" + funcionarios[i].getDepartamento().getNome());
        }
    }
}
