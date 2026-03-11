package ej2;

public class ArithmeticDemo {


public int Calculadora(String op1, String op2, String operation)
    {
        int uno;
        int dos;
        try {
            uno = Integer.parseInt(op1);
            dos = Integer.parseInt(op2);
            operation = operation.toLowerCase();
            
        } catch (Exception e) {
            throw e;
        }
        switch (operation) {
            case "suma":
                return (uno + dos);
            case "resta":
                return (uno-dos);
            case "multiplicacion":
                return (uno*dos);
            case "division":
                return (uno/dos);
            case "modulo":
                return(uno%dos);
            default:
                return 0;

        }
    }

 public static void main(String[] args) {
 int result = 1 + 2;
// result = result - 1;
// result = result * 2;
// result = result / 2;
// result = result + 8;
// result = result % 7;

/*
    Todas las de arriba son reemplazables por asignaciones compuestas 
*/
 /*
    En int a = 5 se le asigna a la variable a de tipo integrer el valor 5
    Despues en int i = 3 se le asigan a la variable i de tipo integrer el valor 3
    En a += ++i lo que sucede es esto 
    ++i se utiliza el valor de i y luego se incrementa, por lo tanto i = 3
    a += i lo que hace es sumar el valor de a con el de i y guradarlo en la variable a
    Queda a = 8


    De asignacion:
    int result = 1 + 2;
    result = result - 1;
    result = result * 2;
    result = result / 2;
    result = result + 8;
    result = result % 7;


 */
    ArithmeticDemo calculadora = new ArithmeticDemo();
    int resultado = calculadora.Calculadora("12", "2", "resta");
    System.out.println(resultado);


 }

 
}