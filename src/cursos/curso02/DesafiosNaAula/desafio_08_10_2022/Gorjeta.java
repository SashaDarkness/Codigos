package cursos.curso02.DesafiosNaAula.desafio_08_10_2022;

public enum Gorjeta {
    RUIM(0), REGULAR(0.1), BOM(0.2), EXCELENTE(0.22);

    double valor;

    Gorjeta(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
