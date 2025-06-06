package ifsc.poo;

public class Pessoa {
    protected String nome;
    protected String sobrenome;
    protected String cpf;
    protected String email;

    public Pessoa(String nome, String sobrenome, String cpf, String email) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
        this.email = email;
    }

    public String getNome() {
        return nome + " " + sobrenome;
    }

    public String getCPF() {
        return cpf;
    }

    public String getEmail() {
        return email;
    }

    public String getResumo() {
        return "Pessoa: " + nome + " " + sobrenome + ", CPF: " + cpf + ", Email: " + email;
    }
}