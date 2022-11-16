package cursos.curso03.desafios.desafio_15_10_2022.DAO_sisrestaurante;

public class DaoCliente {
    private String nome;
    private String cpf;
    private String telefone;
    private String endereco;
    private String cartaoCredito;

    public DaoCliente() {
    }

    public DaoCliente(String nome, String cpf, String telefone, String endereco, String cartaoCredito) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.endereco = endereco;
        this.cartaoCredito = cartaoCredito;
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

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCartaoCredito() {
        return cartaoCredito;
    }

    public void setCartaoCredito(String cartaoCredito) {
        this.cartaoCredito = cartaoCredito;
    }
}
