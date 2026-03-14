package ej4;

public class Factorial {
    public Long CalcularFactorial(int numero) {
        if (numero < 1)
        {
            throw new IllegalArgumentException("El numero no puede ser negativo");
        }
        if (numero == 0L || numero == 1L) {
            return 1L;
        }

        Long result = 1L;

        for (int i = numero; i > 1; i--) {
            result *= i;

        }

        return result;
    }

    public Boolean DeterminarPrimo(int numero)
    {
        if (numero <= 1)
        {
            return false;
        }
        for (int i = 2; i < numero - 1 ; i++) {
            if (numero % i == 0)
            {
                return false;
            }
        }
        return true;
    }

    public Boolean DeterminarPrimoConWhile(int numero)
    {
        int divisor = numero - 1; 
        while (divisor != 1)
        {
            if (numero % divisor == 0)
            {
                return false;
            }
            divisor --;
        }
        return true;
    }


    public int SumaParesImpares(int numero)
    {
        boolean result = DeterminarPrimo(numero);
        int resultado = 0;
        if (result == true)
        {
            for (int index = 1; index < numero; index++) {
                if (index % 2 == 0)
                {
                    resultado += index;
                }
            }
        }
        else
        {
            for (int index = 1; index < numero; index++) {
                if (index % 2 != 0)
                {
                    resultado += index;
                }
        }
        }
    return resultado;
    }

    public int SumaParesImparesConWhile(int numero)
    {
        boolean result = DeterminarPrimoConWhile(numero);
        int resultado = 0;
        if (result == true)
        {
            while (numero != 0)
            {
                if (numero % 2 == 0)
                {
                    resultado += numero;
                }
                numero--;
            }
        }
        if (result == false)
        {
            while (numero != 0)
            {
                if (numero % 2 != 0)
                {
                    resultado += numero;
                }
                numero--;
                
            }
        }
        return resultado;
    }
}
