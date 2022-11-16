package cursos.curso02.DesafiosNaAula.desafio_04_10_2022;

import javax.swing.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
//DESAFIO_03     DATE: 04_10_2022
public class validacaoDeEmail {
    public static void main(String[] args) {

        String email = JOptionPane.showInputDialog("Informe um email:");

        if (validarEmail(email)) {
            JOptionPane.showMessageDialog(null, email + ", o email é valido.");
        } else {
            JOptionPane.showMessageDialog(null, email + ", o email é inválido.");
        }
    }

    public static boolean validarEmail(String email) {
        boolean emailValido = false;
        if (email != null && email.length() > 0) {
            String expression = "^[\\w\\.-]+@([\\w\\-]+\\.)+[A-Z]{2,4}$";
            Pattern pattern = Pattern.compile(expression, Pattern.CASE_INSENSITIVE);
            Matcher matcher = pattern.matcher(email);
            if (matcher.matches()) {
                emailValido = true;
            }
        }
        return emailValido;
    }

}
