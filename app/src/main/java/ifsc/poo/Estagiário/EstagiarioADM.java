package ifsc.poo;
import java.util.Set;
import java.util.HashSet;

public class EstagiarioADM extends Estagiario {
    private String setor;
    private String descricaoTarefa;

    public EstagiarioADM(String nome, String sobrenome, String cpf, Set<String> email, String dataInicioContrato, int bolsaAuxilio, int cargaHoraria, String setor, String descricaoTarefa, String instituicaoEnsino, CLT orientador) {
        super(nome, sobrenome, cpf, email, dataInicioContrato, bolsaAuxilio, cargaHoraria, instituicaoEnsino, orientador);
        this.setor = setor;
        this.descricaoTarefa = descricaoTarefa;
    }

    public String getSetor() {
        return setor;
    }

    public String getDescricaoTarefa() {
        return descricaoTarefa;
    }

    @Override
    public String getResumo() {
        return "Estagiário ADM: " + getNome() + ", Setor: " + setor + ", Descrição da Tarefa: " + descricaoTarefa +
               ", Bolsa Auxílio: " + getBolsaAuxilio() + ", Carga Horária: " + getCargaHoraria() +
               ", Instituição: " + getInstituicaoEnsino() +
               ", Orientador: " + (getOrientador() != null ? getOrientador().getResumo() : "Nenhum orientador designado")   ; 
    }
}