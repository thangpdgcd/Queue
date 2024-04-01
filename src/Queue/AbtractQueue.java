package Queue;

public interface AbtractQueue<E> {
    void offer( E element ); // ~ push
    // E poll( ); // ~ pop
    // E peek( ); // ~ peek
    int size( );
    E poll( ); // ~ pop
    E peek( ); // ~ peek
    // boolean isEmpty( );
    boolean isEmpty( );

}
