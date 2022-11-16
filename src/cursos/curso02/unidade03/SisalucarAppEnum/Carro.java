package cursos.curso02.unidade03.SisalucarAppEnum;

public class Carro {
      static long idCarro;
      String fabricante;
      String cor;
      String modelo;
      String placa;
      int ano;
      double valorDiaria;
      Revendedor revendedor;

      public Carro(){}

      public Carro (long idCarro, String fabricante, String cor, String modelo, String placa,
                    int ano, double valorDiaria, Revendedor revendedor) {
            super(); //Chama o Construtor da SuperClasse
            Carro.idCarro = idCarro;
            this.fabricante = fabricante;
            this.cor = cor;
            this.modelo = modelo;
            this.placa = placa;
            this.ano = ano;
            this.valorDiaria = valorDiaria;
            this.revendedor = revendedor;
      }

      public static long getIdCarro() {
            return idCarro;
      }

      public static void setIdCarro(long idCarro) {
            Carro.idCarro = idCarro;
      }

      public String getFabricante() {
            return fabricante;
      }

      public void setFabricante(String fabricante) {
            this.fabricante = fabricante;
      }

      public String getCor() {
            return cor;
      }

      public void setCor(String cor) {
            this.cor = cor;
      }

      public String getModelo() {
            return modelo;
      }

      public void setModelo(String modelo) {
            this.modelo = modelo;
      }

      public String getPlaca() {
            return placa;
      }

      public void setPlaca(String placa) {
            this.placa = placa;
      }

      public int getAno() {
            return ano;
      }

      public void setAno(int ano) {
            this.ano = ano;
      }

      public double getValorDiaria() {
            return valorDiaria;
      }

      public void setValorDiaria(double valorDiaria) {
            this.valorDiaria = valorDiaria;
      }

      public static void main(String[] args){
            Carro carro = new Carro(1, "ABC", "Vermelho", "Cursos", "ABC-1010", 2022, 100.00,
                    Revendedor.ABCVEICULOS);
            System.out.println(carro);
      }
}
