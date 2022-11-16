package cursos.curso01.desafios_feitos_na_aula;

import javax.swing.*;

public class desafio01 {
    public static void main(String[] args) {
        double valor_final = 0;

        Object[] opcao = {"1 - Taxa 15%", "2 - Taxa 18%", "3 - Taxa 22%"};

        Object opcaoValue = JOptionPane.showInputDialog(null,
                "Selecione a Taxa de Gorjeta", "Gorjeta",
                JOptionPane.INFORMATION_MESSAGE, null,
                opcao, opcao[0]);

        Double valor = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do prato: "));

        if(opcaoValue.equals("1 - Taxa 15%")){
            JOptionPane.showConfirmDialog(null,"Taxa de 15% selecionado!");
            valor_final = valor + (valor * 0.15);

        } else if (opcaoValue.equals("2 - Taxa 18%")){
            JOptionPane.showConfirmDialog(null,"Taxa de 18% selecionado!");
            valor_final = valor + (valor * 0.18);

        } else {
            JOptionPane.showConfirmDialog(null,"Taxa de 22% selecionado!");
            valor_final = valor + (valor * 0.22);

        }

        JOptionPane.showMessageDialog(null,"Valor final a ser pago: " + valor_final);

    }

}
