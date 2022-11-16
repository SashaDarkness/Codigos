package cursos.curso01.unidade02.versao_Scanner;

import java.util.Scanner;

public class Exercicios09_Lanhouse_Valor_Unidade02 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int tempo_horas, tempo_minutos;
        double valor_final = 0, total_minutos = 0;
        final double fracao_15_minutos =  2.00;

        System.out.println("Informe o tempo de uso no computador em horas: ");
        tempo_horas = scanner.nextInt();
        System.out.println("Informe o tempo de uso no computador em minutos: ");
        tempo_minutos = scanner.nextInt();

        total_minutos = tempo_horas * 60 + tempo_minutos;
        valor_final = Math.round(total_minutos / 15) * fracao_15_minutos;

        System.out.println("Valor final a ser pago R$: " +valor_final);
        scanner.close();
    }
}
