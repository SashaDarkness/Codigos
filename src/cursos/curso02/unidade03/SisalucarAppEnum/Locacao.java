package cursos.curso02.unidade03.SisalucarAppEnum;

import java.time.LocalDate;

public class Locacao {
    static long idLocacao;
    static long idCarro;
    static long idCliente;
    double valorLocado;
    LocalDate dataInicio;
    LocalDate dataFim;

    public Locacao(){}

    public Locacao(long idLocacao, long idCarro, long idCliente, double valorLocado, LocalDate dataInicio, LocalDate dataFim) {
        super();
        Locacao.idLocacao = idLocacao;
        Carro.idCarro = idCarro;
        Cliente.idCliente = idCliente;
        this.valorLocado = valorLocado;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
    }

    public static long getIdLocacao() {
        return idLocacao;
    }

    public static void setIdLocacao(long idLocacao) {
        Locacao.idLocacao = idLocacao;
    }

    public static long getIdCarro() {
        return idCarro;
    }

    public static void setIdCarro(long idCarro) {
        Locacao.idCarro = idCarro;
    }

    public static long getIdCliente() {
        return idCliente;
    }

    public static void setIdCliente(long idCliente) {
        Locacao.idCliente = idCliente;
    }

    public double getValorLocado() {
        return valorLocado;
    }

    public void setValorLocado(double valorLocado) {
        this.valorLocado = valorLocado;
    }

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(LocalDate dataInicio) {
        this.dataInicio = dataInicio;
    }

    public LocalDate getDataFim() {
        return dataFim;
    }

    public void setDataFim(LocalDate dataFim) {
        this.dataFim = dataFim;
    }
}
