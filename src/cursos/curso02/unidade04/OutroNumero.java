package cursos.curso02.unidade04;

public class OutroNumero extends Numero {
    public int x = 20;

    public int total(){
        return this.x + super.x;
    }

    public static void main(String[] args) {
        OutroNumero num = new OutroNumero();
        System.out.println(num.total());
    }
}
