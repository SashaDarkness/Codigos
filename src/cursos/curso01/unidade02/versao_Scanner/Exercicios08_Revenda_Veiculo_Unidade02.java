package cursos.curso01.unidade02.versao_Scanner;

import java.util.Scanner;

public class Exercicios08_Revenda_Veiculo_Unidade02 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        double preco_veiculo, entrada, restante;
        String veiculo_modelo;

        System.out.println("Informe o modelo do carro: ");
        veiculo_modelo= scanner.nextLine();
        System.out.println("Qual o valor do carro? R$: ");
        preco_veiculo = scanner.nextDouble();

        entrada = 0.50 * preco_veiculo;
        restante = 0.50 * preco_veiculo / 12;

        System.out.println("Modelo do veículo: " + veiculo_modelo);
        System.out.println("Valor de entrada do carro: " +entrada);
        System.out.println("Parcelamento restante de 12x sem juros: " +restante);

    }
}
