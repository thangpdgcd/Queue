public class Node<E> {
    public E element;
    public  Node<E> next;

    public Node(E element) {
this.element=element;
this.next=null;
    }
}
class Runnerjava
{
    public static void main(String[] args)
    {
        Node<Integer>head;
        head = new Node<>( 10 );
        head.next = new Node<>( 20 );
        head.next.next = new Node<>( 30 );

        System.out.println( head.element ); // 10
        System.out.println( head.next.element ); // 20
//        System.out.println( head.next.next.element ); // 30


        head.next.next.element = 40;

    }
}
