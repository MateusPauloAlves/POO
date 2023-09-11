package fatec.poo.model;

/**
 *
 * @author 0030482211023
 */
public class Aluno extends Pessoa {
    private int regEscolar;
    private double mensalidade;

    public Aluno(int regEscolar, String nome, String dataNascimento) {
        super(nome, dataNascimento);  // chamado do método construtor da supper class Pessoa
        this.regEscolar = regEscolar;
    }

    public void setMensalidade(double mensalidade) {
        this.mensalidade = mensalidade;
    }

    public double getMensalidade() {
        return mensalidade;
    }

    public int getRegEscolar() {
        return regEscolar;
    }
   
}
