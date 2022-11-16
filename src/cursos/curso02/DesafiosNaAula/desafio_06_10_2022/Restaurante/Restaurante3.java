package cursos.curso02.DesafiosNaAula.desafio_06_10_2022.Restaurante;

import java.util.Scanner;

public class Restaurante3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Cliente cliente = new Cliente("Sasha","Lugar Tal","40028922");
        Cliente cliente = new Cliente();
        cliente.setNomeCliente("Sasha");
        cliente.setEndereco("Guama");
        cliente.setTelefone("40028922");

        Prato p = new Prato();
        for (int i = 0; i < 3; i++){
            System.out.println("Informe o que deseja:");
            String escolha = input.nextLine();
            p.setNomePrato(escolha);
            System.out.println("Informe o valor:");
            String valor = input.nextLine();
            p.setNomePrato(valor);
        }

        Pedido pedido = new Pedido(cliente);
        pedido.addItem(p);
        pedido.concluirPedido();

        //Prato prato1 = new Prato("Bolo de Morango",15.35,150,"Bolinho de morando",1);
        //Prato prato2 = new Prato("Lasanha",10.20,100,"Lasanha",1);
        //Prato prato3 = new Prato("Coxinha",7.50,80,"Lasanha",1);
        //Pedido pedido1 = new Pedido(cliente);
        //pedido1.addItem(prato1);
        //pedido1.addItem(prato2);
        //pedido1.addItem(prato3);
        //pedido1.concluirPedido();
        //System.out.println("\n-------- ITEM REMOVIDO----------");
        //pedido1.removerItem(prato3);
        //pedido1.concluirPedido();

    }
}