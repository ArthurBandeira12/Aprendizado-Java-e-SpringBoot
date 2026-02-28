package Relacionamento1ParaN;

import java.util.ArrayList;

public class Departamento {
    private String nome;
    ArrayList<Funcionario> funcionarios = new ArrayList<>();

    public Departamento(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void adicionarFuncionario(String nome){
        Funcionario funcionario = new Funcionario(nome);
        funcionario.departamento = this;
        this.funcionarios.add(funcionario);
    }

    public void exibirDp(){
        System.out.println("Departamento: " + this.nome);
        for(Funcionario f:funcionarios){
            System.out.println(f);
        }
    }
}
