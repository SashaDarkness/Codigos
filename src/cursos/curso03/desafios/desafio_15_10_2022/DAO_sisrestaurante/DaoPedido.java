package cursos.curso03.desafios.desafio_15_10_2022.DAO_sisrestaurante;

import java.util.ArrayList;
import java.util.List;

public class DaoPedido implements IDAO {
    private long idPedido;
    private DaoCliente cliente = new DaoCliente();
    private List<DaoCardapio> cardapios = new ArrayList<DaoCardapio>();
    private double totalPedido = 0;
    private static long id = 1;

    String pedidoFeito = "";
    @Override
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

    @Override
    public void editarPedido(Object entidade) {
        DaoCardapio novoCardapio = new DaoCardapio();

        for (int i = 0; i < this.cardapios.size(); i++) {
            if (cardapios.get(i).getNomeCardapio() == entidade) {
                cardapios.add(novoCardapio);
            }
        }
    }

    @Override
    public void addItem(Object entidade) {
        this.cardapios.add((DaoCardapio) entidade);
        this.totalPedido += ((DaoCardapio) entidade).getPrecoCardapio();
    }

    @Override
    public void removerItem(Object entidade) {
        for (int i = 0; i < this.cardapios.size(); i++) {
            if (cardapios.get(i).getNomeCardapio() == entidade) {
                cardapios.remove(i);
            }
        }
    }
    /*public void addItem(DaoCardapio cardapio) {
        this.cardapios.add(cardapio);
        this.totalPedido += cardapio.getPrecoCardapio();
    }*/

   /* public void removerItem(String nomePedido) {
        for (int i = 0; i < this.cardapios.size(); i++) {
            if (cardapios.get(i).getNomeCardapio() == nomePedido) {
                cardapios.remove(i);
            }
        }
    }*/

    /*String pedidoFeito = "";
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
    }*/

    /*public void editarPedido(String nomePedido) {
        DaoCardapio novoCardapio = new DaoCardapio();

        for (int i = 0; i < this.cardapios.size(); i++) {
            if (cardapios.get(i).getNomeCardapio() == nomePedido) {
                cardapios.add(novoCardapio);
            }
        }
    }*/

    // METODO CONSTRUTOR
    public DaoPedido() {
    }

    public DaoPedido(DaoCliente cliente, List<DaoCardapio> cardapios, double totalPedido) {
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
        DaoPedido.id = id;
    }

    public DaoCliente getCliente() {
        return cliente;
    }

    public void setCliente(DaoCliente cliente) {
        this.cliente = cliente;
    }

    public List<DaoCardapio> getCardapios() {
        return cardapios;
    }

    public void setCardapios(List<DaoCardapio> cardapios) {
        this.cardapios = cardapios;
    }

    public double getTotalPedido() {
        return totalPedido;
    }

    public void setTotalPedido(double totalPedido) {
        this.totalPedido = totalPedido;
    }


}
