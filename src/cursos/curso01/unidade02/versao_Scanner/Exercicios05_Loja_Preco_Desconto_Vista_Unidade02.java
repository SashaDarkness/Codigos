/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cursos.curso01.unidade02.versao_Scanner;

import java.util.Scanner;

public class Exercicios05_Loja_Preco_Desconto_Vista_Unidade02 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double valor_total = 0;
        
        System.out.println("Qual o preço do produto? :");
        double preco = scan.nextDouble();
        
        System.out.println("Escolha opção de pagamento:\n"
                + "1 - À vista 10%"
                + "\n2 - Parcelar (3x vezes - mesmo valor)");
        int opcao = scan.nextInt();
       
        switch (opcao){
            case 1:
                valor_total = preco - (preco * 0.10);
            case 2:    
                valor_total = preco / 3 ;
        }           
                
        System.out.println("Valor final do produto: " + valor_total);
        
    }
    
}
