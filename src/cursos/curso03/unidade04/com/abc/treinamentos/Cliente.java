package cursos.curso03.unidade04.com.abc.treinamentos;

import java.util.HashSet;
import java.util.Set;

public class Cliente {
    Set<Cursos> cursos;
    public static void main(String[] args) {
        Cursos java8 = new Cursos("java 08",90);
        Cursos oracle = new Cursos("oracle",100);

        Set<Cursos> cursosA = new HashSet<>();
        Set<Cursos> cursosB = new HashSet<>();

        cursosA.add(java8);
        cursosA.add(oracle);

        cursosB.add(oracle);

        System.out.println("CursosA: " + cursosA);
        System.out.println("CursosB:" + cursosB);
        System.out.println("\n---------");

        //interseção
        System.out.println("A intersec B:");
        cursosA.retainAll(cursosB);
        System.out.println(cursosA);
        System.out.println("\n---------");

        System.out.println("B - A");
        cursosB.removeAll(cursosA);
        System.out.println(cursosB); //VAZIO
        System.out.println("\n---------");

        cursosA.removeAll(cursosB);
        System.out.println("A - B");
        System.out.println(cursosA);


        Cliente A = new Cliente();
        Cliente B = new Cliente();

        A.setCursos(cursosA);
        B.setCursos(cursosB);

        System.out.println("\n---");
        System.out.println("A:" +A);
        System.out.println("B:" +B);

    }

    public void setCursos(Set cursos){
        this.cursos = cursos;
    }

    public Set<Cursos> getCursos(){
        return cursos;
    }

    @Override
    public String toString(){
        return cursos + ".";
    }

}
