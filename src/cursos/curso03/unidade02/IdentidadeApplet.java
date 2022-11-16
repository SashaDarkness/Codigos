package cursos.curso03.unidade02;

import javax.swing.JApplet;
public class IdentidadeApplet extends JApplet {
    private static final long serialVersionUID = 1L;
    @Override
    public void init() {
        //super.init();
        int I[][] = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if(i == j) { //elementos diagonal
                    I[i][j] = 1;
                } else {
                    I[i][j] = 0;
                }
                System.out.println(I[i][j]);
            }
            System.out.println("====");
        }


    }
}

