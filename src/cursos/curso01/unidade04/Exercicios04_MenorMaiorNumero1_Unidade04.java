package cursos.curso01.unidade04;
import javax.swing.*;
//VERSION DO WHILE
public class Exercicios04_MenorMaiorNumero1_Unidade04 {
    public static void main(String[] args){
        int numero, maior, menor;

        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));
        maior = numero;
        menor = numero;

        do {
            if (numero < menor) {
                menor = numero;
            } else if (numero > maior) {
                maior = numero;
                numero = Integer.parseInt(JOptionPane.showInputDialog("Informe novamente um número: "));
            }
        } while(numero!=0);
        JOptionPane.showMessageDialog(null,"Menor número é: " + menor);
        JOptionPane.showMessageDialog(null,"Maior número é: " + maior);

    }
}
