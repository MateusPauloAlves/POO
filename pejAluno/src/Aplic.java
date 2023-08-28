
import fatec.poo.model.Aluno;
import java.util.Scanner;

/**
 *
 * @author 0030482211023
 */
public class Aplic {
    public static void main(String[] args) {
        Aluno objAlu = new Aluno();
        Scanner entrada = new Scanner(System.in);
        
        double NtPrv1, NtPrv2, NtTrab1, NtTrab2;
        int opcao, RA;
        
        System.out.println("Digite o RA do aluno: ");
        RA = entrada.nextInt();
        objAlu.setRA(RA);
        
        System.out.println("Digite a nota da primeira prova do aluno: ");
        NtPrv1 = entrada.nextDouble();
        objAlu.setNtPrv1(NtPrv1);
        
        System.out.println("Digite a nota da segunda prova do aluno: ");
        NtPrv2 = entrada.nextDouble();
        objAlu.setNtPrv2(NtPrv2);
        
        System.out.println("Digite a nota do primeiro trabalho do aluno: ");
        NtTrab1 = entrada.nextDouble();
        objAlu.setNtTrab1(NtTrab1);
        
        System.out.println("Digite a nota do segundo trabalho do aluno: ");
        NtTrab2 = entrada.nextDouble();
        objAlu.setNtTrab2(NtTrab2);

        
        do{
            System.out.println("\n\n1-Exibir Nota das Provas/Trabalhos");
            System.out.println("2-Exibir Média dos Trabalhos/Provas");
            System.out.println("3-Exibir Média Final");
            System.out.println("4-Sair");
            System.out.println("Digite a opção: ");
            opcao = entrada.nextInt();
            if (opcao == 1){
                System.out.println("As notas das primeira e segunda provas: " + objAlu.getNtPrv1() + ", " + objAlu.getNtPrv2());
                System.out.println("As notas dos primeiro e segundo trabalhos: " + objAlu.getNtTrab1() + ", " + objAlu.getNtTrab2());
            }else
                if(opcao == 2){
                    System.out.println("A média das notas é: " + objAlu.calcMediaProva());
                    System.out.println("As média dos trabalhos: " + objAlu.calcMediaTrab());
                }else
                    if(opcao == 3){
                        System.out.println("Média Final: " + objAlu.calcMediaFinal());
                    }
        }while (opcao < 4);
    }
    
}
