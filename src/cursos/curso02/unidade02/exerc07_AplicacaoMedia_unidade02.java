package cursos.curso02.unidade02;

import javax.swing.*;

public class exerc07_AplicacaoMedia_unidade02 {
    public static void main(String[] args) {
        int nota, cont = 0, menor, maior;
        double soma = 0, media;

        nota = Integer.parseInt(JOptionPane.showInputDialog("Informe a "+ (cont + 1) + "ª nota: "));
        menor = maior = nota;

        while(nota != -1){
            soma = soma + nota;
            cont++;
            nota = Integer.parseInt(JOptionPane.showInputDialog("Informe a "+ (cont + 1) + "ª nota:"));
            if (nota > maior) {
                menor = maior;
                maior =  nota;
            }
            if (nota < menor){
                maior = menor;
                menor = nota;
            }
        }

        media = soma / cont;

        JOptionPane.showMessageDialog(null,"Maior número é: " + maior
                +"\nMenor número é: " + menor
                +"\nSoma das notas: " + soma
                +"\nMédia das notas: " + media);

        System.exit(0);
    }
}