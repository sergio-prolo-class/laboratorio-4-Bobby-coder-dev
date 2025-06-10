package ifsc.poo;
import java.util.Set;
import java.util.HashSet;

public class FuncionarioTemp extends Funcionario{
    private String terminoContrato;
    private int valorContrato;

    public FuncionarioTemp(String nome, String sobrenome, String cpf, Set<String> email, String dataInicioContrato, String terminoContrato, int valorContrato) {
        super(nome, sobrenome, cpf, email, dataInicioContrato);
        this.terminoContrato = terminoContrato;
        this.valorContrato = valorContrato;
    }

    public String getTerminoContrato() {
        return terminoContrato;
    }

    public int getValorContrato() {
        return valorContrato;
    }

    @Override
    public String getResumo() {
        return "Funcionário Temporário: " + getNome() + " " + getSobrenome() +
               ", ID: " + getIdFuncionario() +
               ", Data de Início do Contrato: " + getDataInicioContrato() +
               ", Término do Contrato: " + terminoContrato +
               ", Valor do Contrato: " + valorContrato;
    }
}