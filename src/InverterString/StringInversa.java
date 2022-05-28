package InverterString;

public class StringInversa {

    public static String inverterString(String conteudo){
        // String builder é uma classe para manipular string
        StringBuilder builder = new StringBuilder(conteudo);
        // tem que passar um parametro para o construtor da classe string builder;

        // criou uma variável que tem um método reverter dentro da classe builder e o to string converter em string
        String invertida = builder.reverse().toString();
        return invertida;
    }
}
