package cursos.curso01.unidade02.versao_JoptionPane;

import javax.swing.*;

public class Exerc02_Calculo_Viajem_HorasDias_Unidade02 {
    public static void main(String[] args){
        final int hora = 24;

        Integer dias_viagem = Integer.parseInt(JOptionPane.showInputDialog("Quantos dias durou a viagem?"));
        Integer horas_viagem = Integer.parseInt(JOptionPane.showInputDialog("Quantas horas durou a viajem?"));

        int conversao_dias = dias_viagem * hora;
        int conversao_horas = horas_viagem / hora;

        JOptionPane.showMessageDialog(null,"Duração da viajem em Dias: " +conversao_dias + " dias"
                + "\nDuração da viajem em horas: " + conversao_horas + " horas");
    }
}


