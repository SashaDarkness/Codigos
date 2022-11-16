package cursos.curso01.unidade05;

import javax.swing.*;

public class Exercicios03_NotasAlunos_Unidade05 {
    public static void main(String[] args) {
        double notasAlunos[][] = new double[5][4]; //5 linha(Aluno) e 4 colunas(Notas)
        boolean situacaoAlunos[] = new boolean[5];
        double soma = 0, media = 0;
        int contAprovados = 0, contReprovados = 0;
        String listaAlunos[] = new String[5];
        String nomeAluno;

        for (int i = 0; i < 5; i++){
            nomeAluno = JOptionPane.showInputDialog("Informe o nome do Aluno:");
            listaAlunos[i] = nomeAluno;

            for (int j = 0; j < 4; j++){
                notasAlunos[i][j] = Double.parseDouble(JOptionPane.showInputDialog("Informe a " + (j + 1) + " nota do(a) aluno(a) " + nomeAluno +":"));
                soma += soma + notasAlunos[i][j];
            }
            media = soma / 4;

            if (media < 5) {
                situacaoAlunos[i] = false;
            } else {
                situacaoAlunos[i] = true;
            }
        }

        for (int i = 0; i < 5; i++) {
            if (situacaoAlunos[i]) {
                contAprovados++;
            } else {
                contReprovados++;
            }
        }
        JOptionPane.showMessageDialog(null,"Alunos Aprovados:" + contAprovados
                + "\nAlunos Reprovados: " + contReprovados);

    }
}