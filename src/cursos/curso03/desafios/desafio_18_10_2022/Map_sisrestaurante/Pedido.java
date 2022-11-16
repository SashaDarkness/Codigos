package cursos.curso03.desafios.desafio_18_10_2022.Map_sisrestaurante;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private long idPedido;
    private Cliente cliente = new Cliente();
    private List<Cardapio> cardapios = new ArrayList<Cardapio>();
    private double totalPedido = 0;
    private static long id = 1;

    public void addItem(Cardapio cardapio) {
        this.cardapios.add(cardapio);
        this.totalPedido += cardapio.getPrecoCardapio();
    }

    public void removerItem(String nomePedido) {
        for (int i = 0; i < this.cardapios.size(); i++) {
            if (cardapios.get(i).getNomeCardapio() == nomePedido) {
                cardapios.remove(i);
            }
        }
    }

    String pedidoFeito = "";
    public String listarPedidoCardapio() {
        pedidoFeito += "\nInformações do cliente:" +
                "\nNome: " + cliente.getNome() +
                "\nCPF: " + cliente.getCpf() +
                "\nEndereço: " + cliente.getEndereco() +
                "\nTelefone: " + cliente.getTelefone() +
                "\n------------ PEDIDOS FEITOS ------------\n";

        for (int i = 0; i < this.getCardapios().size(); i++) {
            pedidoFeito +=
                    "\n|-> Nome do Produto: " + this.getCardapios().get(i).getNomeCardapio() +
                    "\n|-> descrição do Produto: " + this.getCardapios().get(i).getDescricaoCardapio() +
                    "\n|-> Preço do Produto: " + this.getCardapios().get(i).getPrecoCardapio() + "\n";
        }

        pedidoFeito += "\n|-> Total do pedido: " + this.totalPedido +
        "\n--------------------------------------------";
        return pedidoFeito;
    }

    public void editarPedido(String nomePedido) {
        Cardapio novoCardapio = new Cardapio();

        for (int i = 0; i < this.cardapios.size(); i++) {
            if (cardapios.get(i).getNomeCardapio() == nomePedido) {
                cardapios.add(novoCardapio);
            }
        }
    }


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
