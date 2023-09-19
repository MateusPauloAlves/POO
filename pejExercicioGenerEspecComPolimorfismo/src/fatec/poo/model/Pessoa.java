package fatec.poo.model;

/**
 *
 * @author 0030482211023
 */
public abstract class Pessoa {
    private String Nome;
    private int AnoInscricao;
    private double TotalCompras;

    public Pessoa(String Nome, int AnoInscricao) {
        this.Nome = Nome;
        this.AnoInscricao = AnoInscricao;
    }
    
    abstract public double calcBonus(int a);
    
    public void addCompras(double compras){
        TotalCompras += compras;
    }

    public String getNome() {
        return Nome;
    }

    public int getAnoInscricao() {
        return AnoInscricao;
    }

    public double getTotalCompras() {
        return TotalCompras;
    }
    
}
