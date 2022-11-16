package cursos.curso02.DesafiosNaAula.desafio_06_10_2022.Restaurante;

public class Prato {
    private static long idPrato;
    private String nomePrato;
    private double preco;
    private double peso;
    private String descricao;
    private int quantidadeDisponivel;

    private static long id = 0;

    public Boolean consultarDisponibilidade() {
        return false;
    }

    public Prato() {
    }

    public Prato(String nomePrato, double preco, double peso, String descricao,
            int quantidadeDisponivel) {
        Prato.idPrato = id;
        this.nomePrato = nomePrato;
        this.preco = preco;
        this.peso = peso;
        this.descricao = descricao;
        this.quantidadeDisponivel = quantidadeDisponivel;
        id++;
    }

    public static long getIdPrato() {
        return idPrato;
    }

    public void setIdPrato(long idPrato) {
        Prato.idPrato = idPrato;
    }

    public String getNomePrato() {
        return nomePrato;
    }

    public void setNomePrato(String nomePrato) {
        this.nomePrato = nomePrato;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQuantidadeDisponivel() {
        return quantidadeDisponivel;
    }

    public void setQuantidadeDisponivel(int quantidadeDisponivel) {
        this.quantidadeDisponivel = quantidadeDisponivel;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        Prato.id = id;
    }
}
