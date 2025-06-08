package ifsc.poo;

public class TempTecnico extends FuncionarioTemp {
    private String tipoContrato = "Técnico";
    private String turno;
    private boolean necessidadeEPI;

    public TempTecnico(String nome, String sobrenome, String cpf, String email, String dataInicioContrato, String terminoContrato, int valorContrato, String turno, boolean necessidadeEPI) {
        super(nome, sobrenome, cpf, email, dataInicioContrato, terminoContrato, valorContrato);
        this.turno = turno;
        this.necessidadeEPI = necessidadeEPI;
    }

    public String getTurno() {
        return turno;
    }

    public boolean isNecessidadeEPI() {
        return necessidadeEPI;
    }

    @Override
    public String getResumo() {
        return "Funcionário temporário técnico" + tipoContrato + ": ID " + getIdFuncionario() + ", Salário: " + getValorContrato() + ", Termino do contrato: " + getTerminoContrato();
    }
}