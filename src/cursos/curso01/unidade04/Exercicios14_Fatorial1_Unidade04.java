package cursos.curso01.unidade04;
import javax.swing.*;
//VERSION WHILE
public class Exercicios14_Fatorial1_Unidade04 {
    public static void main(String[] args){
        double fatorial = 1;
        int numero, i;

        numero = Integer.parseInt(JOptionPane.showInputDialog("Insira um número:"));
        i = numero;
        while (i >= 1 ){
            fatorial = fatorial * i;
            i--; // numero = numero - 1;
        }
        JOptionPane.showMessageDialog(null,"Fatorial do número: " + numero + " é " + fatorial);
        //System.out.println("O fatorial do número:" + numero + " = " + fatorial);
    }
}
