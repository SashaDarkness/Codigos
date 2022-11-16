package cursos.curso03.desafios.desafio_18_10_2022.Map_sisrestaurante;

import javax.swing.*;
import java.awt.*;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WasabiApp {
    public static void main(String[] args) throws IOException {
        Map<Cliente, Pedido> map1 = new HashMap<>();

        Cliente cliente = new Cliente();
        Pedido pedido = new Pedido();
        Cardapio cardapio = new EstoqueDisponivel();

        List<String> listaPratos = new ArrayList<>();
        List<EstoqueDisponivel> estoqueDisponiveisPratos = new ArrayList<>();

        String[] concluirEscolhas = { "SIM", "NÃO" };
        String[] menu = { "PRATOS DE ENTRADA", "PRATOS PROMOCIONAIS", "PRATOS TEMAKI ESPECIAL", "PRATOS HOLL WASSABI" };

        JOptionPane.showInternalMessageDialog(null, "-------------- Seja Bem Vindo ao Wasabi App --------------" +
                "\n\tInforme os seus dados a seguir para iniciar a sessão.",
                "RESTAURANTE WASAPI APP", JOptionPane.PLAIN_MESSAGE); // PLAIN_MESSAGE==DEFAULT_OPTION
        cliente.setNome(JOptionPane.showInputDialog(null, "Informe seu nome:",
                "RESTAURANTE WASABI APP", JOptionPane.QUESTION_MESSAGE));
        cliente.setEndereco(JOptionPane.showInputDialog(null, "Informe seu Enderço:",
                "RESTAURANTE WASABI APP", JOptionPane.QUESTION_MESSAGE));
        cliente.setTelefone(JOptionPane.showInputDialog(null, "Informe seu Telefone:",
                "RESTAURANTE WASABI APP", JOptionPane.QUESTION_MESSAGE));
        cliente.setCpf(JOptionPane.showInputDialog(null, "Informe seu CPF:",
                "RESTAURANTE WASABI APP", JOptionPane.QUESTION_MESSAGE));
        cliente.setCartaoCredito(JOptionPane.showInputDialog(null, "Informe seu Cartão de Crédito:",
                "RESTAURANTE WASAPI APP", JOptionPane.QUESTION_MESSAGE));
        pedido.setCliente(cliente);

        boolean continuar = true;
        while (continuar) {
            Object menuValue = JOptionPane.showInputDialog(null, "ESCOLHA O CARDÁPIO ABAIXO:",
                    "RESTAURANTE WASABI APP", JOptionPane.PLAIN_MESSAGE, null, menu, menu[0]);

            if (menuValue.equals("PRATOS DE ENTRADA")) {
                estoqueDisponiveisPratos = EstoqueDisponivel.getEstoquePratosEntrada(); // estoqueDisponiveisPratos=((EstoqueDisponivel)cardapio).getEstoquePratosEntrada();

                for (EstoqueDisponivel e : estoqueDisponiveisPratos) {
                    listaPratos.add(e.getNomeCardapio());
                }

            } else if (menuValue.equals("PRATOS PROMOCIONAIS")) {
                estoqueDisponiveisPratos = EstoqueDisponivel.getEstoquePratosPromocionais();

                for (EstoqueDisponivel e : estoqueDisponiveisPratos) {
                    listaPratos.add(e.getNomeCardapio());
                }

            } else if (menuValue.equals("PRATOS TEMAKI ESPECIAL")) {
                estoqueDisponiveisPratos = EstoqueDisponivel.getEstoquePratosTemakiEspecial();

                for (EstoqueDisponivel e : estoqueDisponiveisPratos) {
                    listaPratos.add(e.getNomeCardapio());
                }

            } else {
                estoqueDisponiveisPratos = EstoqueDisponivel.getEstoquePratosHollWassabi();

                for (EstoqueDisponivel e : estoqueDisponiveisPratos) {
                    listaPratos.add(e.getNomeCardapio());
                }

            }

            Object[] lista = listaPratos.toArray();
            String adicionarPratos = (String) JOptionPane.showInputDialog(null, "Selecione o prato desejado",
                    "RESTAURANTE WASAPI APP", JOptionPane.QUESTION_MESSAGE, null, lista, lista[0]); // before:null--after:lista[0]

            for (EstoqueDisponivel estoque : estoqueDisponiveisPratos) {
                // if (estoque.getNomeCardapio().equals(adicionarPratos)) {

                if (estoque.getNomeCardapio() == adicionarPratos) {
                    cardapio = estoque;
                }
            }

            pedido.addItem(cardapio);
            listaPratos.clear();

            continuar = JOptionPane.showOptionDialog(null, "deseja continuar ?",
                    "titulo", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,
                    null, concluirEscolhas, null) == JOptionPane.YES_OPTION;
        }

        continuar = true;
        while (continuar) {
            String[] opcao = { "Consultar Pedido", "Remover Pedido", "Adicionar Pedido", "Finalizar Pedido e Sair", "Desistir e Sair" };
            Object opcaoValue = JOptionPane.showInputDialog(null,
                    "Selecione a opção abaixo para verificar o seu Pedido:", "RESTAURANTE WASABI APP",
                    JOptionPane.PLAIN_MESSAGE, null, opcao, opcao[0]);

            if (opcaoValue.equals("Consultar Pedido")) {

                map1.put(cliente,pedido);
                System.out.println(map1);

                JOptionPane area = new JOptionPane(pedido.listarPedidoCardapio());
                JScrollPane scrollPane = new JScrollPane(area);

                scrollPane.setPreferredSize(new Dimension(600,500));
                JOptionPane.showMessageDialog(null, scrollPane);

            } else if (opcaoValue.equals("Remover Pedido")) { // (opcaoValue2.equals("Editar Pedido"))

                for (int i = 0; i < pedido.getCardapios().size(); i++) {
                        listaPratos.add(pedido.getCardapios().get(i).getNomeCardapio());
                }

                Object[] listaSelecionados = listaPratos.toArray();
                String SelecionarTipoCardapio = (String) JOptionPane.showInputDialog(null,
                        "Selecione um prato para removê-lo: ", "RESTAURANTE WASAPI APP",
                        JOptionPane.QUESTION_MESSAGE, null, listaSelecionados, listaSelecionados[0]);

                pedido.removerItem(SelecionarTipoCardapio);
                JOptionPane.showMessageDialog(null, SelecionarTipoCardapio + " Excluído com  sucesso !");

            } else if (opcaoValue.equals("Adicionar Pedido")) {

                for (int i = 0; i < pedido.getCardapios().size(); i++) {
                    listaPratos.add(pedido.getCardapios().get(i).getNomeCardapio());
                }

                Object[] listaSelecionados = listaPratos.toArray();
                String SelecionarTipoCardapio = (String) JOptionPane.showInputDialog(null,
                        "Selecione um pratp para adiciona-lo novamente: ", "RESTAURANTE WASAPI APP",
                        JOptionPane.QUESTION_MESSAGE, null, listaSelecionados, listaSelecionados[0]);

                pedido.editarPedido(SelecionarTipoCardapio);
                JOptionPane.showMessageDialog(null, SelecionarTipoCardapio + " adicionado com  sucesso !");

            } else if (opcaoValue.equals("Finalizar Pedido e Sair")) {
                continuar = false;

                FileWriter pedidosFeitos = new FileWriter("notaFiscalPedidos.txt");
                PrintWriter gravarPedidos = new PrintWriter(pedidosFeitos);

                gravarPedidos.println("\n" + pedido.listarPedidoCardapio());

                pedidosFeitos.close();
                gravarPedidos.close();

            } else {
                System.exit(0);
            }

        }

    }

}
