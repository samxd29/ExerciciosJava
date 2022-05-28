package orientacaoObjeto;

public class SistemaVendas {
    public static void main(String[] args) {
        Vendedor vendedor =  new Vendedor();
        Consultor consultor = new Consultor();

        vendedor.setNumeroVendas(10);
        vendedor.setComissao(5);

        consultor.setHorasTrabalhadas(16);
        consultor.setValorHora(5);


        System.out.println("Salario vendedor: " + vendedor.calcularSalario());
        System.out.println("Salário Consultor: " + consultor.calcularSalario());
    }
}
