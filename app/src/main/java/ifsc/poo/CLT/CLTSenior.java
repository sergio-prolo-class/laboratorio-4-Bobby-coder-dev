package ifsc.poo;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;


public class CLTSenior extends CLT {
    private String senioridade = "Senior";
    private int bonificacao; // Bônus para funcionários CLT Senior
    private List<CLTPleno> funcionario = new ArrayList<>();

    public CLTSenior(String nome, String sobrenome, String cpf, String email, String dataInicioContrato, int salario, int cargaHoraria, int numeroCarteiraTrabalho, int bonificacao, Set<String> habilidades) {
        super(nome, sobrenome, cpf, email, dataInicioContrato, salario, cargaHoraria, numeroCarteiraTrabalho, habilidades);
        this.bonificacao = bonificacao;
    }

    public void adicionarFuncionario(CLTPleno funcionario) {
        this.funcionario.add(funcionario);
    }

    @Override
    public String getResumo() {
        String habilidadesStr = String.join(", ", getHabilidades());
        return "CLT " + senioridade + ": ID " + getIdFuncionario() + ", Salário: " + getSalario() + ", Habilidades: " + habilidadesStr + 
               ", Bonificação: " + bonificacao + 
               ", Funcionários Orientados: " + funcionario.size() + 
               ", Carga Horária: " + getCargaHoraria() + 
               ", Número da Carteira de Trabalho: " + getNumeroCarteiraTrabalho();
    }
}