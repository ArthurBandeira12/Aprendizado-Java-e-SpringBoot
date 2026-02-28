package Relacionamento1ParaN;

public class MainDepartamento {
    public static void main(String[] args) {
        Departamento dp = new Departamento("Recursos Humanos");

        dp.adicionarFuncionario("Julio");
        dp.adicionarFuncionario("Marina");
        dp.adicionarFuncionario("Marcio");

        dp.exibirDp();
    }
}