package Queue;

public class Queue<E> implements AbtractQueue<E> {
    private Node<E> head;
    private int size;
    // constructor
    public Queue( ) {
        head = null;
        size = 0;
    }
    @Override
    public void offer(E element) {
        Node<E> newNode = new Node<>( element );

        if ( head == null ) {
            head = newNode;
        } else {
            Node<E> current = head;
            while ( current.next != null ) {
                current = current.next;
            }

            current.next = newNode;
        }
        size++;
    }

    @Override
    public int size() {
        return size;
    }
    private class Node<E>
    { private E element;
        private Node<E> next;
        // constructor
        public Node( E element ) {
            this.element = element;
            this.next = null;
        }

    }

}
class runner {
    public static void main(String args[])
    {
        Queue<Integer> myqueue = new Queue<Integer>();
        myqueue.offer(10);
        myqueue.offer(20);
        myqueue.offer(30);
        myqueue.offer(40);
        myqueue.offer(50);


        System.out.println();
    }

}
