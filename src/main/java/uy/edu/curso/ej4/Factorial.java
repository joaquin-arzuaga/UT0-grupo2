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

    public int SumaParesImpares(int numero)
    {
        boolean result = DeterminarPrimo(numero);
        int resultado = 0;
        if (result == true)
        {
            for (int index = 1; index < numero; index++) {
                if (numero % index == 0)
                {
                    resultado += index;
                }
            }
        }
        else
        {
            for (int index = 1; index < numero; index++) {
                if (numero % index != 0)
                {
                    resultado += index;
                }
        }
        }
    return resultado;
}
}
