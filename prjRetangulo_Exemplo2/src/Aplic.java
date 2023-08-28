
import fatec.poo.model.Retangulo;
import java.util.Scanner;

/**
 * @author 0030482211007
 */
public class Aplic {
    public static void main(String[] args) {
        Retangulo objRet = new Retangulo();     //definição da classe retangulo
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
            System.out.println("3-Consultar diagonal do retângulo");
            System.out.println("4-Sair");
            System.out.println("Digite a opção: ");
            opcao = entrada.nextInt();
            if (opcao == 1){
                System.out.println("Medida da altura do retângulo: " + objRet.getAltura());
                System.out.println("Medida da base do retângulo: " + objRet.getBase());
                System.out.println("mostrar área do retangulo: " + 
                                    objRet.calcArea());
            }else
                if(opcao == 2){
                    System.out.println("Medida da altura do retângulo: " + objRet.getAltura());
                    System.out.println("Medida da base do retângulo: " + objRet.getBase());
                    System.out.println("mostrar perimetro do retangulo: " + 
                                    objRet.calcPerimetro());
                }else
                    if(opcao == 3){
                        System.out.println("Medida da altura do retângulo: " + objRet.getAltura());
                        System.out.println("Medida da base do retângulo: " + objRet.getBase());
                        System.out.println("mostrar diagonal do retangulo: " + 
                                    objRet.calcDiagonal());
                    }
        }while (opcao < 4);
    }
    
}
