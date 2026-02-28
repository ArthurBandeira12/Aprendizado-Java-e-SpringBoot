package Relacionamento1ParaN;

public class Funcionario {
    private String nome;
    public Departamento departamento;

    public Funcionario(String nome) {
        this.nome = nome;

    }

    public String getNome() {
        return nome;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                '}';
    }
}
