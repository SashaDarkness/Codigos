package cursos.curso01.unidade04;

import javax.swing.*;
//VERSION WHILE
public class Exercicios10_Cadastro_Aluno1_Unidade04 {
    public static void main(String[] args){
        String nome, endereco, telefone;
        int matricula, cont = 0;

        matricula = Integer.parseInt(JOptionPane.showInputDialog("Insira o número de matricula:"));

        while (matricula != 0){
            cont++;
            nome = JOptionPane.showInputDialog("Informe o nome:");
            endereco = JOptionPane.showInputDialog("Informe o endereço:");
            telefone = JOptionPane.showInputDialog("Informe o telefone:");
            matricula = Integer.parseInt(JOptionPane.showInputDialog("Insira o número de matricula do próximo aluno:"));
        }
        JOptionPane.showMessageDialog(null,"Alunos cadastrados:" + cont);
    }
}
