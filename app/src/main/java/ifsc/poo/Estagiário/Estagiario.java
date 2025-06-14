package ifsc.poo;
import java.util.Set;
import java.util.HashSet;

public class Estagiario extends Funcionario {
    private int bolsaAuxilio;
    private int cargaHoraria;
    private String instituicaoEnsino;
    private CLT orientador;

    public Estagiario(String nome, String sobrenome, String cpf, Set<String> email, String dataInicioContrato, int bolsaAuxilio, int cargaHoraria, String instituicaoEnsino, CLT orientador) {
        super(nome, sobrenome, cpf, email, dataInicioContrato);
        this.bolsaAuxilio = bolsaAuxilio;
        this.cargaHoraria = cargaHoraria;
        this.instituicaoEnsino = instituicaoEnsino;
        this.orientador = orientador;
    }

    public int getBolsaAuxilio() {
        return bolsaAuxilio;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public String getInstituicaoEnsino() {
        return instituicaoEnsino;
    }

    public CLT getOrientador() {
        return orientador;
    }

    @Override
    public String getResumo() {
        return "Estagiário: " + getNome() + ", Bolsa Auxílio: " + bolsaAuxilio + ", Carga Horária: " + cargaHoraria + ", Instituição: " + instituicaoEnsino +
               ", Orientador: " + (orientador != null ? orientador.getResumo() : "Nenhum orientador designado");
    }
}