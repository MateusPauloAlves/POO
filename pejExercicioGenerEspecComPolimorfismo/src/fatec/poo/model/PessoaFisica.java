package fatec.poo.model;

/**
 *
 * @author 0030482211023
 */
public class PessoaFisica extends Pessoa{
   private String CPF;
   private double Base;

    public PessoaFisica(String CPF, String Nome, int AnoInscricao) {
        super(Nome, AnoInscricao);
        this.CPF = CPF;
    }
   
   public double calcBonus(int a){
       return;
   }

    public String getCPF() {
        return CPF;
    }

    public void setBase(double Base) {
        this.Base = Base;
    }

    public double getBase() {
        return Base;
    }
   
}
