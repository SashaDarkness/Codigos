package cursos.curso01.unidade04;

import javax.swing.*;

public class Exercicios03_Media50Alunos_Unidade04 {
    public static void main(String[] args){
       final double numero_avaliacoes = 4;
       double media, media50alunos = 0;
       int i;

       for (i = 0; i < 50; i++){
           Double nota01 = Double.parseDouble(JOptionPane.showInputDialog("Informe a 1ª nota:"));
           Double nota02 = Double.parseDouble(JOptionPane.showInputDialog("Informe a 2ª nota:"));
           Double nota03 = Double.parseDouble(JOptionPane.showInputDialog("Informe a 3ª nota:"));
           Double nota04 = Double.parseDouble(JOptionPane.showInputDialog("Informe a 4ª nota:"));

           media = (nota01 + nota02 + nota03 + nota04) / numero_avaliacoes;
           media50alunos = media50alunos + media;
       }
           media50alunos = media50alunos / i;

        JOptionPane.showMessageDialog(null,"Média dos 50 alunos: " + media50alunos );

    }
}
