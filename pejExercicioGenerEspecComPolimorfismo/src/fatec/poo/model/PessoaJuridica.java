package fatec.poo.model;

/**
 *
 * @author 0030482211023
 */
public class PessoaJuridica extends Pessoa{
    private String CGC;
    private double TaxaIncentivo;

    public PessoaJuridica(String CGC, String Nome, int AnoInscricao) {
        super(Nome, AnoInscricao);
        this.CGC = CGC;
    }
    
    public double calcBonus(int valorAnoAtual){
        return (this.TaxaIncentivo/100 * super.getTotalCompras()) * (valorAnoAtual - super.getAnoInscricao());
    }

    public void setTaxaIncentivo(double TaxaIncentivo) {
        this.TaxaIncentivo = TaxaIncentivo;
    }

    public String getCGC() {
        return CGC;
    }

    public double getTaxaIncentivo() {
        return TaxaIncentivo;
    }
}
