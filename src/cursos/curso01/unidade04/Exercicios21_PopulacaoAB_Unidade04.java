package cursos.curso01.unidade04;

import javax.swing.JOptionPane;

public class Exercicios21_PopulacaoAB_Unidade04 {
    public static void main(String[] args){
        final double habitantesA = 5000000;
        final double habitantesB = 7000000;
        final double taxaA = 0.03;
        final double taxaB = 0.02;

        int tempo = 0;
        double populacaoA = habitantesA;
        double populacaoB = habitantesB;

        while(populacaoB >= populacaoA)
        {
            populacaoB = populacaoB + populacaoB*taxaB;
            populacaoA = populacaoA + populacaoA*taxaA;
            tempo++;
        }
        JOptionPane.showMessageDialog(null,"A população A levará "
                + tempo + " anos para superar a população B.");
    }
}
