package ej3;
import java.util.Scanner;

class Contador {
    final int MAX_CONT;
    int incremento;
    int contador;

    public Contador(int max, int inc)
    {
        MAX_CONT = max;
        incremento = inc;
    }

    public void ContarConWhile()
    {
        while (contador != MAX_CONT)
    {
        contador += incremento;
        System.out.println(contador);
    }    
    }
    
    public void ContarConDoWhile()
    {
        do 
    {
        contador += incremento;
    }
    while (contador != MAX_CONT);
        
    }
    
    public void ContarConFor()
    {
        for (int i = 0; i <= MAX_CONT ; i++) 
        {
        
        }

    }   
    
    public String Menu()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce que desea hacer");
        System.out.println("1- Contar con while");
        System.out.println("2- Contar con  do while");
        System.out.println("3- Contar con for");

        int option = sc.nextInt();

        switch (option) {
            case 1:
                System.out.println("Introduce incremento");
                int inc = sc.nextInt();
                System.out.println("Introduce maximo");
                int max = sc.nextInt();
                Contador contador = new Contador(max, inc);
                contador.ContarConWhile;
                break;
            case 2:
                
                break;
            case 3:
                
                break;
        
        
        
            default:
                break;
        }


    }
}


