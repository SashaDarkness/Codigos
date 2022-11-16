package cursos.curso02.DesafiosNaAula.desafio_04_10_2022;

import javax.swing.*;
//DESAFIO_02     DATE: 04_10_2022
public class SequenciaHarmonica {
    public static void main(String[] args){
        double x, harmonica = 0;

        x = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));

        String sequencia = " ";
        for (int i = 1; i <= x; i++){
            harmonica += 1 / (double) i;
            sequencia += "\n--> " + harmonica;
        }
        JOptionPane.showMessageDialog(null,"Sequência Harmonica:" + sequencia);
        System.out.println("Harmonica(" + x + "): " + harmonica);
    }
}
