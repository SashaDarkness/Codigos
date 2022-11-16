package cursos.curso01.unidade02.versao_JoptionPane;

import javax.swing.JOptionPane;

public class Exerc_Escreve_Variaveis_Unidade02 {
        public static void main(String[] args) {

            //String fruta = "Banana";
            var valor = 3.50;
            var fruta = JOptionPane.showInputDialog("Digite a fruta");
            //System.out.println("O valor da "+fruta+" é de "+valor);
            JOptionPane.showMessageDialog(null, "O valor da "+fruta+" é de "+valor);


    }

}
