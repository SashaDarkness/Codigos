package cursos.curso02.unidade04.SisalucarApp;

public enum Revendedor {
    ABCVEICULOS("101010/0001","Em algum lugar do planeta","VolksWagen"),
    SVEICULOS("100111/0001","Em algum lugar aí","Honda"),
    CVEICULOS("111000/0001","Sabe Deus onde","Toyota");

    String CNPJ;
    String ENDERECO;
    String FABRICANTE;

    Revendedor(String CNPJ, String ENDERECO, String FABRICANTE) {
        this.CNPJ = CNPJ;
        this.ENDERECO = ENDERECO;
        this.FABRICANTE = FABRICANTE;
    }
}
