import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class LeArquivo {

    public static void main(String[] args) {

        try { //começa tratamento de excessão

            String arquivo = "/home/nicolas/entrada";  //as barras estão assim pq uso linux

            StringBuffer conteudo = new StringBuffer(""); //armazena cada caractere do arquivo

            FileInputStream fi = new FileInputStream(arquivo); //cria um objeto que define o
            //arquivo que vai ler ----->  fi

            int c; //vai receber o byte do arquivo
            ListaLigada lista = new ListaLigada();

            while ((c = fi.read()) != -1) //o -1 indica o fim do arquivo
            //o read está trabalhando com byte, então pode importar qualquer extenção de
            //arquivo, até mesmo com imagem
            {
                conteudo.append((char) c);

            }

            System.out.println("Conteudo do Arquivo:\n" + conteudo);
            lista.insertLast(new DNode(conteudo));

            fi.close();
            lista.show();

        } catch (FileNotFoundException e1) {
            System.out.println("Não achou o arquivo arquivo");
        } catch (Exception e2)  //Exceção caso não funcione
        {
            System.out.println("Erro no tratamento do arquivo");
        }




    }
}
