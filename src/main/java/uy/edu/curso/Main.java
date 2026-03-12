import ej1.PruebaAtributos;
import ej2.ArithmeticDemo;
import ej3.Contador;
import ej4.Factorial;


public class Main {

    public static void main(String[] args) {
        
        //Contador ContadorUno = new Contador(0, 0);
        //ContadorUno.menu();
        Factorial Facto = new Factorial();
        System.out.println(Facto.CalcularFactorial(5));
        System.out.println(Facto.DeterminarPrimo(1));

    }

}
