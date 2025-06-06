package ifsc.poo;

public class CLTSenior extends CLT {
    private String senioridade = "Senior";
    private static CLTSenior funcionario;

    public CLTSenior(String nome, String sobrenome, String cpf, String email, String dataInicioContrato, int salario, int cargaHoraria, int numeroCarteiraTrabalho, CLTSenior funcionario) {
        super(nome, sobrenome, cpf, email, dataInicioContrato, salario, cargaHoraria, numeroCarteiraTrabalho);
        this.funcionario = funcionario;
    }

    @Override
    public String getResumo() {
        return "CLT " + senioridade + ": ID " + getIdFuncionario() + ", Salário: " + getSalario() + ", Habilidades: " + getHabilidades();
    }
}