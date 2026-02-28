package Relacionamento1ParaN;

public class Hospital {
    public static void main(String[] args) {
        Medico m1 = new Medico("Arthur", "Cardiologista");

        m1.adicionarPaciente("Rafaela", 24);
        m1.adicionarPaciente("Julio", 12);
        m1.adicionarPaciente("Ana", 56);

        m1.exibirPaciente();
    }
}
