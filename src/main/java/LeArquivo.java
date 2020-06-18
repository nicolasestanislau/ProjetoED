import javax.swing.*;
import java.io.*;
import java.nio.file.Files;
import java.util.*;
import java.util.Arrays;
import java.util.List;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;



public class LeArquivo {

    public static void main(String[] args) {



            String Caminho = "/home/nicolas/entrada";

            try { //começa tratamento de excessão
                ListaLigada lista = new ListaLigada();

                //as barras estão assim pq uso linux

                FileReader arq = new FileReader(Caminho);
                BufferedReader lerArq  = new BufferedReader(arq);
                String linha = " ";
                try{
                    linha = lerArq.readLine();
                    while (linha != null) {
                        lista.insertLast(new DNode (linha));
                        System.out.println(linha);
                        linha = lerArq.readLine();
                    }
                    arq.close();
                    lista.show();
                    lista.getFirst();

                    lista.removeFirst();
                    lista.removeFirst();
                    lista.removeFirst();

                    lista.show();
                } catch (IOException ex) {

                }


            } catch (FileNotFoundException e1) {
                System.out.println("Não achou o arquivo arquivo");
            } catch (Exception e2)  //Exceção caso não funcione
            {
                System.out.println("Erro no tratamento do arquivo");
            }

    }


}









