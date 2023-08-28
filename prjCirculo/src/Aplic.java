
import fatec.poo.model.Circulo;
import java.util.Scanner;

/**
 *
 * @author 0030482211023
 */
public class Aplic {
    public static void main(String[] args) {
        Circulo objCir = new Circulo();     //definição da classe retangulo
        Scanner entrada = new Scanner(System.in);
        double medRaio;
        int opcao;
        
        System.out.println("Digite a medida da base do reatangulo: ");
        medRaio = entrada.nextDouble();    
        
        objCir.setRaio(medRaio);
        
        do{
            System.out.println("\n\n1-Consultar área do retângulo");
            System.out.println("2-Consultar perimetro do retângulo");
            System.out.println("3-Consultar diagonal do retângulo");
            System.out.println("4-Sair");
            System.out.println("Digite a opção: ");
            opcao = entrada.nextInt();
            if (opcao == 1){
                System.out.println("Medida do raio do círculo: " + objCir.getRaio());
                System.out.println("mostrar área do círculo: " + 
                                    objCir.calcArea());
            }else
                if(opcao == 2){
                    System.out.println("Medida do raio do círculo: " + objCir.getRaio());
                    System.out.println("mostrar perimetro do circulo: " + 
                                    objCir.calcPerimetro());
                }else
                    if(opcao == 3){
                        System.out.println("Medida do raio do círculo: " + objCir.getRaio());
                        System.out.println("mostrar diametro do círculo: " + 
                                    objCir.calcDiametro());
                    }
        }while (opcao < 4);
    }
    
}
