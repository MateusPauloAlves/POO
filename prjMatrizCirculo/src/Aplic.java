
import fatec.poo.model.Circulo;
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author 0030482211023
 */
public class Aplic {
    public static void main(String[] args) {
       DecimalFormat df = new DecimalFormat("0.0");
       Scanner entrada = new Scanner(System.in);       
       String unidade;
       double medRaio;       
       int i;

       
       //definição de uma matriz de objetos 
       //para classe Retangulo
       Circulo[] matCir = new Circulo[10];
       
       
       
       for (i=0; i < 10; i++){
            System.out.println("\n\nDigite a unidade de medida: ");
            unidade = entrada.next();  
       
            //instanciação do objeto da classe Retangulo
            //e chamada do método construtor
            matCir[i] = new Circulo(unidade);
            
       
            System.out.println("Digite a medida do raio: ");
            medRaio = entrada.nextDouble();
            
            //passagem de mensagens
            matCir[i].setRaio(medRaio);
        }     
       
        //acessando matriz de objetos
        for (i=0; i < 10; i++){                         //passagem de mensagens
            System.out.println("\n\nObjeto Circulo " + (i+1)); 
	    System.out.println("\nMedida do raio: " + matCir[i].getRaio());	
            System.out.println("Área: " + matCir[i].calcArea() + " " + matCir[i].getUnidadeMedida() + "²"); 
            System.out.println("Perímetro: " + matCir[i].calcPerimetro() + " " + matCir[i].getUnidadeMedida());
            System.out.println("Diametro: " + matCir[i].calcDiametro() + " " + matCir[i].getUnidadeMedida());
        }   		   
    }    
}
