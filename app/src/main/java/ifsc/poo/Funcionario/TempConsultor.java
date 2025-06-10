package ifsc.poo;
import java.util.Set;
import java.util.HashSet;

public class TempConsultor extends FuncionarioTemp {
    private int numRelatorios;
    private CLTPleno consultor;

    public TempConsultor(String nome, String sobrenome, String cpf, Set<String> email, String dataInicioContrato, String terminoContrato, int valorContrato, int numRelatorios, CLTPleno consultor) {
        super(nome, sobrenome, cpf, email, dataInicioContrato, terminoContrato, valorContrato);
        this.numRelatorios = numRelatorios;
        this.consultor = consultor;
    }

    @Override
    public String getResumo() {
        return "Funcionário temporário Consultor: " + getNome() + ", CPF: " + getCPF() + ", Email: " + getEmail() + ", Valor do Contrato: " + getValorContrato() + ", Número de Relatórios: " + numRelatorios +
         ", Consultor CLT Pleno: " + consultor.getNome() + ", ID: " + consultor.getIdFuncionario();
    }
}