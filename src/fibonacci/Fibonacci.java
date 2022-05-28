package fibonacci;

public class Fibonacci {

    //calcular a sequencia de fibonacci
    public static int fibo(int numero){
        if (numero < 2){
            return numero;
        }else {
            return fibo(numero-1)+fibo(numero-2);
        }
    }
}
