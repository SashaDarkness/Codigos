package cursos.curso02.DesafiosNaAula;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExpressoesRegulares {
    public static void main(String[] args) {
        String email = "java$$$$iniciantes@gmail.com";
        String endereco = "Rua dos Avestruzes";

        String regex = "^(.+)@(.+)$";

        Pattern pattern = Pattern.compile(regex);
        Matcher matchertrue = pattern.matcher(email);
        Matcher matcherfalse = pattern.matcher(endereco);

        System.out.println(matchertrue.matches());
        System.out.println(matcherfalse.matches());
    }
}