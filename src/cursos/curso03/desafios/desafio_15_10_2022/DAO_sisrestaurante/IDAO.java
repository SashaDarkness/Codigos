package cursos.curso03.desafios.desafio_15_10_2022.DAO_sisrestaurante;
public interface IDAO <T> {
    public String listarPedidoCardapio();
    public void editarPedido(T entidade);
    public void addItem(T entidade);
    public void removerItem(T entidade);

    //public void gravarCliente(T entidade);
    //public void gravarProduto(T[] entidade);
    //public void gravarPedido(T entidade);
}
