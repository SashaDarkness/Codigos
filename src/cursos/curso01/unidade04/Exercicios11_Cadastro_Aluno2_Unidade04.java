package cursos.curso01.unidade04;

import javax.swing.*;
//VERSION DO WHILE
public class Exercicios11_Cadastro_Aluno2_Unidade04 {
    public static void main(String[] args){
        String nome, endereco, telefone;
        int matricula, cont = 0;

        matricula = Integer.parseInt(JOptionPane.showInputDialog("Insira o número de matricula:"));

        do {
            if (matricula != 0) {
                cont++;
                nome = JOptionPane.showInputDialog("Informe o nome:");
                endereco = JOptionPane.showInputDialog("Informe o endereço:");
                telefone = JOptionPane.showInputDialog("Informe o telefone:");
                matricula = Integer.parseInt(JOptionPane.showInputDialog("Insira o número de matricula do próximo aluno:"));
            }
        } while (matricula != 0);
        JOptionPane.showMessageDialog(null,"Alunos cadastrados:" + cont);
    }
}
