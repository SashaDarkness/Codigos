package cursos.curso03.unidade02;

import java.io.FileReader;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class ScannerAppv2 {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(new FileReader("C:/Users/Darkness/Downloads/NETBIIS/Codigos_Netbiis/src/cursos/curso03/unidade02/numeros.txt"));
        double soma = 0;
        String valor;
        while (entrada.hasNext()) {
            valor = entrada.next();
            soma += Double.parseDouble(valor);
        }
        entrada.close();
        JOptionPane.showMessageDialog(null, 
        "a soma entre os valores no arquivo txt é igual a: " + soma
        );
    }
}
