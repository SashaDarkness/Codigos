package cursos.curso02.unidade03.SisalucarAppEnum;

public class Cliente {
    static long idCliente;
    String cpf;
    String nome;
    String cnh;

    public Cliente(){}

    public Cliente(long idCliente, String cpf, String nome, String cnh) {
        super();
        Cliente.idCliente = idCliente;
        this.cpf = cpf;
        this.nome = nome;
        this.cnh = cnh;
    }

    public static long getIdCliente() {
        return idCliente;
    }

    public static void setIdCliente(long idCliente) {
        Cliente.idCliente = idCliente;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnh() {
        return cnh;
    }

    public void setCnh(String cnh) {
        this.cnh = cnh;
    }
}
