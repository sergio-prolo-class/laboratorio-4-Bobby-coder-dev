package ifsc.poo;

public class CLTJunior extends CLT {
    private String senioridade = "Junior";
    private static CLTJunior orientador;

    public CLTJunior(String nome, String sobrenome, String cpf, String email, String dataInicioContrato, int salario, int cargaHoraria, int numeroCarteiraTrabalho, CLTJunior orientador) {
        super(nome, sobrenome, cpf, email, dataInicioContrato, salario, cargaHoraria, numeroCarteiraTrabalho);
        this.orientador = orientador;
    }

    @Override
    public String getResumo() {
        return "CLT " + senioridade + ": ID " + getIdFuncionario() + ", Salário: " + getSalario() + ", Habilidades: " + getHabilidades();
    }
}