
import fatec.poo.model.ContaCorrente;
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author 0030482211023
 */
public class Aplic {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#,##0.00");
        int numero, opcao, i, teste = 3;
        double valSaq, valConta;
        
        ContaCorrente[] Banco = new ContaCorrente[teste];
        
        for (i=0; i < teste; i++){
            System.out.print("Digite o numero da conta: ");
            numero = entrada.nextInt();
            System.out.print("Digite o valor inical da conta: ");
            valConta = entrada.nextDouble();
            
            
            Banco[i] = new ContaCorrente(numero, valConta);
        }
        
        do{
            System.out.println("\n\n1-Depositar");
            System.out.println("2-Sacar");
            System.out.println("3-Consultar Saldo");
            System.out.println("4-Listar Contas");
            System.out.println("5-Sair");
            System.out.println("\n\tDigite a opção: ");
            opcao = entrada.nextInt();
            
            if(opcao < 4){
                System.out.print("Digite o numero da conta: ");
                numero = entrada.nextInt();
                for(i=0; i < teste; i++){
                    if(numero == Banco[i].getNumero()){
                        break;
                    }
                }
                if(i == teste){
                    System.out.println("Conta não cadastrada");
                    continue;
                }
            }
            switch (opcao) {
                case 1:
                    System.out.println("Informe o valor a ser depositado: R$ ");
                    Banco[i].depositar(entrada.nextDouble());
                    System.out.println("\nDeposito concluído\n");
                    break;
                case 2:
                    System.out.println("Informe o valor a ser sacado: R$");
                    valSaq = entrada.nextDouble();
                    if(valSaq <= Banco[i].getSaldo()){
                        Banco[i].sacar(valSaq);
                    }else{
                        System.out.println("Saldo insuficiente");
                    }
                    break;
                case 3:
                    System.out.println("\nSeu saldo é: R$ " + df.format(Banco[i].getSaldo()));
                    break;
                case 4:
                    System.out.println("\n\tNúmero da Conta:\t\tSaldo:");
                    for(i=0; i < teste; i++){
                        System.out.println("\t" + Banco[i].getNumero() + "\t\t\t\t" + df.format(Banco[i].getSaldo()));
                    }
                    break;
                default:
                    break;
            }
        }while(opcao < 5);
    }
    
}
