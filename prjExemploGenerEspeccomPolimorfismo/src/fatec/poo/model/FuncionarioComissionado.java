package fatec.poo.model;

/**
 *
 * @author 0030482211023
 */
public class FuncionarioComissionado extends Funcionario{
    private double salBase;
    private double taxaComissao; // em porcentagem. Exemplo: 5%
    private double totalVendas;

    public FuncionarioComissionado(int registro, String nome, String dtAdmissao, double taxaComissao) {
        super(registro, nome, dtAdmissao);
        this.taxaComissao = taxaComissao;
    }

    public void setSalBase(double salBase) {
        this.salBase = salBase;
    }

    public double getSalBase() {
        return salBase;
    }

    public double getTaxaComissao() {
        return taxaComissao;
    }

    public double getTotalVendas() {
        return totalVendas;
    }
    
    public void addVendas(double vendas) {
        this.totalVendas += vendas;
    }
    
    public double calcSalBruto() {
        return salBase + (taxaComissao/100 * totalVendas);
    }
    
    public double calcGratificacao() {
        if(totalVendas <= 5000){
            return 0;
        } else
            if(totalVendas <= 10000){
            return calcSalBruto() * 0.03;
        } else {
            return calcSalBruto() * 0.05;
            }
    }
    
    public double calcSalLiquido() {
        return super.calcSalLiquido() + calcGratificacao();
    }
}
