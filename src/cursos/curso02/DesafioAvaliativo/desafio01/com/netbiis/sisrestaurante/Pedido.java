package cursos.curso02.DesafioAvaliativo.desafio01.com.netbiis.sisrestaurante;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private long idPedido;
    private Cliente cliente = new Cliente();
    private List<Cardapio> cardapios = new ArrayList<Cardapio>();
    private double totalPedido = 0;
    private static long id = 1;

    // METODO CONSTRUTOR
    public Pedido() {
    }

    public Pedido(Cliente cliente, List<Cardapio> cardapios, double totalPedido) {
        this.idPedido = id;
        this.cliente = cliente;
        this.cardapios = cardapios;
        this.totalPedido = totalPedido;
        id++;
    }

    // METODOS GETTERS E SETTERS
    public long getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(long idPedido) {
        this.idPedido = idPedido;
    }

    public static long getId() {
        return id;
    }

    public static void setId(long id) {
        Pedido.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<Cardapio> getCardapios() {
        return cardapios;
    }

    public void setCardapios(List<Cardapio> cardapios) {
        this.cardapios = cardapios;
    }

    public double getTotalPedido() {
        return totalPedido;
    }

    public void setTotalPedido(double totalPedido) {
        this.totalPedido = totalPedido;
    }
}
