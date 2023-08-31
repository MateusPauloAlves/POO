
import fatec.poo.model.ContaCorrente;
import java.util.Scanner;

/**
 *
 * @author mateu
 */
public class Aplic {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero, opcao;
        
        System.out.print("Digite o numero da conta: ");
        numero = entrada.nextInt();
        ContaCorrente objCnt = new ContaCorrente(numero);  //Criando construtor
       
        
        do{
            System.out.println("\n\n1-Depositar");
            System.out.println("2-Sacar");
            System.out.println("3-Consultar Saldo");
            System.out.println("4-Sair");
            System.out.println("\n\tDigite a opção: ");
            opcao = entrada.nextInt();
            
            if (opcao == 1){
                System.out.println("\nInforme o valor a ser depositado: R$ ");
                objCnt.depositar(entrada.nextDouble());
                System.out.println("\nDeposito concluído\n");
            }else
                if(opcao == 2){
                    System.out.println("Informe o valor a ser sacado: R$");
                    objCnt.sacar(entrada.nextDouble());
                }else
                    if(opcao == 3){
                        System.out.println("\nInforme o valor a ser depositado: R$ " + objCnt.getSaldo());
                    }
        }while (opcao < 4);
    }
    
}
