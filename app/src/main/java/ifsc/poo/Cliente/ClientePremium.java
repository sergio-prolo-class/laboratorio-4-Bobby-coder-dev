package ifsc.poo;
import java.util.Set;
import java.util.HashSet;

public class ClientePremium extends Cliente {
    private static int idClientePremium = 0;
    private String dataVencimento;
    private CLTSenior representante;

    public ClientePremium(String nome, String sobrenome, String cpf, Set<String> email, String endereco, String telefone, boolean genero, String dataCadastro, String dataVencimento, CLTSenior representante) {
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

    public CLTSenior getRepresentante() {
        return representante;
    }

    @Override
    public String getResumo() {
        return "ClientePremium: " + getNome() + " " + getSobrenome() +
               ", Vencimento: " + dataVencimento +
               ", Representante: " + (representante != null ? representante.getNome() : "Nenhum");
    }
}