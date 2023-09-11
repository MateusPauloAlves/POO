
import fatec.poo.model.Circulo;
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author 0030482211023
 */
public class Aplic {
    public static void main(String[] args) {
       DecimalFormat df = new DecimalFormat("0.00");
       Scanner entrada = new Scanner(System.in);       
       String unidade;
       double medRaio;       
       int i;

       
       //definição de uma matriz de objetos 
       //para classe Circulo
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
	    System.out.println("\nMedida do raio: " + df.format(matCir[i].getRaio()));
            System.out.println("Área: " + df.format(matCir[i].calcArea()) + " " + matCir[i].getUnidadeMedida() + "²"); 
            System.out.println("Perímetro: " + df.format(matCir[i].calcPerimetro()) + " " + matCir[i].getUnidadeMedida());
            System.out.println("Diametro: " + df.format(matCir[i].calcDiametro()) + " " + matCir[i].getUnidadeMedida());
        }   		   
    }    
}
