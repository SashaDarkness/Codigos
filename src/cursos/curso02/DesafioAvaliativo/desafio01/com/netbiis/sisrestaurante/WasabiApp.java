package cursos.curso02.DesafioAvaliativo.desafio01.com.netbiis.sisrestaurante;

import cursos.curso02.DesafioAvaliativo.desafio01.com.netbiis.sisrestaurante.*;
public class WasabiApp {
    public static void main(String[] args){

        Cardapio cardapio = new Cardapio();
        Cliente cliente = new Cliente();
        Pedido pedido = new Pedido();

        cliente.setNome("Sasha");
        cliente.setCpf("444.000.555-00");
        cliente.setEndereco("Rua tal");
        cliente.setTelefone("91940028922");
        cliente.setCartaoCredito("1234567890");

        System.out.println("Dados Cliente:\n"+cliente.getNome()+", "+cliente.getCpf()+", "+cliente.getEndereco()+", "+
                cliente.getTelefone()+", "+cliente.getCartaoCredito());
    }
}