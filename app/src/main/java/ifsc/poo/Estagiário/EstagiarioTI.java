package ifsc.poo;

public class EstagiarioTI extends Estagiario {
    private String numeroSerieComputador;
    private boolean remotaPresencial; // true = remoto, false = presencial

    public EstagiarioTI(String nome, String sobrenome, String cpf, String email, String dataInicioContrato, int bolsaAuxilio, int cargaHoraria, String numeroSerieComputador, boolean remotaPresencial, String instituicaoEnsino, CLT orientador) {
        super(nome, sobrenome, cpf, email, dataInicioContrato, bolsaAuxilio, cargaHoraria, instituicaoEnsino, orientador);
        this.numeroSerieComputador = numeroSerieComputador;
        this.remotaPresencial = remotaPresencial;
    }

    public String getNumeroSerieComputador() {
        return numeroSerieComputador;
    }

    public boolean isRemotaPresencial() {
        return remotaPresencial;
    }

    @Override
    public String getResumo() {
        return "Estagiário TI: " + getNome() + ", Número de Série do Computador: " + numeroSerieComputador + 
               ", Tipo de Trabalho: " + (remotaPresencial ? "Remoto" : "Presencial") + 
               ", Instituição: " + getInstituicaoEnsino() + 
               ", Orientador: " + (getOrientador() != null ? getOrientador().getResumo() : "Nenhum orientador designado");
    }
}