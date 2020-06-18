public class DNode {

    private String element; //Elemento do DNode é uma string
    private DNode previous; //Referência para um objeto DNode
    private DNode next; //Referência para um objeto DNode

    //Cria um node com um elemento e duas referências
    public DNode(String s, DNode p, DNode n) {
        element = s;
        previous = p;
        next = n;
    }

    //Cria um node com um elemento e duas referências null
    public DNode(String element) {
        this(element, null, null);
    }

    //Retorna o elemento deste node
    public String getElement() {
        return element;
    }

    //Retorna a referência para o node anterior
    public DNode getPrevious() {
        return previous;
    }

    //Retorna a referência para o próximo node
    public DNode getNext() {
        return next;
    }

    //Define o elemento deste node
    public void setElement(String newElem) {
        element = newElem;
    }

    //Define a referência para o node anterior
    public void setPrevious(DNode newPrevious) {
        previous = newPrevious;
    }

    //Define a referência para o próximo node
    public void setNext(DNode newNext) {
        next = newNext;
    }
}
