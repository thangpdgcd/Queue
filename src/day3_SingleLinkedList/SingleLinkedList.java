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
        Node<E> newNode=new Node(element);
        if (head==null && tail==null) //hoac thay cum nay tu ham isempty
        { //if list Empty
            head=newNode;
            tail=newNode;
        }else
        {//if list not Empty
           head.next=newNode;
           head=newNode;
        }
        size ++;
    }

    @Override
    public void addLast(E element) {//add vao cuoi duoi //giong offer cua queu
        Node<E> newNode =new Node<>(element); //tao newnode
        if(head == null && tail==null) //check rong
        {
            head=newNode;
            tail=newNode;
        }else
        {
            tail.next=newNode;
            tail=newNode;
        }
        size++;
    }

    @Override
    public E removeFirst() {
        E tempfirst =head.element; //tro elemen vao
      if(head==tail)
      {
          head=null;
          tail=null;
      }
      else
      {
          Node<E> nextNode =head.next; ///khai bao nextnode
          head.next=null;
          head=nextNode;
      }
        size--;
        return tempfirst;
    }

    @Override
    public E removeLast() {
        E templast = tail.element; //tro elemen vao


        if(head==tail)
        {
            head=null;
            tail=null;
        }else
        {
            Node<E> nextNode =head; ///khai bao nextnode ///node5
            while (nextNode.next != tail)
            {
                nextNode=nextNode.next;//n5
//            nextNode=nextNode.next;//n2
//            nextNode=nextNode.next;//n3
//            nextNode=nextNode.next;//n4s
            }
            tail=nextNode;
            tail.next=null;
        }


        size--;
        return templast;
    }

    @Override
    public E getFirst() {

        return head.element;
    }

    @Override
    public E getLast() {
        return tail.element;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        if(head== null && tail==null)
        {
            return true;
        }
        else
        {
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
    @Override
    public E remove(E element) {
        return null;
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

        mysinglelinkedlist.removeFirst();

        System.out.println(mysinglelinkedlist);
//sout=[70,60,50,40,30,20,10]

//        System.out.println("code"+mysinglelinkedlist.getFirst());
//        System.out.println("code"+mysinglelinkedlist.getLast());
        System.out.println("addlast" + mysinglelinkedlist);
        System.out.println(mysinglelinkedlist.removeFirst());
        System.out.println(mysinglelinkedlist.removeLast());

    }
}
