package fatorial;

public class Fatorial {

    //calcular o fatorial de um numero
    int result = 1;
    public int fat(int num){
        for (int i = 1; i <= num; i++){
            result = result * i;
        }
        return result;
    }
}
