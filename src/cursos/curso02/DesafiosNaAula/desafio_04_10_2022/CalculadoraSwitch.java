package cursos.curso02.DesafiosNaAula.desafio_04_10_2022;

import javax.swing.*;
//DESAFIO_01     DATE: 04_10_2022
public class CalculadoraSwitch {
    public static void main(String[] args){
        int num01, num02, resultado = 0;

        num01 = Integer.parseInt(JOptionPane.showInputDialog("Informe o 1º número:"));
        num02 = Integer.parseInt(JOptionPane.showInputDialog("Informe o 2º número:"));
        String opcao = JOptionPane.showInputDialog("Qual operação deseja fazer?" +
                "\n1 - Adição(+)\n2 - Subtração(-)\n3 - Divisao (/)\n4 - Multiplicação.");

        if ( (num01 != 0) && (num02 != 0) ) {
            switch (opcao) {
                case "1" -> resultado = num01 + num02;
                case "2" -> resultado = num01 - num02;
                case "3" -> resultado = num01 / num02;
                case "4" -> resultado = num01 * num02;
                default -> {
                    JOptionPane.showMessageDialog(null, "Operação Inválida. Informe novamente outro número.");
                    CalculadoraSwitch.main(null);
                }
            }
            JOptionPane.showMessageDialog(null, "Resultado: " + resultado);

        } else {
            JOptionPane.showMessageDialog(null,"Insira um número diferente de zero.");
            CalculadoraSwitch.main(null);
        }
        System.exit(0);
    }
}
