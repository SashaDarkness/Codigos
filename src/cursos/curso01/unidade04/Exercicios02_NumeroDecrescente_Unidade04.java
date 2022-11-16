package cursos.curso01.unidade04;

import javax.swing.*;

public class Exercicios02_NumeroDecrescente_Unidade04 {
    public static void main(String[] args){
        int numero;

        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));

        for (int i = numero; i >= 1; i --) { // ou for (int i = numero; i >= 1; i = i - 1)
            numero = numero - 1;
            System.out.println("Contagem:" + numero );
        }
    }
}
