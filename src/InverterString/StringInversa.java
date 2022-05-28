package InverterString;

public class StringInversa {

    public static String inverterString(String conteudo){
        StringBuilder builder = new StringBuilder(conteudo);
        String invertida = builder.reverse().toString();
        return invertida;
    }
}
