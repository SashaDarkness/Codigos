package cursos.curso03.unidade05.Default;

@FunctionalInterface
public interface Formula {
    //a classes que implementarem a interface Formula só terao a

    double calcular(int a); //apenas 1 método abstrato calcular();
   // double calcularX(); //SE FOR ADICIONAR ESSE TIRA A ANOTAÇÃO  @FunctionalInterface

    //pode ter vários outros métodos
    default  double sqrt(int a){
        return Math.sqrt(a);
    }

    default  double sqrt(int a, int b){
        return Math.sqrt(a+b);
    }

}
