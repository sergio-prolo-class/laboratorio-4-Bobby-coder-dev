package ifsc.poo;

public class ClientePremium extends Cliente {
    private static int idClientePremium = 0;
    private String dataVencimento;
    private FuncionarioCLTSenior representante;

    public ClientePremium(String nome, String sobrenome, String cpf, String email, String endereco, String telefone, boolean genero, String dataCadastro, String dataVencimento, FuncionarioCLTSenior representante) {
        super(nome, sobrenome, cpf, email, endereco, telefone, genero, dataCadastro);
        this.dataVencimento = dataVencimento;
        this.representante = representante;
        idClientePremium++;
    }

    public String getDataVencimento() {
        return dataVencimento;
    }

    public int getIdClientePremium() {
        return idClientePremium;
    }

    public FuncionarioCLTSenior getRepresentante() {
        return representante;
    }

    @Override
    public String getResumo() {
        return "ClientePremium: " + getNome() + " " + getSobrenome() +
               ", Vencimento: " + dataVencimento +
               ", Representante: " + (representante != null ? representante.getNome() : "Nenhum");
    }
}