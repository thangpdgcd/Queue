package AbtractLinkedlist;

import Queue.Queue;
import org.w3c.dom.Node;

import java.lang.invoke.CallSite;

public class doublelinkedlist<E> implements Abtractlinkedlist<E> {
    private Node<E> head;
    private Node<E> tail;
    private int size;
    public doublelinkedlist(){
        head = tail = null;
        size = 0;
    }
    @Override
    public void addFirst( E element ) {
        Node<E> newNode = new Node(element);

        if(head == null && tail == null){
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.previous = newNode;
            head = newNode;
        }

        size++;
    }
    @Override
    public void addLast( E element ) {
        Node<E> newNode = new Node(element);

        if(head == null && tail == null){
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.previous = tail;
            tail = newNode;
        }
    }

    @Override
    public E removeFirst( ) {
        E temp = head.element;
        if(head == tail){
            head = tail = null;
        } else {
            Node<E> nextNode = head.next;
            head.next = null;
            head = nextNode;
        }
        size--;
        return temp;
    }

    @Override
    public E removeLast( ) {
        //throw an exception if list empty
        E temp = tail.element;
        if (head == tail){
            head = tail = null;
        } else {
            // Option 1
            // tail = tail.previous;
            // tail.next.previous = null;
            // tail.next = null;
            // Option 2
            Node<E> lastNode = tail;
            tail = lastNode.previous;
            tail.next = null;
            lastNode.previous = null;
        }
        size --;
        return temp;
    }

    @Override
    public E getFirst( ) {
        return head.element;
    }
    @Override
    public E getLast( ) {
        return tail.element;
    }
    @Override
    public int size( ) {
        return size;
    }
    @Override
    public boolean isEmpty( ) {
        if(head == null && tail == null){ // return true
            return true;
        } else {
            return false; // return false
        }
    }

    @Override
    public E remove(E element) {

        return null;
    }

    @Override
    public String toString( ) {
        StringBuilder result = new StringBuilder( "[" );
        Node<E> current = head;
        while ( current != null ) {
            result.append( current.element );
            if ( current.next != null ) {
                result.append( ", " );
            }
            current = current.next;
        }
        result.append( "]" );
        return result.toString( );
    }

    private class Node<E>{
        private E element;
        private Node<E> previous;
        private Node<E> next;
        public Node(E element){
            this.element = element;
            this.previous = null;
            this.next = null;
        }
    }
}

class DoubleLinkedListRunner{
    public static void main( String[] args ) {
        doublelinkedlist<Integer> myDoubleLinkedList = new doublelinkedlist<>();
        myDoubleLinkedList.removeLast( ); //error if uncomment
        myDoubleLinkedList.addFirst( 10 );
        myDoubleLinkedList.addFirst( 20 );
        myDoubleLinkedList.addFirst( 30 );

        System.out.println( myDoubleLinkedList ); // [30, 20, 10]

        System.out.println( myDoubleLinkedList.removeFirst() ); // 30
        System.out.println( myDoubleLinkedList.removeLast() ); // 10


        System.out.println( );
    }
}

