package cursos.curso01.desafio_29_09_2022.Desafio05;
import javax.swing.JOptionPane;
public class questao02CaixaEletronico2 {
    public static void main(String[] args) {
        int resto, saque, notas200, notas100, notas50, notas10, notas2;

        saque = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor do saque:"));

        Object[] opcao = {"1 - Notas de [R$200,00][R$100,00][R$50,00]", "2 - Notas de [R$100,00][R$50,00][R$10,00]", "3 - Notas de [R$50,00][R$10,00][R$2,00]"};
        Object opcaoValue = JOptionPane.showInputDialog(null,"CAIXA ELETRONICO", "SAQUE",
                JOptionPane.INFORMATION_MESSAGE, null, opcao, opcao[0]);

        String result = "";
        if(opcaoValue.equals("1 - Notas de [R$200,00][R$100,00][R$50,00]")){
            if (saque % 50 == 0) {
                notas200 = (saque / 200);
                resto = saque % 200;
                notas100 = (resto / 100);
                resto = resto % 100;
                notas50 = (resto / 50);

                if (notas200 > 0) {
                    result += notas200 + " nota de duzentos.\n";
                }
                if (notas100 > 0) {
                    result += notas100 + " nota de cem.\n";
                }
                if (notas50 > 0) {
                    result += notas50 + " nota de cinquenta.\n";
                }
            } else {
                JOptionPane.showMessageDialog(null, "Valor informado para o saque inválido. Insira novamente outro valor.");
                questao02CaixaEletronico2.main(null);
            }

        } else if (opcaoValue.equals("2 - Notas de [R$100,00][R$50,00][R$10,00]")){
            if (saque % 10 == 0) {
                notas100 = (saque / 100);
                resto = saque % 100;
                notas50 = (resto / 50);
                resto = resto % 50;
                notas10 = (resto / 10);

                if (notas100 > 0) {
                    result += notas100 + " nota de cem.\n";
                }
                if (notas50 > 0) {
                    result += notas50 + " nota de cinquenta.\n";
                }
                if (notas10 > 0) {
                    result += notas10 + " nota de dez.\n";
                }
            } else {
                JOptionPane.showMessageDialog(null, "Valor informado para o saque inválido. Insira novamente outro valor.");
                questao02CaixaEletronico2.main(null);
            }

        } else if (opcaoValue.equals("3 - Notas de [R$50,00][R$10,00][R$2,00]")) {
            if (saque % 2 == 0) {
                notas50 = (saque / 50);
                resto = saque % 50;
                notas10 = (resto / 10);
                resto = resto % 10;
                notas2 = (resto / 2);

                if (notas50 > 0) {
                    result += notas50 + " nota de cinquenta.\n";
                }
                if (notas10 > 0) {
                    result += notas10 + " nota de dez.\n";
                }
                if (notas2 > 0) {
                    result += notas2 + " nota de dois.\n";
                }
            } else {
                JOptionPane.showMessageDialog(null, "Valor informado para o saque inválido. Insira novamente outro valor.");
                questao02CaixaEletronico2.main(null);
            }
        }
        JOptionPane.showMessageDialog(null, "Notas que seram recebidas:\n\n" + result );
        System.exit(0);
    }
}
