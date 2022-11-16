package cursos.curso01.unidade03;

import javax.swing.JOptionPane;
public class Exercicios09_FormaPagamento_Unidade03 {
    public static void main(String[] args){
        double valor_total = 0;

        Double preco = Double.parseDouble(JOptionPane.showInputDialog("Qual o preço do produto?"));
        Integer opcao = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma opção para realizar o pagamento:"
                + "\n1 - 10% desconto à vista"
                + "\n2 - 5% de desconto no cartão)"
                + "\n3 - 2x sem juros"
                + "\n4 - 3 x com juros de 10%)"));

        JOptionPane.showMessageDialog(null,"Valor final do produto: R$" +
                switch(opcao) {
                    case 1 -> valor_total = preco - (preco * 0.10); //desconto de 10%
                    case 2 -> valor_total = preco - (preco * 0.5);  //desconto de 5%
                    case 3 -> valor_total = preco / 2  ;  //2x sem juros
                    case 4 -> valor_total = (preco + (preco * 0.10))/ 3 ;  //3x com juros de 10%
                    default -> "OPÇÃO INVÁLIDA";
                });
        Exercicios09_FormaPagamento_Unidade03.main(null);
    }
}
