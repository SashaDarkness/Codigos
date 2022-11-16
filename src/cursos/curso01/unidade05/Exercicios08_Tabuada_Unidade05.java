package cursos.curso01.unidade05;

import javax.swing.JOptionPane;

public class Exercicios08_Tabuada_Unidade05 {
    public static void main(String[] args){
       int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));
       tabuada(numero);
    }

    public static void tabuada(int numero){
        int total = 0;

        String tabuadaTela = "";
        for (int i = 0; i < 11; i ++){
            total = numero * i;
            tabuadaTela += "Número:" + numero + "x" + i + " = " + total + "\n";
        }
        JOptionPane.showMessageDialog(null, "Tabuada do número: "
                + numero + "\n" + tabuadaTela);
    }
}