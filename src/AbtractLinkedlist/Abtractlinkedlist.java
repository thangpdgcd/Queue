package AbtractLinkedlist;

public interface Abtractlinkedlist<E> {
void addFirst(E element);
void addLast(E element);
    E removeFirst(); //stack/pop
    E removeLast();
    E getFirst(); //peek
    E getLast();
    int size();
    boolean isEmpty();
    E remove(E element);
}
