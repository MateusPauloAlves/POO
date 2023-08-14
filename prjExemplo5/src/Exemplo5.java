/**
 *
 * @author 0030482211023
 */
public class Exemplo5 {
    public static void main(String[] args) {
        double numero, resultado;
        int x = 0;
        
        numero = Math.random() * 100;
        
        while(x <= 10){
            resultado = numero * x;
            
            System.out.println(numero + " x " + x + " = " + resultado);
            x++; // ou x = x + 1; ou X += 1;
        }
    }
}
