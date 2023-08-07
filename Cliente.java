
package segurocarro;

public class Cliente {
    private String nome;
    private String cpf;  
    private Seguro[] seguro;


    public Cliente(String nome, String cpf, Seguro[] seguro) {
        this.nome = nome;
        this.cpf = cpf;
        this.seguro = seguro;
    }

    public Seguro[] getSeguro() {
        return seguro;
    }

    public void setSeguro(Seguro[] seguro) {
        this.seguro = seguro;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
}
