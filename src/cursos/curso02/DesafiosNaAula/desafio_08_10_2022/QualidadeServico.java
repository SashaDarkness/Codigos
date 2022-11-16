package cursos.curso02.DesafiosNaAula.desafio_08_10_2022;

import javax.swing.*;

public class QualidadeServico {
    static Gorjeta servicoGorjeta;

    public static void main(String[] args){
        Object selectValue = JOptionPane.showInputDialog(null,
                "Única Opcão Disponivel", "Gorjeta",
                JOptionPane.INFORMATION_MESSAGE, null,
                Gorjeta.values(), Gorjeta.RUIM);

        servicoGorjeta = (Gorjeta) selectValue;

        double gorjeta = 0;
        double valorPago = 100.00;

        switch (servicoGorjeta){
            case RUIM -> gorjeta = valorPago * servicoGorjeta.getValor();
            case REGULAR -> gorjeta = valorPago * servicoGorjeta.getValor();
            case BOM -> gorjeta = valorPago * servicoGorjeta.getValor();
            case EXCELENTE -> gorjeta = valorPago * servicoGorjeta.getValor();
        }
        JOptionPane.showMessageDialog(null,"->AVALIAÇÃO DO SERVIÇO: " + servicoGorjeta
                    +"\nValor Pago da Conta: " + valorPago
                    +"\nGorjeta do Garçom: " + gorjeta);
    }
}
