package cursos.curso02.unidade04.Conta;

import javax.swing.*;

public class ContaMain {
    public static void main(String[] args) {
        Conta conta = new Conta(); // Objeto Conta
        conta.setCliente(new Cliente[5]); // AGREGAÇÃO - conta.clinte = new Cliente[5];

    }
}
