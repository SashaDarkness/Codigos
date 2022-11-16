package cursos.curso03.unidade01;

import java.util.Scanner;

public class Calculadora {

    public void dividir(int n1, int n2){ //public static void dividir(int n1, int n2){
        System.out.println(n1/n2);
    }

    public static void main(String[] args) throws DivisaoZeroException {
        Scanner ent= new Scanner(System.in);

        System.out.println("digite 1 numero: ");
        int n1 = ent.nextInt();
        System.out.println("digite 2 numero: ");
        int n2 = ent.nextInt();

        try {
            Calculadora c = new Calculadora();
            c.dividir(n1,n2);
        } catch (ArithmeticException e) {
            //System.out.println(e.getMessage());
            throw new DivisaoZeroException();
        }

    }

    private static class DivisaoZeroException extends Exception {

    }
}
