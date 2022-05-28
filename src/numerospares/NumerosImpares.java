package numerospares;

import java.util.Scanner;

public class NumerosImpares {
    public static void impares(){

        for(int i = 0; i <= 100; i++){
            if (i %2 == 1){
                System.out.println("Numeros ímpares: " + i);
            }
        }
    }

    public void mostrarImpares(){
        Scanner scan = new Scanner(System.in);

        System.out.println("Me informe um números: ");
        int numero = scan.nextInt();
        for (int i = 0; i <= numero; i++){
            if(i %2 != 0){
                System.out.println("Numeros ímpares: " + i);

            }
        }
    }
}
