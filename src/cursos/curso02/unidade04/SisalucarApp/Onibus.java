package cursos.curso02.unidade04.SisalucarApp;

public class Onibus extends Veiculo {

    @Override
    public int getPassageiros() {
        return super.getPassageiros();
    }
    public int getPesageiros(){
        return 40;
    }

    @Override
    public void acelera() {
        super.acelera();
    }

    public void acelera(int limiteVelocidade) {
        limiteVelocidade = 80;
        System.out.println("Obedeça o limite de velocidade que é: "+limiteVelocidade);
    }

}
