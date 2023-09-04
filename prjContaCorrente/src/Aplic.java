
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
        double valSaq, valConta;
        
        System.out.print("Digite o numero da conta: ");
        numero = entrada.nextInt();
        System.out.print("Digite o valor inical da conta: ");
        valConta = entrada.nextDouble();
        ContaCorrente objCnt = new ContaCorrente(numero, valConta);  //Criando construtor
       
        
        do{
            System.out.println("\n\n1-Depositar");
            System.out.println("2-Sacar");
            System.out.println("3-Consultar Saldo");
            System.out.println("4-Sair");
            System.out.println("\n\tDigite a opção: ");
            opcao = entrada.nextInt();
            
            if(opcao < 4){
                System.out.println("\n\nNúmero da Conta Corrente: " + objCnt.getNumero());
            }
            switch (opcao) {
                case 1:
                    System.out.println("Informe o valor a ser depositado: R$ ");
                    objCnt.depositar(entrada.nextDouble());
                    System.out.println("\nDeposito concluído\n");
                    break;
                case 2:
                    System.out.println("Informe o valor a ser sacado: R$");
                    valSaq = entrada.nextDouble();
                    if(valSaq <= objCnt.getSaldo()){
                        objCnt.sacar(valSaq);
                    }else{
                        System.out.println("Saldo insuficiente");
                    }
                    break;
                case 3:
                    System.out.println("\nInforme o valor a ser depositado: R$ " + objCnt.getSaldo());
                    break;
                default:
                    break;
            }
        }while (opcao < 4);
    }
    
}
