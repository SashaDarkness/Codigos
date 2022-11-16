package cursos.curso01.desafio_29_09_2022.Desafio04;

import javax.swing.*;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

public class questao02MediaCincoAlunos {
    public static void main(String[] args) throws IOException {
        String[] listaAlunos = new String[5];
        String[] nomeAprov = new String[5];
        String[] nomeReprov = new String[5];

        int[] frequenciaAlunos = new int[5];
        int contAprovados = 0, contReprovados = 0;
        double soma = 0, media;
        double[][] notasAlunos = new double[5][4];
        boolean[] situacaoAlunos = new boolean[5];

        FileWriter arquivoAprovados = new FileWriter("aprovados.txt");
        PrintWriter gravarAprovados = new PrintWriter(arquivoAprovados);

        FileWriter arquivoReprovados = new FileWriter("reprovados.txt");
        PrintWriter gravarReprovados = new PrintWriter(arquivoReprovados);

        for (int i = 0; i < 5; i++){
            listaAlunos[i] = JOptionPane.showInputDialog("Informe o nome do Aluno:");
            frequenciaAlunos[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe a frequencia do " + (i + 1) + "º aluno:"));

            for (int j = 0; j < 4; j++){
                notasAlunos[i][j] = Double.parseDouble(JOptionPane.showInputDialog("Informe as " + (j + 1) + " notas do " + (i + 1) + "º aluno:"));
                soma += soma + notasAlunos[i][j];
            }
            media = soma / 4;

            if ((media >= 7) && (frequenciaAlunos[i] >= 75)) {
                situacaoAlunos[i] = true;
                contAprovados++;
                nomeAprov[i] = listaAlunos[i];
            } else {
                situacaoAlunos[i] = false;
                contReprovados++;
                nomeReprov[i] = listaAlunos[i];
            }
        }

        gravarAprovados.println("---------------------------------");
        gravarAprovados.println("Alunos Aprovados: " + contAprovados);
        gravarAprovados.println("Nomes:");
        gravarAprovados.println(Arrays.toString(nomeAprov) + " " );
        gravarAprovados.println("---------------------------------");
        arquivoAprovados.close();
        gravarAprovados.close();

        gravarReprovados.println("---------------------------------");
        gravarReprovados.println("Alunos Reprovados: " + contReprovados);
        gravarReprovados.println("Nomes:");
        gravarReprovados.println(Arrays.toString(nomeReprov) + " " );
        gravarReprovados.println("---------------------------------");
        arquivoReprovados.close();
        gravarReprovados.close();

        JOptionPane.showMessageDialog(null,"Alunos  " + Arrays.toString(listaAlunos)
                + "\nAlunos Aprovados " + contAprovados + " :" + Arrays.toString(nomeAprov)
                + "\nAlunos Reprovados " + contReprovados + " :" + Arrays.toString(nomeReprov) );
    }
}