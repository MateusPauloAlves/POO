package fatec.poo.model;

/**
 *
 * @author mateu
 */
public class Instrutor extends Pessoa{
    private int indentificacao;
    private String areaAtuacao;

    public Instrutor(int indentificacao, String nome, String telefone) {
        super(nome, telefone);
        this.indentificacao = indentificacao;
    }

    public void setAreaAtuacao(String areaAtuacao) {
        this.areaAtuacao = areaAtuacao;
    }

    public int getIndentificacao() {
        return indentificacao;
    }

    public String getAreaAtuacao() {
        return areaAtuacao;
    }
    
}
