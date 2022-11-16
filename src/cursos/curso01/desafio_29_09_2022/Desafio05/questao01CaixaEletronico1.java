package cursos.curso01.desafio_29_09_2022.Desafio05;
import javax.swing.JOptionPane;
public class questao01CaixaEletronico1 {
    public static void main(String[] args) {
        int resto, saque;
        double notas200, notas100, notas50;

        saque = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor do saque:"));

        String result = "";
        if (saque % 50 == 0) {
            notas200 = Math.floor(saque / 200);
            resto = saque % 200;
            notas100 = Math.floor(resto / 100);
            resto = resto % 100;
            notas50 = Math.floor(resto / 50);

            if (notas200 > 0) {
                result += Math.round(notas200) + " nota de dozentos.\n";
            }
            if (notas100 > 0) {
                result += Math.round(notas100) + " nota de cem.\n";
            }
            if (notas50 > 0) {
                result += Math.round(notas50) + " nota de cinquenta.\n";
            }
            JOptionPane.showMessageDialog(null, "Notas que seram recebidas:\n\n" + result );

        } else {
            JOptionPane.showMessageDialog(null, "Valor informado do saque está incorreto." +
                    "\nInsira novamente outro valor para saque.");
            questao01CaixaEletronico1.main(null);
        }
    }
}
