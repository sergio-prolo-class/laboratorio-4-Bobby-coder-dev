package ifsc.poo;
import java.util.HashSet;
import java.util.Set;

public class Funcionario extends Pessoa {
    private static int idFuncionario;
    private String dataInicioContrato;

    public Funcionario(String nome, String sobrenome, String cpf, Set<String> email, String dataInicioContrato) {
        super(nome, sobrenome, cpf, email);
        this.dataInicioContrato = dataInicioContrato;
        this.idFuncionario = ++idFuncionario; // Incrementa o ID do funcionário
    }

    public int getIdFuncionario() {
        return idFuncionario;
    }

    public String getDataInicioContrato() {
        return dataInicioContrato;
    }

    @Override
    public String getResumo() {
        return "Funcionário: " + getNome() + " " + getSobrenome() +
               ", ID: " + idFuncionario +
               ", Data de Início do Contrato: " + dataInicioContrato;
    }
    
}