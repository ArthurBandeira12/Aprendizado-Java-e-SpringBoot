package Relacionamento1ParaN;

import java.util.ArrayList;
import java.util.List;

public class Medico {
    private String nome;
    private String especialidade;
    List<Paciente> pacientes = new ArrayList<>();

    public Medico(String nome, String especialidade){
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public void adicionarPaciente(String nome, int idade){
        Paciente paciente = new Paciente(nome, idade);
        paciente.medico =  this;
        this.pacientes.add(paciente);

    }


    public void exibirPaciente(){
        System.out.println("Medico: " + this.nome + "\nEspecialidade: " + this.especialidade);
        for(Paciente p:pacientes){
            System.out.println(p);
        }
    }
}
