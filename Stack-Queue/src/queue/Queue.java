package queue;

/**
 * @author: snake
 * @create: 2019-07-25 22:40
 */
public interface Queue<E> {

    int getSize();

    boolean isEmpty();

    void enqueue(E e);

    E dequeue();

    E getFront();
}
