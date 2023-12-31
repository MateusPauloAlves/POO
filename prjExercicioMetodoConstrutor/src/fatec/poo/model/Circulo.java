package fatec.poo.model;

/**
 *
 * @author 0030482211023
 */
public class Circulo {
    private String unidadeMedida;
    private double raio;
    
    public Circulo(String unidadeMedida){
        this.unidadeMedida = unidadeMedida;
    }
    
    public void setRaio(double r){
        raio = r;
    }
    
    public double getRaio(){
        return raio;
    }

    public String getUnidadeMedida() {
        return unidadeMedida;
    }
    
    public double calcArea(){
        return (Math.PI * Math.pow(raio, 2));
    }
    
    public double calcPerimetro(){
        return (2 * Math.PI * raio);
    }
    
    public double calcDiametro(){
        return (2 * raio);
    }
}
