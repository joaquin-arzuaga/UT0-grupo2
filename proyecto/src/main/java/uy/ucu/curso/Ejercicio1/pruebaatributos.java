
package uy.ucu.curso.Ejercicio1;


public class pruebaatributos {

    int numero;         
    boolean activo;    
    double precio;     
    char letra;      
    String texto;        

    public static void main(String[] args) {

        
        pruebaatributos objeto = new pruebaatributos();

        // ESTO LO QUE HACE ES MOSTAR EN PANTALLA
        System.out.println("int numero = " + objeto.numero);
        System.out.println("boolean activo = " + objeto.activo);
        System.out.println("double precio = " + objeto.precio);
        System.out.println("char letra = " + objeto.letra);
        System.out.println("String texto = " + objeto.texto);

        // Aca voy a inicializar variables locales sin darle un valor fijo, esto 
        // significa que no las puedo printear porque no tienen  un valor especificoco. 
        // Da error.
        
        int Number;
        boolean boliano;
        double doubl;
        char characterr;
        String streng;

        
        //Si intentamos imprimir estas variables sin inicializarlas
        //el compilador da error.

      //  System.out.println(Number);  // ERROR
        

        // Ahora en este caso, inicilizo estas variables pero les asigno un valor fijo,
        //gracias a esto vamos a poder  
        Number = 6;
        boliano = true;
        doubl = 18.91;
        characterr = 'p';
        streng = "PEÑAROL";

       

        System.out.println(Number);
        System.out.println(boliano);
        System.out.println(doubl);
        System.out.println(characterr);
        System.out.println(streng);

        
    }

    public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}
}