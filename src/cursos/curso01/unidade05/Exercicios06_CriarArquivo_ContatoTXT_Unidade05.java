package cursos.curso01.unidade05;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Exercicios06_CriarArquivo_ContatoTXT_Unidade05 {
        public static void main(String[] args) throws IOException {

            String[] nomes ={"Sasha","Caroline","Silva"};
            String[] fones ={"4002-8922","8080-8080","9090-5555"};
            String[] cidades ={"Belém","Ananindeua","Outeiro"};

            FileWriter arquivo = new FileWriter("contatos.txt"); //Nome do arquivo gravado
            PrintWriter gravaArquivos = new PrintWriter(arquivo); //Ação para gravar passando a referencia do de cima.

            gravaArquivos.println("================================");
            gravaArquivos.println("Nomes || Telefones || Cidades   ");
            gravaArquivos.print("--------------------------------");

            for (int i = 0; i < nomes.length; i ++) {
                gravaArquivos.println(" ");
                gravaArquivos.print(nomes[i]+" || ");
                gravaArquivos.print(fones[i]+" || ");
                gravaArquivos.println(cidades[i]);
            }
            gravaArquivos.println("================================");
            arquivo.close();
            gravaArquivos.close();

        }
    }

