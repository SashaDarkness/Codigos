package cursos.curso02.DesafiosNaAula.desafio_06_10_2022.Restaurante;

public class Cliente {
    private static long idCliente;
    private String nomeCliente;
    private String endereco;
    private String telefone;
    private static long id = 0;

    public Cliente(){
    }

    public Cliente(String nomeCliente, String endereco, String telefone) {
        Cliente.idCliente = id;
        this.nomeCliente = nomeCliente;
        this.endereco = endereco;
        this.telefone = telefone;
        id++;
    }

    public long getIdCliente() {
        return idCliente;
    }

    public static void setIdCliente(long idCliente) {
        Cliente.idCliente = idCliente;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public static long getId() {
        return id;
    }

    public static void setId(long id) {
        Cliente.id = id;
    }
}
