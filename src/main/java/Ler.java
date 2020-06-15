/* import java.io.*;
import java.util.*;
import javax.swing.*;

 public class Ler {

    private String nome;
    private String[] sai;
    RandomAccessFile objeto;

    String localArq = "/home/nicolas/entrada.txt";

    // O contrutor deve ter o mesmo nome da Classe
    public Ler(String nomeArquivo) {
        nome = nomeArquivo;
    }

    // método que retorna o vetor contendo as informações do arquivo
    public String[] criarVetor() {
        try {
            File arq = new File(nome);
            objeto = new RandomAccessFile(arq, "rw");
            sai = new String[(int) objeto.length()]; // inicializa o vetor com o tamanho do arquivo
            for (int i = 0; i < objeto.length(); i++) {
                sai[i] = objeto.readLine();
            }
            return sai;
        } catch (FileNotFoundException ex) { // trata as exceções do tipo FileNotFoundException
            ex.printStackTrace();
        } catch (IOException ex) { // trata as exceções do tipo IOException
            ex.printStackTrace();
        }


    }
}

 */
