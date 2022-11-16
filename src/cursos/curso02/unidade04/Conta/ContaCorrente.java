package cursos.curso02.unidade04.Conta;

public class ContaCorrente extends Conta {
    public void atualiza(double taxa){
        taxa = 0.10;
        super.saldo = 100;
        //super.saldo = super.saldo + (super.saldo * taxa);
        super.saldo += (super.getSaldo() * taxa);
    }

}
