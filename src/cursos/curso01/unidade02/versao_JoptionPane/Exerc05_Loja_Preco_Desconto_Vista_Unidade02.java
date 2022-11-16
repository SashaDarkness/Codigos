package cursos.curso01.unidade02.versao_JoptionPane;

import javax.swing.JOptionPane;

public class Exerc05_Loja_Preco_Desconto_Vista_Unidade02 {
    public static void main(String[] args){
        double valor_total = 0;

        Double preco = Double.parseDouble(JOptionPane.showInputDialog("Qual o preço do produto?"));
        Integer opcao = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma opção de pagamento:"
                + "\n1 - À vista 10%"
                + "\n2 - Parcelar (3x vezes - mesmo valor)"));

        JOptionPane.showMessageDialog(null,"Valor final do produto: R$" +
                switch(opcao) {
                    case 1 -> valor_total = preco - (preco * 0.10);
                    case 2 -> valor_total = preco / 3 ;
                    default -> "OPÇÃO INVÁLIDA";
                });
    }
}
