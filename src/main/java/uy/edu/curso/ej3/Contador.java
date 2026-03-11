package ej3;

class Contador {
    final int MAX_CONT = 5;
    int incremento;
    int contador;

    public void ContarConWhile()
    {
        while (contador != MAX_CONT)
    {
        contador += incremento;
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
}


