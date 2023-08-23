
import fatec.poo.model.Retangulo;
import java.util.Scanner;

/**
 * @author 0030482211007
 */
public class Aplic {
    public static void main(String[] args) {
        Retangulo objRet = new Retangulo();
        //definição da classe retangulo
                Scanner entrada = new Scanner(System.in);
        double medAlt, medBase;
        int opcao;
        
        System.out.println("Digite a medida da base do reatangulo: ");
        medAlt = entrada.nextDouble();    
        System.out.println("Digite a medida da altura do reatangulo: ");
        medBase = entrada.nextDouble();
        
        objRet.setAltura(medAlt);
        objRet.setBase(medBase);
        
        do{
            System.out.println("\n\n1-Consultar área do retângulo");
            System.out.println("2-Consultar perimetro do retângulo");
            System.out.println("3-Sair");
            System.out.println("Digite a opção: ");
            opcao = entrada.nextInt();
            if (opcao == 1){
                System.out.println("mostrar área do retangulo: " + 
                                    objRet.calcArea());
            }else
                if(opcao == 2){
                    System.out.println("mostrar perimetro do retangulo: " + 
                                    objRet.calcPerimetro());
                }
        }while (opcao < 3);
    }
    
}
