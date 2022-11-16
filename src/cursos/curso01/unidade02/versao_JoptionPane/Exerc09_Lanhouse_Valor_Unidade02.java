package cursos.curso01.unidade02.versao_JoptionPane;

import javax.swing.JOptionPane;

public class Exerc09_Lanhouse_Valor_Unidade02 {
    public static void main(String[] args){
        double valor_final = 0, total_minutos = 0;
        final double fracao_15_minutos =  2.00;

        Integer tempo_horas = Integer.parseInt(JOptionPane.showInputDialog("Informe o tempo de uso no computador em horas:"));
        Integer tempo_minutos = Integer.parseInt(JOptionPane.showInputDialog("Informe o tempo de uso no computador em minutos:"));

        total_minutos = tempo_horas * 60 + tempo_minutos;
        valor_final = Math.round(total_minutos / 15) * fracao_15_minutos;

        JOptionPane.showMessageDialog(null,"Valor final a ser pago R$: " +valor_final);
    }
}
