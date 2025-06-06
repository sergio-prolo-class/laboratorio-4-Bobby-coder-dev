package ifsc.poo;
import java.util.List;
import java.util.ArrayList;

public class CLTPleno extends CLT {
    private String senioridade = "Pleno";
    private static List<CLTPleno> orientados = new ArrayList<>();
    private static CLTPleno chefe;

    public CLTPleno(String nome, String sobrenome, String cpf, String email, String dataInicioContrato, int salario, int cargaHoraria, int numeroCarteiraTrabalho, List<CLTPleno> orientados) {
        super(nome, sobrenome, cpf, email, dataInicioContrato, salario, cargaHoraria, numeroCarteiraTrabalho);
        this.orientados = orientados;
    }

    @Override
    public String getResumo() {
        return "CLT " + senioridade + ": ID " + getIdFuncionario() + ", Salário: " + getSalario() + ", Habilidades: " + getHabilidades();
    }
}