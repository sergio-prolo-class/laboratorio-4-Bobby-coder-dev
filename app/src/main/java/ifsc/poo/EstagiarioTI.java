package ifsc.poo;

public class EstagiarioTI extends Estagiario {
    private String numeroSerieComputador;
    private boolean remotaPresencial; // true = remoto, false = presencial

    public EstagiarioTI(String nome, String sobrenome, String cpf, String email, String dataInicioContrato, int cargaHoraria, String numeroSerieComputador, boolean remotaPresencial, String instituicaoEnsino,CLT orientador) {
        super(nome, sobrenome, cpf, email, dataInicioContrato, cargaHoraria, instituicaoEnsino, orientador);
        this.numeroSerieComputador = numeroSerieComputador;
        this.remotaPresencial = remotaPresencial;
    }

    public String getNumeroSerieComputador() {
        return numeroSerieComputador;
    }

    public boolean isRemotaPresencial() {
        return remotaPresencial;
    }
}