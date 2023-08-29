
import fatec.poo.model.Circulo;
import java.util.Scanner;

/**
 *
 * @author 0030482211023
 */
public class Aplic {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double medRaio;
        int opcao;
        String unidade;
        
        System.out.print("Digite a unidade de medida: ");
        unidade = entrada.next();
        Circulo objCir = new Circulo(unidade);  //Criando construtor
        
        System.out.println("Digite o raio do círculo: ");
        medRaio = entrada.nextDouble();    
        
        objCir.setRaio(medRaio);
        
        do{
            System.out.println("\n\n1-Consultar área do círculo");
            System.out.println("2-Consultar perimetro do círculo");
            System.out.println("3-Consultar diagonal do círculo");
            System.out.println("4-Sair");
            System.out.println("Digite a opção: ");
            opcao = entrada.nextInt();
            if (opcao == 1){
                System.out.println("Medida do raio do círculo: " + objCir.getRaio());
                System.out.println("mostrar área do círculo: " + 
                                    objCir.calcArea() + " " + objCir.getUnidadeMedida() + "²");
            }else
                if(opcao == 2){
                    System.out.println("Medida do raio do círculo: " + objCir.getRaio());
                    System.out.println("mostrar perimetro do circulo: " + 
                                    objCir.calcPerimetro() + " " + objCir.getUnidadeMedida());
                }else
                    if(opcao == 3){
                        System.out.println("Medida do raio do círculo: " + objCir.getRaio());
                        System.out.println("mostrar diametro do círculo: " + 
                                    objCir.calcDiametro() + " " + objCir.getUnidadeMedida());
                    }
        }while (opcao < 4);
    }
    
}
