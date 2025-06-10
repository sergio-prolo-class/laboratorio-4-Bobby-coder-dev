package ifsc.poo;
import java.util.HashSet;
import java.util.Set;

public class Pessoa {
    protected String nome;
    protected String sobrenome;
    protected String cpf;
    protected Set<String> email;


    public Pessoa(String nome, String sobrenome, String cpf, Set<String> email) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
        this.email = new HashSet<>(email);
    }

    public String getNome() {
        return nome + " " + sobrenome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public String getCPF() {
        return cpf;
    }

    public String getEmail() {
        return String.join(", ", email);
    }

    public String getResumo() {
        return "Pessoa: " + nome + " " + sobrenome + ", CPF: " + cpf + ", Email: " + email;
    }
}