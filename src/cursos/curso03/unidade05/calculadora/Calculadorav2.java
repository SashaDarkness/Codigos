package cursos.curso03.unidade05.calculadora;

public class Calculadorav2 {
    public static void main(String[] args) {
        Exemplov2 ex = new Exemplov2();


        IMath somar = (a, b) -> a+b;
        IMath subtrair = (a,b) -> a-b;
        IMath multiplicar = (a,b) -> a*b;
        IMath dividir = (a,b) -> a/b;

        System.out.println(ex.execOperacao(5,5, somar));
        System.out.println(ex.execOperacao(6,4, subtrair));
        System.out.println(ex.execOperacao(3,4, multiplicar));
        System.out.println(ex.execOperacao(10,2, dividir));

    }
}
