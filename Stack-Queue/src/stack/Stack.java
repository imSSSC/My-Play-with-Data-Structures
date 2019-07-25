package stack;

/**
 * @program: Data-Structural
 * @description: 栈接口
 * @author: snake
 * @create: 2019-07-15 22:08
 */
public interface Stack<E> {

    int getSize();
    boolean isEmpty();
    void push(E e);
    E pop();
    E peek();
}
