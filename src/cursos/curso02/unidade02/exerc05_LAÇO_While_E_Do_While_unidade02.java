package cursos.curso02.unidade02;

public class exerc05_LAÇO_While_E_Do_While_unidade02 {
    public static void main(String[] args) {
        int cont1 = 0, cont2 = 0;

        System.out.println("1 CONTAGEM DE 0 A 100 COM O LAÇO WHILE:");
        while(cont1 < 101){
            System.out.print(cont1 + " ");
            cont1++;
        }
        System.out.println("\n\n2 CONTAGEM DE 0 A 100 COM O LAÇO DO WHILE:");
        do {
            System.out.print(cont2 + " ");
            cont2++;
        } while(cont2 < 101);

    }
}
