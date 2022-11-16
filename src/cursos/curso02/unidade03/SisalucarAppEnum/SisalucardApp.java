package cursos.curso02.unidade03.SisalucarAppEnum;

import java.time.LocalDate;

public class SisalucardApp {
    static int totalCarros = 0;

    public static void main(String[] args) {
        Carro carro1 = new Carro(); //Objeto instanciado
        Carro.idCarro = 1;
        carro1.modelo = "gol";
        carro1.placa = "jdk-0001";
        carro1.cor = "azul";
        carro1.ano = 2013;
        carro1.valorDiaria = 150;
        carro1.fabricante = "VolksWagem";

        SisalucardApp.totalCarros += 1; //ou totalCarros = totalCarros + 1;

        Cliente cliente1 = new Cliente();
        Cliente.idCliente = 1;
        cliente1.cpf = "12345678-90";
        cliente1.nome = "Sasha Caroline";
        cliente1.cnh = "xyz0001";

        //Carro carro2 = new Carro();
        //Cliente cliente2 = new Cliente();

        SisalucardApp sisalucar = new SisalucardApp();
        sisalucar.realizarLocacao(Carro.idCarro, Cliente.idCliente, carro1.valorDiaria);
        //sisalucar.gerarRelatorios(carro1, LocalDate.now(), LocalDate.now().plusDays(2));
        //DEIXA DE USAR O "sisalucar." POR SER UM MÉTODO DE CLASSE (STATIC)
        gerarRelatorios(carro1, LocalDate.now(), LocalDate.now().plusDays(2));

    }

    //CRIAR UM OBJETO QUE FAZ ASSOCIAÇÃO DO OBJETO DO TIPO CLIENTE COM O OBJETO DO TIPO CARRO
    public void realizarLocacao(long idCarro, long idCliente, double valorDiaria){
        Locacao local = new Locacao();
        Locacao.idLocacao = 1;
        Locacao.idCarro = idCarro;
        Cliente.idCliente = idCliente;
        local.dataInicio = LocalDate.now();
        local.dataFim = LocalDate.now().plusDays(2);
        local.valorLocado = valorDiaria * 2; //local.valorLocado = 150 * 2;
    }

    public void gerarRelatorio(LocalDate dataInicio, LocalDate dataFim){
        float totalFaturado = 150 * 2;
    }

    public static void gerarRelatorios(Carro carro1, LocalDate...datas){ //Exemplo de VARARGS
        double totalFaturado = carro1.valorDiaria;
    }

}
