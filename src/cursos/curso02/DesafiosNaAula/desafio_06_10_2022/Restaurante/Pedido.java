package cursos.curso02.DesafiosNaAula.desafio_06_10_2022.Restaurante;

import java.util.ArrayList;

public class Pedido {
    private static long idPedido;
    private Cliente cliente;
    private double valorTotal = 0;
    private ArrayList<Prato> pratos;
    private static long id = 0;

    public Pedido(Cliente cliente) {
        this.cliente = cliente;
        Pedido.idPedido = Pedido.id;
        this.pratos = new ArrayList<Prato>();
        id++;
    }

    public void addItem(Prato prato) {
        pratos.add(prato);
        this.valorTotal += prato.getPreco();
    }

    public void removerItem(Prato prato) {
        pratos.remove(prato);
        this.valorTotal -= prato.getPreco();
    }

    public void concluirPedido() {
        System.out.println("Id Pedido: " + idPedido);
        System.out.println("Nome do Cliente: " + cliente.getNomeCliente());
        System.out.println("Endereço do Cliente: " + cliente.getEndereco());
        System.out.println("Telefone do Cliente: " + cliente.getTelefone());
        System.out.println("Pedidos feitos: ");

        for(Prato cardapio: pratos ){
            System.out.println("- " + cardapio.getNomePrato()+" --- Valor: " + cardapio.getPreco());
        }
        System.out.println("- Total Conta: " + TotalConta());
    }

    public double TotalConta(){
        return this.valorTotal;
    }

    public Pedido(){}

    public Pedido(Cliente cliente, double valorTotal, ArrayList<Prato> pratos) {
        Pedido.idPedido = id;
        this.cliente = cliente;
        this.valorTotal = valorTotal;
        this.pratos = pratos;
        id++;
    }

    public Cliente getNomeCliente() {
        return cliente;
    }

    public void setNomeCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public ArrayList<Prato> getNomePratos() {
        return pratos;
    }

    public void setNomePratos(ArrayList<Prato> pratos) {
        this.pratos = pratos;
    }

    public long getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(long idPedido) {
        Pedido.idPedido = idPedido;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal ;
    }

    public static long getId() {
        return id;
    }

    public static void setId(long id) {
        Pedido.id = id;
    }
}
