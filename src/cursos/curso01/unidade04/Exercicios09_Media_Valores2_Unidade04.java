package cursos.curso01.unidade04;

import javax.swing.*;
//VERSION DO WHILE
public class Exercicios09_Media_Valores2_Unidade04 {
    public static void main(String[] args){
        int valor, soma = 0, cont = 0;

        valor = Integer.parseInt(JOptionPane.showInputDialog("Insira um valor:"));

        do {
            if (valor != -1) {
                soma += valor;
                cont++;
                valor = Integer.parseInt(JOptionPane.showInputDialog("Insira outro valor:\nCaso queira parar digite: \"-1\" "));
            }
        } while (valor != -1);

        JOptionPane.showMessageDialog(null,"Média: " + soma / cont );
    }
}
