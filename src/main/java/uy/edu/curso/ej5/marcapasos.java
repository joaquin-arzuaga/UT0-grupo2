package ej5;

import java.util.Objects;

import javax.xml.stream.events.StartDocument;

public class Marcapasos {    

    static int marcadorInstancias;

    private final String idDispositivo;

    public String getIdDispositivo() {
        return idDispositivo;
    }

    /*
    idDispositivo no tiene setter porque se le aplica una ID al crear el objeto
    pero esta misma no se cambia a lo largo del programa
    */

    private final String codigoFabricante;

    public String getCodigoFabricante()
    {
        return codigoFabricante;
    }
    /*
    codigoFabricante no tiene setter porque no se le modifica el codigo a lo 
    largo del programa, solo cuando se crea
    */
    private short latidosPorMinuto;
    
    public short getLatidosPorMinuto() {
        return latidosPorMinuto;
    }

    public void setLatidosPorMinuto(short latidosPorMinuto) {
        this.latidosPorMinuto = latidosPorMinuto;
    }
    private short nivelBateria;
    public short getNivelBateria()
    {
        return nivelBateria;
    }
    public void setNivelBateria(short nivelBateria)
    {
        if (nivelBateria < 0)
        {
            throw new IllegalArgumentException("La bateria no puede ser negativa");
        }
        this.nivelBateria = nivelBateria;
    }

    public Marcapasos(String idDispositivo, String codigoFabricante)
    {
        this.idDispositivo = idDispositivo;
        this.codigoFabricante = codigoFabricante;
        marcadorInstancias ++;
    }

    @Override
    public String toString()
    {
        return(
        "Id de dispositivo: " + idDispositivo + "\n" +
        "Codigo Fabricante: " + codigoFabricante + "\n" +
        "Latidos por minuto: " + latidosPorMinuto + "\n" +
        "Nivel de bateria: " + nivelBateria);
    }

    @Override
    public boolean equals(Object obj)
    {
        if (this == obj)
        {
            return true;
        }

        if (obj == null || getClass() != obj.getClass())
        {
            return false;
        }

        Marcapasos otro = (Marcapasos) obj;

        // return (idDispositivo.equals(otro.idDispositivo) && codigoFabricante.equals(otro.codigoFabricante));
        // Seria mejor usar
        return (Objects.equals(codigoFabricante, otro.codigoFabricante) && Objects.equals(codigoFabricante, otro.codigoFabricante));
        // Es mejor usar Objects.equls porque este metodo ya verifica si es nulo
    }


    /*
    La clase Marcapasos tiene las siguientes variables y cada una ocupa lo siguiente
    latidosPorMinuto -> Es un short -> Ocupa 2 bytes
    nivelDeBateria -> Es un short -> Ocupa 2 bytes

    Suponiendo que los atributos string guardan una referencia 
    Y una referencia ocupa 2 bytes y hay 2 strings, estos ocupan 4 bytes 
    Ocupan 8 bytes, en total 12 bytes

    El contador de instancias, como es static no se cuenta 
    
    */


}

