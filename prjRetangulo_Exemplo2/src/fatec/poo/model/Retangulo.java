package fatec.poo.model;

/**
 * @author 0030482211007
 */
public class Retangulo {
    private double altura;
    private double base;

            
    public void setAltura(double a){
    altura = a;
    }
    public void setBase(double b){
    base = b;
    }
    public double calcArea(){
    return(base * altura);
    }
    public double calcPerimetro(){
    return(2*(base+altura));
    }            
}