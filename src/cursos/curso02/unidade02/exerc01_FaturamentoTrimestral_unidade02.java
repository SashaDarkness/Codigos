package cursos.curso02.unidade02;

import javax.swing.*;

public class exerc01_FaturamentoTrimestral_unidade02 {
    public static void main (String[] args){
        //int vendas_Janeiro = 15_000, vendas_Fevereiro = 23000, vendas_Marco = 17000;
        int vendas_Janeiro, vendas_Fevereiro, vendas_Marco, faturamentoTrimestral;

        vendas_Janeiro = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor de faturamento de janeiro:"));
        vendas_Fevereiro = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor de faturamento de fevereiro:"));
        vendas_Marco = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor de faturamento de março:"));

        faturamentoTrimestral = vendas_Janeiro + vendas_Fevereiro + vendas_Marco;

        JOptionPane.showMessageDialog(null,"Total do faturamento trimestral: " + faturamentoTrimestral);


    }
}
