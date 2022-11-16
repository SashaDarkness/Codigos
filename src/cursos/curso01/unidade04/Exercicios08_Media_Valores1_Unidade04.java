package cursos.curso01.unidade04;

import javax.swing.*;
//VERSION WHILE
public class Exercicios08_Media_Valores1_Unidade04 {
    public static void main(String[] args){
        int valor, soma = 0, cont = 0;

        valor = Integer.parseInt(JOptionPane.showInputDialog("Insira um valor:"));

        while (valor != -1 ) {
            soma += valor;
            cont++;
            valor = Integer.parseInt(JOptionPane.showInputDialog("Insira outro valor:\nCaso queira parar digite: \"-1\" "));
        }
        JOptionPane.showMessageDialog(null,"Média: " + soma / cont );
    }
}
