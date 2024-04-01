package day3_SingleLinkedList;
import org.w3c.dom.Node;
public class SingleLinkedList<E> implements AbtractLinkedList<E> {

    private Node<E> head; //dau
    private Node<E> tail; //duoi
    private  int size;

    public SingleLinkedList() {
        head=tail=null;
        size=0;
    }
    @Override
    public void addFirst(E element) { //giong push stack //them vao dau
        Node<E> newNode=new Node<>(element);
        if (head==null && tail==null)
        { //if list Empty
            head=newNode;
            tail=newNode;
        }else
        {//if list not Empty
           newNode.next=head;
           head=newNode;
        }
        size ++;
    }

    @Override
    public void addLast(E element) {//add vao cuoi duoi //giong offer cua queu
        Node<E> newNode =new Node<>(element);
        if(head == null && tail==null)
        {
            head=newNode;
            tail=newNode;
        }else
        {
            newNode.next=tail;
            tail=newNode;
        }
        size++;
    }

    @Override
    public E removeFirst() {
        return null;
    }

    @Override
    public E removeLast() {
        return null;
    }

    @Override
    public E getFirst() {
        return null;
    }

    @Override
    public E getLast() {
        return null;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return isEmpty();
    }

    private class  Node<E>
    {
        private E element;
        private Node<E> next;
        public Node(E element)
        {
            this.element=element;
            this.next=null;
        }

    }


}
class Runnerlinkedlist
{
    public static  void main(String args[])
    {
     SingleLinkedList<Integer> mysinglelinkedlist =new SingleLinkedList<>();
//        mysinglelinkedlist.addFirst(10);
//        mysinglelinkedlist.addFirst(20);
//        mysinglelinkedlist.addFirst(30);
//        mysinglelinkedlist.addFirst(40);
//        mysinglelinkedlist.addFirst(50);
//        mysinglelinkedlist.addFirst(60);
//        mysinglelinkedlist.addFirst(70);
//        mysinglelinkedlist.addFirst(80);
//sout=[10,20,30,40,50,60,70]
        mysinglelinkedlist.addLast(10);
        mysinglelinkedlist.addLast(20);
        mysinglelinkedlist.addLast(30);
        mysinglelinkedlist.addLast(40);
        mysinglelinkedlist.addLast(50);
        mysinglelinkedlist.addLast(60);
        mysinglelinkedlist.addLast(70);
        mysinglelinkedlist.addLast(80);


//sout=[70,60,50,40,30,20,10]

        System.out.println();

    }
}
