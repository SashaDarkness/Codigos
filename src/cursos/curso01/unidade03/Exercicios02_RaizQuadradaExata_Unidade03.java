package cursos.curso01.unidade03;

import javax.swing.*;

public class Exercicios02_RaizQuadradaExata_Unidade03 {
    public static void main(String[] args){

        Integer numero = Integer.parseInt(JOptionPane.showInputDialog("Informe um número para saber sua raiz quadrada:"));

        double raiz = Math.sqrt(numero);
        int maior_valor = (int) Math.round(raiz);

        if (raiz == maior_valor) {
            JOptionPane.showMessageDialog(null, "Existe raiz exata para o número: " + numero );
            JOptionPane.showMessageDialog(null, "A raiz quadrada de: " + numero + " é: " + maior_valor );
        } else {
            JOptionPane.showMessageDialog(null, "Não existe raiz exata para o número: " + numero);
        }
    }
}
