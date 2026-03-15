package ej6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Multisuma {

    public int Multsuma(int first, int second, int third)
    {
        return(first * second + third);
    }

    public double Multsuma(double first, double second, double third)
    {
        return(first * second + third);
    }

    public List<Integer> crearLista()
    {
        int numero = 0;
        boolean continuar = true;
        ArrayList<Integer> lista = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while (continuar)
        {
            System.out.println("Introduce el número que deseas agregar a la lista:");
            System.out.println("0 para terminar");
            numero = sc.nextInt();
            if (numero != 0)
            {
                lista.add(numero);
            }
            else
            {
                continuar = false;
            }
        }
        return lista;
        
    }

    public List<Integer> MultArreglosLogic(List<Integer> lista, List<Integer> listados)
    {
        ArrayList<Integer> resutados = new ArrayList<>();
        if (lista.size() != listados.size())
        {
            throw new IllegalArgumentException("Las listas deben tener el mismo tamaño");
        }
        for (int i = 0; i < lista.size(); i++) {
            resutados.add(lista.get(i) * listados.get(i));
        }
        return resutados;
    }

    public void MultArreglos()
    {
        System.out.println("Primera lista:");
        List<Integer> listauno = crearLista();
        System.out.println("Segunda lista:");
        List<Integer> listados = crearLista();
        mostrarLista(MultArreglosLogic(listauno,listados));
    }

    public void mostrarLista(List<Integer> lista)
    {
        System.out.println("Los resultados son:");
        for (int i = 0; i < lista.size(); i++) 
        {
            System.out.println(lista.get(i));
        }
    }

    /*
    Valido si las listas tienen el mismo tamañom comparando sus .size() (largo)
    Con un for con indice lo que hago es recorrer las listas con este indice multiplicando 
    sus resultados y poniendolos en una lista de resultados
    */
}
