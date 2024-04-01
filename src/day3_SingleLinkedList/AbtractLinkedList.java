package day3_SingleLinkedList;

public interface AbtractLinkedList<E> {
    void addFirst(E element);// stack/push
    void addLast(E element); //queue/offer
    E removeFirst(); //stack/pop
    E removeLast();
    E getFirst(); //peek
    E getLast();
    int size();
    boolean isEmpty();
}
