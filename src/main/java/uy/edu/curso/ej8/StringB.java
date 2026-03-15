package ej8;

public class StringB {
    /*
    ¿Que es el StringBuilder?
    Es una clase que nos permite crear y manipular cadenas de tal manera de que 
    cuando tengams cadenas que necesitemos constante modifciacion no tengamos 
    que estar creando nuevas instancias de String, haciendo asi mas eficiente el trabajo
    */
    
    StringBuilder texto = new StringBuilder("Hola");

    public void pequeñosEjemplos()
    {
        texto.append(" como");
        System.out.println(texto);

        // Se le agrega el string " como" al final del string
        texto.insert(0, "¿");
        System.out.println(texto);

        // Se le inserta el string "¿" al principio del string
        texto.delete(1, 5);
        System.out.println(texto);

        // Se borra "Hola" del string
        texto.deleteCharAt(1);
        System.out.println(texto);
        // Se bprra el caracter vacio antes del como " "
        texto.reverse();
        System.out.println(texto);
        // Se da vuelta todo el texto
        texto.setLength(10);
        System.out.println(texto);
        // El texto ahora tiene un nuevo largo
        texto.ensureCapacity(20);
        System.out.println(texto);
        // Le damos una capacidad de 20, que antes era 16
    }

    /*
    La capacidad inicial de un string es de 16, cuando este esta vacio
    Ya que esto sucede para evitar realocar memoria cuando se agregue texto
    Cuando se agrega texto lo que se hace es sumarse al 16 el largo del string
    */

    /*
    ¿Por que equals y no == ?
    Comparar con == hace que se compare la referencia de memoria del objeto (Ya que no es primitivo) y no el contenido
    */

}
