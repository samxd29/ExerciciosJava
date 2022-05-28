package orientacaoObjeto;

public class Consultor extends Funcionario{
    private double valorHora;
    private long horasTrabalhadas;

    public Consultor() {

    }

    public Consultor(String nome, String cpf, double valorHora, long horasTrabalhadas) {
        super(nome, cpf);
        this.valorHora = valorHora;
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public long getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(long horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    @Override
    public double calcularSalario() {
        return this.horasTrabalhadas * this.valorHora;
    }
}
