package ej7;

public class Palindromo 
{
    public static boolean esPalindromo(String texto)
    {
        // pasar todo a minúsculas
        texto = texto.toLowerCase();

        // eliminar espacios y signos de puntuación
        texto = texto.replaceAll("[^a-z0-9]", "");

        String invertido = "";

        for (int i = texto.length() - 1; i >= 0; i--)
        {
            invertido += texto.charAt(i);
        }

        return texto.equals(invertido);
    }

    public void ejemplosSimples()
    {
        String palabra = "Emilio Falcone Konajovich";
        String substring = palabra.substring(1,4);
        System.out.println(palabra + substring );
        String[] split = palabra.split(" ");
        System.out.println(split);
        CharSequence subsequence = palabra.subSequence(1, 5);
        System.out.println(subsequence);
        String trim = palabra.trim();
        System.out.println(trim);
        String toLowerCase = palabra.toLowerCase();
        System.out.println(toLowerCase);
        String toUpperCase = palabra.toUpperCase();
        System.out.println(toUpperCase);
        int indexOf = palabra.indexOf("a");
        System.out.println(indexOf);
        int lastIndexOf = palabra.lastIndexOf("o");
        System.out.println(lastIndexOf);
        boolean contains = palabra.contains("Falcone");
        System.out.println(contains);
        String replace = palabra.replace("Falcone", "Cabra");
        System.out.println(replace);
        String replaceAll = palabra.replaceAll("[a-z]", "E");
        System.out.println(replaceAll);
        String replaceFirst = palabra.replaceFirst("Emilio", "Emi");
        System.out.println(replaceFirst);

        String hannah = "hannah";
        System.out.println("String: "+ hannah);
        System.out.println("Longuitud del string: " + hannah.length() );
        System.out.println("Caracter en el indice 3: "+ hannah.charAt(3));

        System.out.println("Substring de 2-5: "+ hannah.substring(2,5));





    }

    
}
/*
¿Por que los strings son inmutables?
Porque cada vez que se crea un objeto string, su contendio no puede modificarse
puede ser que parezca que se modifica, pero en realidad se esta creando otro nuevo

¿Como afecta a la solucion?
Afecta de tal manera que cada vez que modificamos el texto tenemos que sobreescribir
la variable texto, ya que cada vez que se modifica es un nuevo objeto

*/

