package exercicioMacaco;

public class Main {
    public static void main(String[] args) {
        Macaco macaco = new Macaco();

        macaco.comer("Banana");
        macaco.comer("Maça");
        macaco.comer("Pera");
        macaco.comer("Uva");

        macaco.verBucho();
        macaco.digerir();

        macaco.verBucho();


    }
}
