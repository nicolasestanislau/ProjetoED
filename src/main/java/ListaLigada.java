import java.io.*;
import java.util.*;
import javax.swing.*;

public class ListaLigada {

    protected DNode head; //node cabeça da lista
    protected DNode tail; //node cauda da lista
    protected long size; //número de nodes da lista
    // Construtor default que cria uma lista vazia
    public ListaLigada(){
        head = null;
        tail = null;
        size = 0;
    }
    public boolean isEmpty() {
        return head == null;
    }

    public void insertFirst(DNode novoNode) {
        if (isEmpty()) {
            head = novoNode;
            tail = novoNode;
            size++;
        } else {
            novoNode.setNext(head);
            head.setPrevious(novoNode);
            head = novoNode;
            size++;
        }
    }

    public void insertLast(DNode novoNode) {
        if (isEmpty()) {
            insertFirst(novoNode);
        } else {
            tail.setNext(novoNode);
            novoNode.setPrevious(tail);
            tail = novoNode;
            size++;
        }
    }

    public void show () {
        if (isEmpty()) {
            System.out.println("Lista vazia!");
        } else {
            System.out.print("A lista é: ");
            DNode current = head;
            while (current != null) {
                System.out.print(current.getElement().toString() + " ");
                current = current.getNext();
            }
            System.out.println("\n");
        }
    }


}
