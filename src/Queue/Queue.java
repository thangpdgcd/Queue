package Queue;

public class Queue<E> implements AbtractQueue<E> {
    private Node<E> head;
    private int size;

    // constructor
    public Queue() {
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
    public E peek() {return head.element;
    }

    @Override
    public E poll() {
        E temp = head.element;
        Node<E> nextNode = head.next;
        head.next = null;
        head = nextNode;
        size--;
        return temp;
    }
    @Override
    public int size() {
        return size;
    }
    @Override
    public boolean isEmpty() {
          if ( size == 0 && head == null ) {
            return true;
        } else {
            return false;
        }
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

    private class Node<E> {
        private E element;
        private Node<E> next;

        // constructor
        public Node(E element) {
            this.element = element;
            this.next = null;
        }

    }
}
class runner {
    public static void main(String args[])
    {
       Queue<Integer> myQueue= new Queue<Integer>();
        System.out.println( myQueue.isEmpty( ) ); // true

        myQueue.offer( 10 );
        myQueue.offer( 20 );
        myQueue.offer( 30 );
        myQueue.offer( 40 );

        System.out.println( myQueue.isEmpty( ) ); // false

        System.out.println( myQueue.size( ) ); // 4
        System.out.println( myQueue.peek( ) ); // 10

        System.out.println( myQueue.poll( ) ); // 10
        System.out.println( myQueue.peek( ) ); // 20
        System.out.println( myQueue.size( ) ); // 3

        System.out.println( myQueue );
    }

}
