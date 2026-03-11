package ej1;

public class PruebaAtributos {
    int a;
    boolean b;
    double c;
    char d;
    String e;
    // String 1a = "InvalidString";
    /*
        Syntax error on token "1", delete this token
    */

    public void PrintDefaultValues()
    {
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
    }

    public void ValidAndInvalidValues()
    {
        //String 2a = "InvalidString";
        /*
            String.a cannot be resolved to a type
        */

        /*
            La diferencia entre el error de la variaable y el error del atributo, es que la variable local sucede al momento de ejecutarlo y 
            y la variable miem+bro al momento de instanciar la clase
        */

        String abc = "Valid String"; 

    }

    /*
        ¿Que es JVM?
        JVM es el interprete de Java, tambien llamado Java Virtual Machine
        permite que java funcione en cualquier tipo de procesador
        Es quien ejecuta los byte-codes creados por el compilador

        ¿Que es JDK?
        El Java development Kit es el compilador de Java, es quien traduce el 
        lenguaje de programacion a lenguaje maquina, lo que hace es realizar un
         analisis de sintaxis del codigo escrito en los codigos fuente de Java,
        si hay error te muestra en que linea, si no hay error te genera los
        ficheros compilados
        
        ¿Ques es JRE?
        El Java Runtime Enviroment es un paquete de software necesario para 
        ejecutar aplicaciones, applets y componentes desarrollados en Java, 
        actua como intermediario entre Java y el SO


        Ejemplo de Tipos Primitivos 
        int a = 12;
        String b = "Hola";
        boolean c = False;

        Ejemplos de Tipos de Referencia
        MiClase Uno;
        Tipo = new MiClase();
    */

    public static void main(String[] args) {
        new PruebaAtributos().PrintDefaultValues();
    }
}
