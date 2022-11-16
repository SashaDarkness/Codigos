package cursos.curso02.unidade04.Conta;

public class ContaPoupanca extends Conta{
    public void atualiza(double taxa){
        taxa = 0.20;
        super.saldo = 150;
        super.saldo = super.saldo + (super.saldo * taxa);
    }
}