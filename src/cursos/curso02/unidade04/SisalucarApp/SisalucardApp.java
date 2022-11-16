package cursos.curso02.unidade04.SisalucarApp;

import java.time.LocalDate;

public class SisalucardApp {
    static int totalCarros = 0;

    public static void main(String[] args) {
        Carro carro1 = new Carro(); // Objeto instanciado
        Carro.setIdCarro(1);
        carro1.setModelo("gol");
        carro1.setPlaca("jdk-0001");
        carro1.setCor("azul");
        carro1.setAno(2013);
        carro1.setValorDiaria(150);
        carro1.setFabricante("VolksWagem");

        SisalucardApp.totalCarros += 1; // ou totalCarros = totalCarros + 1;

        Cliente cliente1 = new Cliente();
        Cliente.setIdCliente(1);
        cliente1.setCpf("12345678-90");
        cliente1.setNome("Sasha Caroline");
        cliente1.setCnh("xyz0001");

        // Carro carro2 = new Carro();
        // Cliente cliente2 = new Cliente();

        carro1.autonomia = 10;
        carro1.acelera();
        carro1.freiar();
        carro1.getVelocidade();
        carro1.getPassageiros();

        SisalucardApp sisalucar = new SisalucardApp();
        sisalucar.realizarLocacao(Carro.getIdCarro(), Cliente.getIdCliente(), carro1.getValorDiaria());
        // sisalucar.gerarRelatorios(carro1, LocalDate.now(),
        // LocalDate.now().plusDays(2));
        // DEIXA DE USAR O "sisalucar." POR SER UM MÉTODO DE CLASSE (STATIC)
        gerarRelatorios(carro1, LocalDate.now(), LocalDate.now().plusDays(2));

    }

    // CRIAR UM OBJETO QUE FAZ ASSOCIAÇÃO DO OBJETO DO TIPO CLIENTE COM O OBJETO DO
    // TIPO CARRO
    public void realizarLocacao(long idCarro, long idCliente, double valorDiaria) {
        Locacao local = new Locacao();
        Locacao.idLocacao = 1;
        Locacao.idCarro = idCarro;
        Cliente.setIdCliente(idCliente);
        local.dataInicio = LocalDate.now();
        local.dataFim = LocalDate.now().plusDays(2);
        local.valorLocado = valorDiaria * 2; // local.valorLocado = 150 * 2;
    }

    public void gerarRelatorio(LocalDate dataInicio, LocalDate dataFim) {
        float totalFaturado = 150 * 2;
    }

    public static void gerarRelatorios(Carro carro1, LocalDate... datas) { // Exemplo de VARARGS
        double totalFaturado = carro1.getValorDiaria();
    }

}
