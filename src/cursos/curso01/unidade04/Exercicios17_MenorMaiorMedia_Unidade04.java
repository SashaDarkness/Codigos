package cursos.curso01.unidade04;

import javax.swing.*;

public class Exercicios17_MenorMaiorMedia_Unidade04 {
    public static void main(String[] args){
        int numero, maior, menor, media = 0, cont = 0;

        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));
        maior = numero;
        menor = numero;

        while (numero != 0) {
            if (numero < menor) {
                menor = numero;
            } else if (numero > maior) {
                maior = numero;
                numero = Integer.parseInt(JOptionPane.showInputDialog("Informe novamente um número: "));
            }
            cont++;
        }
        media += media / cont;
        JOptionPane.showMessageDialog(null,"Menor número é: " + menor);
        JOptionPane.showMessageDialog(null,"Maior número é: " + maior);
        JOptionPane.showMessageDialog(null,"A média dos valores é: " + media);

    }
}