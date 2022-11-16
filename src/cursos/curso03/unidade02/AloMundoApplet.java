package cursos.curso03.unidade02;

import java.awt.*;
import javax.swing.JApplet;

public class AloMundoApplet extends JApplet {

    private static final long serialVersionUID = 1L;

    @Override
    public void init() {
        //super.init();
        System.out.println("Inicializando...");
    }

    @Override
    public void paint(Graphics g) {
        //super.paint(g);
        this.setBackground(Color.GREEN);
        this.setSize(400, 100);

        g.drawRect(0, 0, 150, 150);
        g.setColor(Color.BLUE);
        g.setFont(new Font("Times New Roman", Font.BOLD, 30));
        g.drawString("Versao JVM:" + System.getProperty("java.version"), 20, 20);
        g.drawString("Versao S.O:" + System.getProperty("os.name"), 20, 20);
    }

    @Override
    public void start() {
        //super.start();
        System.out.println("Executando...");
    }

    @Override
    public void stop() {
        //super.stop();
        System.out.println("Finalizando...");
    }

    @Override
    public void destroy() {
        //super.destroy();
        System.out.println("Elimininando...");
    }
}
