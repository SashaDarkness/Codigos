package cursos.curso01.unidade02.versao_JoptionPane;

import javax.swing.*;

public class Exerc04_Jantar_Pizzaria_Unidade02 {
    public static void main(String[] args){

        Double valor = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor da Pizza: R$"));
        Integer pessoas = Integer.parseInt(JOptionPane.showInputDialog("Quantas pessoas vão pagar?"));

        Double valor_conta = valor / pessoas;

        JOptionPane.showMessageDialog(null,"Valor final da conta: R$" +valor_conta);

    }
}
