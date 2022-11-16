package cursos.curso01.unidade02.versao_JoptionPane;

import javax.swing.JOptionPane;

public class Exerc01_Taxa_Garçom_Unidade02 {

    public static void main(String[] args){
        double valor, valor_final = 0, taxa = 0.10;

        valor = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do jantar: "));

        valor_final = valor + (valor * taxa);

        JOptionPane.showMessageDialog(null,"Valor total a ser pago: R$" + valor_final);

    }
}
