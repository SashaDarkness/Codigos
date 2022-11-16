package cursos.curso02.unidade04.Conta;

public class Conta {
    private int numeroConta;
    protected double saldo;
    private double limite;
    private Cliente[] cliente; // ASSOCIAÇÃO - Collection<Cliente> clientes = new ArrayList<Cliente>();

    public void atualiza(double taxa){
        taxa = 0.10;
        this.saldo = this.saldo + (this.saldo * taxa);
    }

    public boolean sacar(double valor) {
        if (valor <= saldo) {
            saldo = saldo - valor;
            return true;
        } else {
            System.out.println("VALOR DE SAQUE MAIOR QUE O SALDO DA CONTA.");
            return false;
        }
    }

    public void deposita(double valor) {
        saldo = saldo + valor;
    }

    public void transfere(Conta contaDestino, double valor) {
        if (valor <= saldo) {
            this.saldo = this.saldo - valor;
            contaDestino.deposita(valor);
        } else {
            System.out.println("Não foi possível realizar transferencia");
        }
    }

    public Conta() {
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public Cliente[] getCliente() {
        return cliente;
    }

    public void setCliente(Cliente[] cliente) {
        this.cliente = cliente;
    }
}
