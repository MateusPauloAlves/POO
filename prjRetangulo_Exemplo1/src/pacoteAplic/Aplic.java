package pacoteAplic;

import fatec.poo.model.Retangulo;

/**
 * @author 0030482211007
 */
public class Aplic {
    public static void main(String[] args) {
        Retangulo objRet;//definição da classe retangulo
        objRet = new Retangulo();
        objRet.setAltura(5.0);
        objRet.setBase(8.0);
        System.out.println("Medida da área do retangulo:" + objRet.calcArea());
        System.out.println("Medida da área do retangulo:" + objRet.calcPerimetro());
    }    
    
}
