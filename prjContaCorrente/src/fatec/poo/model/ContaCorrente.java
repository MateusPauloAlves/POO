package fatec.poo.model;

/**
 *
 * @author mateu
 */
public class ContaCorrente {
    private int numero;
    private double saldo;
    
    public ContaCorrente(int numero){
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }
    
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }
    
    public void sacar(double saldo){
        this.saldo -= saldo;
    }
    
    public void depositar(double saldo){
        this.saldo += saldo;
    }
    
}
