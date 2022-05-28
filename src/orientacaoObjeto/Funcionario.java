package orientacaoObjeto;

public abstract class Funcionario {
    private String nome;
    private String cpf;
    private final double salarioMinimo = 1000;

    public Funcionario() {
    }

    public Funcionario(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSalarioMinimo() {
        return salarioMinimo;
    }
    // método abstract não tem implementação;
    public abstract double calcularSalario();
}
