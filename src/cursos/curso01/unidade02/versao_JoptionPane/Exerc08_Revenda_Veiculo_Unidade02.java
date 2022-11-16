package cursos.curso01.unidade02.versao_JoptionPane;

import javax.swing.JOptionPane;

public class Exerc08_Revenda_Veiculo_Unidade02 {
    public static void main(String[] args){

    String veiculo_modelo = JOptionPane.showInputDialog("Informe o modelo do carro:");
    Double preco_veiculo = Double.parseDouble(JOptionPane.showInputDialog("Qual o valor do carro? R$:"));

    double entrada = 0.50 * preco_veiculo;
    double restante = 0.50 * preco_veiculo / 12;

    JOptionPane.showMessageDialog(null,"Modelo do veículo: " + veiculo_modelo
             + "\nValor de entrada do carro: " + entrada
             + "\nParcelamento restante de 12x sem juros: " + restante);
    }
}
