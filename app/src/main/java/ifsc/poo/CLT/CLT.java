package ifsc.poo;
import java.util.HashSet;
import java.util.Set;
import java.util.ArrayList;
import java.util.List;

public class CLT extends Funcionario{
    private int salario;
    private int cargaHoraria;
    private int numeroCarteiraTrabalho;
    private Set<String> habilidades;
    private List<Estagiario> estagiariosOrientados;

    public CLT(String nome, String sobrenome, String cpf, String email, String dataInicioContrato, int salario, int cargaHoraria, int numeroCarteiraTrabalho, Set<String> habilidades) {
        super(nome, sobrenome, cpf, email, dataInicioContrato);
        this.salario = salario;
        this.cargaHoraria = cargaHoraria;
        this.numeroCarteiraTrabalho = numeroCarteiraTrabalho;
        this.habilidades = new HashSet<>();
        this.estagiariosOrientados = new ArrayList<>();
    }

    public boolean adicionarEstagiarioOrientado(Estagiario estagiario) {
        if (estagiariosOrientados.size() < 2) {
            estagiariosOrientados.add(estagiario);
            return true;
        }
        return false; // Não pode orientar mais de 2
    }

    public boolean removerEstagiarioOrientado(Estagiario estagiario) {
        return estagiariosOrientados.remove(estagiario);
    }

    public List<Estagiario> getEstagiariosOrientados() {
        return estagiariosOrientados;
    }

    public int getSalario() {
        return salario;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public int getNumeroCarteiraTrabalho() {
        return numeroCarteiraTrabalho;
    }

    public Set<String> getHabilidades() {
        return habilidades;
    }

    @Override
    public String getResumo() {
        return "CLT: ID " + getIdFuncionario() + ", Salário: " + salario + ", Habilidades: " + habilidades +
               ", Estagiários Orientados: " + estagiariosOrientados.size();
    }
}