package ifsc.poo;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;


public class CLTPleno extends CLT {
    private String senioridade = "Pleno";
    private List<CLTJunior> funcionarios = new ArrayList<>();
    private CLTSenior chefe;

    public CLTPleno(String nome, String sobrenome, String cpf, String email, String dataInicioContrato, int salario, int cargaHoraria, int numeroCarteiraTrabalho, CLTSenior chefe, Set<String> habilidades) {
        super(nome, sobrenome, cpf, email, dataInicioContrato, salario, cargaHoraria, numeroCarteiraTrabalho, habilidades);
        this.chefe = chefe;
    }

    public void adicionarFuncionario(CLTJunior orientado) {
        if (funcionarios.size() < 2) {
            funcionarios.add(orientado);
        } else {
            System.out.println("Não é possível adicionar mais de 2 funcionarios.");
        }
    }

    @Override
    public String getResumo() {
        String habilidadesStr = String.join(", ", getHabilidades());
        return "CLT " + senioridade + ": ID " + getIdFuncionario() + ", Salário: " + getSalario() + ", Habilidades: " + habilidadesStr + 
               ", Chefe: " + chefe.getNome() + " " + chefe.getSobrenome() + 
               ", Funcionários Orientados: " + funcionarios.size();
    }
}