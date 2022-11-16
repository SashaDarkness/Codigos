package cursos.curso01.unidade04;
import javax.swing.*;
//VERSION DO WHILE
public class Exercicios15_Fatorial2_Unidade04 {
    public static void main(String[] args){
        double fatorial = 1;
        int numero, i;

        numero = Integer.parseInt(JOptionPane.showInputDialog("Insira um número:"));
        i = numero;
        do {
            fatorial = fatorial * i;
            i--; // numero = numero - 1;
        } while (i >= 1 );
        JOptionPane.showMessageDialog(null,"Fatorial do número: " + numero + " é " + fatorial);
        //System.out.println("O fatorial do número:" + numero + " = " + fatorial);
    }
}