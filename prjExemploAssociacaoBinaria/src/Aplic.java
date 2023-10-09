import fatec.poo.model.Departamento;
import fatec.poo.model.FuncionarioComissionado;
import fatec.poo.model.FuncionarioHorista;
import fatec.poo.model.FuncionarioMensalista;
import fatec.poo.model.Projeto;

/**
 *
 * @author Dimas
 */
public class Aplic {
    public static void main(String[] args) {
        FuncionarioHorista funcHor  = new FuncionarioHorista(1010,
                                                             "Pedro Silveira",
                                                             "14/05/78",
                                                             15.80);
        
        funcHor.setCargo("Programador");
        
        FuncionarioMensalista funcMen  = new FuncionarioMensalista(2020,
                                                                   "Ana Beatriz",
                                                                   "22/07/88",
                                                                   600);
        
        funcMen.setCargo("Aux. Administrativo");
        
        FuncionarioComissionado funcCom = new FuncionarioComissionado(3030, 
                                                                     "Joao Mendes",
                                                                     "10/12/1975",
                                                                     10);
        
        funcCom.setCargo("Vendedor");
       
        //Instanciação de objetos da 
        //classe Departamento    
        Departamento objDep1 = new Departamento("RH", "Recursos Humanos");
        Departamento objDep2 = new Departamento("VD", "Vendas");
        
        // classe Projeto
        Projeto objPro1 = new Projeto(1111, "Criação de um WebService");
        Projeto objPro2 = new Projeto(2222, "Aplicativo para compras");
      
	  
       //Estabelecendo a associação binária entre 1
       //objeto da classe FuncionarioHorista com
       //1 objeto da classe Departamento
       funcHor.setDepartamento(objDep1);
       funcHor.setProjeto(objPro1);
       System.out.println("O funcionario " + funcHor.getNome() 
       + " trabalha no departamneto " + funcHor.getDepartamento().getNome() + " no projeto "
       + funcHor.getProjeto().getCodigo());
       
       //Estabelecendo a associação binária entre 1
       //objeto da classe FuncionarioMensalista com
       //1 objeto da classe Departamento
       funcMen.setDepartamento(objDep1);
       funcMen.setProjeto(objPro1);
       System.out.println("O funcionario " + funcMen.getNome() 
       + " trabalha no departamneto " + funcMen.getDepartamento().getNome() + " no projeto "
       + funcMen.getProjeto().getCodigo());
       
       //Estabelecendo a associação binária entre 1
       //objeto da classe FuncionarioComissionado com
       //1 objeto da classe Departamento       
       funcCom.setDepartamento(objDep2);
       funcCom.setProjeto(objPro2);
       System.out.println("O funcionario " + funcCom.getNome() 
       + " trabalha no departamneto " + funcCom.getDepartamento().getNome() + " no projeto "
       + funcCom.getProjeto().getCodigo());
      
       //Estabelecendo a associação binária entre um
       //objeto da classe Departamento com 1 ou mais (1..*)
       //objetos da classe FuncionarioHorista, FuncionarioMensalista
       //e FuncionarioComissionado  
       objDep1.addFuncionario(funcHor);
       objDep1.addFuncionario(funcMen);
       objDep2.addFuncionario(funcCom);
       
       objDep1.listarFuncionarios();
       objDep2.listarFuncionarios();
       
       objPro1.addFuncionario(funcHor);
       objPro1.addFuncionario(funcMen);
       objPro2.addFuncionario(funcCom);
       
       objPro1.listarFuncionarios();
       objPro2.listarFuncionarios();
    }    
}
