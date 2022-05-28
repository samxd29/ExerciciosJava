import InverterString.StringInversa;
import fatorial.Fatorial;
import fibonacci.Fibonacci;

import java.util.Scanner;

public class Testes {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int numero = scanner.nextInt();
//
        // Calculandoa a sequencia de fibonacci

//        for (int i = 0; i <= numero; i++){
//            int resultado = Fibonacci.fibo(i);
//            System.out.println(resultado);
//        }

        // Calculando o fatorial de um numero.

//        Fatorial fatorial = new Fatorial();
//        System.out.println(fatorial.fat(numero));

        // Função para inverter uma string

      String conteudoInvertido = StringInversa.inverterString(String.valueOf(numero));
        System.out.println(conteudoInvertido);
    }
}
