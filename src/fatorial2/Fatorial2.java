package fatorial2;

public class Fatorial2 {

    int result = 1;
    public void mostrarFatorial(int numero){

      for(int i = 1; i <= numero; i++){
          result = result * i;

      }
        System.out.println("Mostrar fatorial: " + result);
    }

}

