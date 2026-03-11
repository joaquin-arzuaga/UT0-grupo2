package ej3;
import java.util.Scanner;

public class Contador {
    private final int MAX_CONT;
    private int incremento;
    private int contador;

    public Contador(int max, int inc)
    {
        MAX_CONT = max;
        incremento = inc;
    }

    public void contarConWhile()
    {
        while (contador < MAX_CONT)
    {
        contador += incremento;
        System.out.println(contador);
        try {
            Thread.sleep(1000);
            
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }    
    }
    
    public void contarConDoWhile()
    {
        do 
    {
        contador += incremento;
        System.out.println(contador);
        try {
            Thread.sleep(1000);
            
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    while (contador != MAX_CONT);
        
    }
    
    public void contarConFor()
    {
        for (contador++ ; contador <= MAX_CONT ; contador++) 
        {
            System.out.println(contador);
        try {
            Thread.sleep(1000);
            
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        }

    }   
    
    public void menu()
    {
        int inc = 0;
        int max = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce que desea hacer");
        System.out.println("1- Contar con while");
        System.out.println("2- Contar con  do while");
        System.out.println("3- Contar con for");

        int option = sc.nextInt();

        switch (option) {
            case 1:
                System.out.println("Introduce incremento");
                inc = sc.nextInt();
                System.out.println("Introduce maximo");
                max = sc.nextInt();
                Contador contadoruno = new Contador(max, inc);
                contadoruno.contarConWhile();
                break;
            case 2:
                System.out.println("Introduce incremento");
                inc = sc.nextInt();
                System.out.println("Introduce maximo");
                max = sc.nextInt();
                Contador contadordos = new Contador(max, inc);
                contadordos.contarConDoWhile();
                break;
            case 3:
                System.out.println("Introduce incremento");
                inc = sc.nextInt();
                System.out.println("Introduce maximo");
                max = sc.nextInt();
                Contador contadortres = new Contador(max, inc);
                contadortres.contarConFor();
                break;

            default:
                break;
        }

        /*
            For 
            Lo usaria cuando se cuantas veces exacto voy a repetir la iteracion

            While
            Lo usaria cuando no se cuantas veces voy a repetir la iteracion ya que dependes de una condicion 

            Do While 
            Lo mismo que el while, pero quiero que se cumpla una ultima vez la accion antes de chequear la condicion
        */

    }
}


