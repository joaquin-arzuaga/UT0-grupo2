import java.util.ArrayList;

import ej1.PruebaAtributos;
import ej2.ArithmeticDemo;
import ej3.Contador;
import ej4.Factorial;
import ej6.Multisuma;


public class Main {

    public static void main(String[] args) {
        
        //Contador ContadorUno = new Contador(0, 0);
        //ContadorUno.menu();
        // Factorial Facto = new Factorial();
        // System.out.println(Facto.CalcularFactorial(5));
        // System.out.println(Facto.DeterminarPrimo(1));
        // System.out.println(Facto.SumaParesImpares(8));
        // System.out.println(Facto.SumaParesImparesConWhile(8));
        Multisuma Suma = new Multisuma();
        // ArrayList<Integer> lista = new ArrayList<>();
        // lista.add(1);
        // lista.add(2);
        // lista.add(3);
        // ArrayList<Integer> listados = new ArrayList<>();
        // listados.add(1);
        // listados.add(2);
        // listados.add(3);
        // System.out.println(Suma.MultArreglos(lista, listados));
        Suma.MultArreglos();
        
    }

}
