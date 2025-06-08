package ifsc.poo;

public class Cliente extends Pessoa {
    private static int idCliente = 0;
    private String endereco;
    private String telefone;
    private boolean genero;
    private String dataCadastro;

    public Cliente(String nome, String sobrenome, String cpf, String email, String endereco, String telefone, boolean genero, String dataCadastro) {
        super(nome, sobrenome, cpf, email);
        this.endereco = endereco;
        this.telefone = telefone;
        this.genero = genero;
        this.dataCadastro = dataCadastro;
        idCliente++;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public boolean isGenero() {
        return genero;
    }

    public String getDataCadastro() {
        return dataCadastro;
    }

    public int getIdCliente() {
        return idCliente;
    }

    @Override
    public String getResumo() {
        return "Cliente: " + getNome() + " " + getSobrenome() +
               ", Endereço: " + endereco +
               ", Telefone: " + telefone +
               ", Gênero: " + (genero ? "Masculino" : "Feminino") +
               ", Data de Cadastro: " + dataCadastro;
    }
}