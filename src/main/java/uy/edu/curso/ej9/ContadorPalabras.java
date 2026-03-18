package ej9;

import java.util.Arrays;
import java.util.List;

public class ContadorPalabras implements ProcesadorTexto {
    @Override
    public int contarPalabras(String texto) {
        List<String> separadores = List.of(" ",",",":",";","_","-" );
        List<String> palabra = Arrays.asList(texto.split(""));
        boolean enpalabra = false;
        int contador = 0;
        for (int i = 0; i <= palabra.size(); i++) {
            if (separadores.contains(palabra.get(i)))
            {
                enpalabra = false;
            }
            else 
            {
                enpalabra = true;
            }
            if (enpalabra)
            {
                if(separadores.contains(palabra.get(i+1)) || i == (palabra.size() - 1))
                {
                    contador++;
                }
            }
        }
        return contador;
    }
}
