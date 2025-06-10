package ifsc.poo;
import java.util.Set;
import java.util.HashSet;

public class CLTJunior extends CLT {
    private String senioridade = "Junior";
    private CLTPleno orientador;

    public CLTJunior(String nome, String sobrenome, String cpf, Set<String> email, String dataInicioContrato, int salario, int cargaHoraria, int numeroCarteiraTrabalho, CLTPleno orientador, Set<String> habilidades) {
        super(nome, sobrenome, cpf, email, dataInicioContrato, salario, cargaHoraria, numeroCarteiraTrabalho, habilidades);
        this.orientador = orientador;
    }

    @Override
    public String getResumo() {
        String habilidadesStr = String.join(", ", getHabilidades());
        return "CLT " + senioridade + ": ID " + getIdFuncionario() + ", Salário: " + getSalario() + ", Habilidades: " + habilidadesStr + 
               ", Orientador: " + orientador.getNome() + " " + orientador.getSobrenome();
    }
}