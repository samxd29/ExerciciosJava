package orientacaoObjeto;

public class Vendedor extends Funcionario {
    private double comissao;
    private long numeroVendas;

    public Vendedor() {
    }

    public Vendedor(String nome, String cpf, double comissao, long numeroVendas) {
        super(nome, cpf);
        this.comissao = comissao;
        this.numeroVendas = numeroVendas;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    public long getNumeroVendas() {
        return numeroVendas;
    }

    public void setNumeroVendas(long numeroVendas) {
        this.numeroVendas = numeroVendas;
    }

    @Override
    public double calcularSalario() {
        return super.getSalarioMinimo() + this.comissao * this.numeroVendas;
    }
}
