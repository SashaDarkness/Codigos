package cursos.curso02.DesafiosNaAula.desafio_06_10_2022.Restaurante;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Restaurante2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List p = new ArrayList();

        Cliente cliente = new Cliente();
        Prato prato, prato2, prato3;
        Pedido pedido, pedido1 = new Pedido(cliente);
        Pedido pedido2 = new Pedido(cliente);
        Pedido pedido3 = new Pedido(cliente);


        System.out.println("ESCOLHA ITENS ABAIXO DO CARDAPIO:" +
                " \n1. Bolo de Morango - R$ 10.99 \n2. Lasanha - R$ 5.50 \n3. Coxinha - R$ 3.50 \n4. Açaí - R$ 13.5.");
        System.out.println("Informe o que deseja: ");
        p = Collections.singletonList(input.nextLine());




        Object[] opcao = {"Bolo de Morango - R$ 10.99", "Lasanha - R$ 5.50", "Coxinha - R$ 3.50", "Açaí - R$ 13.5", "Finalizar Pedido"};
        Object opcaoValue = JOptionPane.showInputDialog(null, "ESCOLHA O QUE DESEJA NO CARDAPIO:\n", "LANCHES",
                JOptionPane.INFORMATION_MESSAGE, null, opcao, opcao[0]);

        if (opcao != null) {
            if (opcaoValue.equals("Bolo de Morango - R$ 10.99")) {
                prato = new Prato("Bolo de Morango", 10.99, 150, "Bolinho de morando", 1);
                pedido = new Pedido(cliente);
                pedido.addItem(prato);
                Restaurante.main(null);
                //Restaurante.main((String[]) opcaoValue);
            }
            if (opcaoValue.equals("Lasanha - R$ 5.50")) {
                prato2 = new Prato("Lasanha", 5.50, 100, "Lasanha", 1);
                pedido2 = new Pedido(cliente);
                pedido2.addItem(prato2);
                Restaurante.main(null);
            }
            if (opcaoValue.equals("Coxinha - R$ 3.50")) {
                prato2 = new Prato("Lasanha", 5.50, 100, "Lasanha", 1);
                pedido2 = new Pedido(cliente);
                pedido2.addItem(prato2);
                Restaurante.main(null);
            }
            if (opcaoValue.equals("Açaí - R$ 13.50")) {
                prato3 = new Prato("Açaí", 13.50, 100, "Lasanha", 1);
                pedido3 = new Pedido(cliente);
                pedido3.addItem(prato3);
                Restaurante.main((String[]) opcaoValue);
            }
            if (opcaoValue.equals("Finalizar Pedido")) {
                cliente.setNomeCliente(JOptionPane.showInputDialog("Insira o seu nome:"));
                cliente.setEndereco(JOptionPane.showInputDialog("Insira o seu Endereço:"));
                cliente.setTelefone(JOptionPane.showInputDialog("Insira o seu Telefone:"));
                pedido1 = new Pedido(cliente);
                pedido1.concluirPedido();
            }

        }



    }
}