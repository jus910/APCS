/*
Watermelon: Justin, Anthony, Jomin
apcs pd7
HW90 & HW91: Deque
2022-04-12
time spent: 0.2 hr + class time
*/

public interface Deque<T> {
    public boolean isEmpty();
    public boolean offerFirst(T x);
    public boolean offerLast(T x);
    public T pollFirst();
    public T pollLast();
    public T peekFirst();
    public T peekLast();
}
