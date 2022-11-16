package cursos.curso03.unidade04;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class PropertiesApp {
    public static void main(String[] args) throws Exception {
        Properties sites = new Properties();

        try {
            sites.loadFromXML(new FileInputStream("src/cursos/curso03/unidade04/sites.xml"));
            System.out.println("- " + sites.getProperty("1"));

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
