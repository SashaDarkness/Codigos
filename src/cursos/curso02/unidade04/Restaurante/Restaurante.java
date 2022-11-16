package cursos.curso02.unidade04.Restaurante;

public class Restaurante extends Cliente {

    public void mensagem(){
        System.out.println("Mensagem...");
    }

    public static void main(String[] args){
        Cliente cliente = new Restaurante();
        ((Restaurante)cliente).mensagem();

    }
}
