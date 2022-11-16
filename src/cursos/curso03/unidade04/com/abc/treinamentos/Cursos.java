package cursos.curso03.unidade04.com.abc.treinamentos;

public class Cursos {
    private String nomeCurso;
    private double valorCurso;

    public Cursos(){}

    public Cursos(String nomeCurso, double valorCurso) {
        this.nomeCurso = nomeCurso;
        this.valorCurso = valorCurso;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public double getValorCurso(){
        return valorCurso;
    }

    public void setValorCurso(double valorCurso){
        this.valorCurso = valorCurso;
    }

    @Override
    public String toString(){
        return "Curso: " + this.nomeCurso +" -> R$: "+ this.valorCurso;
    }

}
