package cursos.curso01.unidade05;

import javax.swing.JOptionPane;

public class Exercicios01_ListaAlunos_Unidade05 {
    public static void main(String[] args){
        String nome;
        String listaAlunos[] = new String[5];

        for(int i = 0; i < 5; i++) {
            nome = JOptionPane.showInputDialog("Digite o nome do Aluno");
            listaAlunos[i] = nome;
        }

        String alunos = "";
        for(int i = 0; i < 5 ; i++) {
            alunos +=  listaAlunos[i] + "\n";
        }
        JOptionPane.showMessageDialog(null,"Nome dos alunos:\n" + alunos);
   }
}
