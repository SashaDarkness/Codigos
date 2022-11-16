package cursos.curso02.unidade04.SisalucarApp;

public class Moto extends Veiculo{

    public int getPesageiros(){ //EXEMPLO DE ANULAÇÃO
        return 30;
    }

    public void acelera(int limiteVelocidade) {
        limiteVelocidade = 80;
        System.out.println("Obedeça o limite de velocidade que é: "+limiteVelocidade);
    }

}
