/* Watermelon: Justin, Anthony, Jomin
apcs pd7
hw87 - queue
2022-04-04
time spent: 0.5 hr
*/

/*
DISCO:
- peekTop will always return the same thing if first element is not removed

QCC:
- how can we handle trying to dequeue when the queue is empty?
*/

public class NodeQueue<T> implements Queue<T> {
    LLNode<T> head;
    LLNode<T> tail;
    public NodeQueue() {
        head = new LLNode<T>(null, null);
        tail = head;
    }

    public T dequeue() {
        if (isEmpty()) return null;
        T foo = head.getCargo();
        head = head.getNext();
        return foo;
    }

    public void enqueue(T x) {
        if (peekFront() == null) {
            tail.setCargo(x);
            return;
        }
        tail.setNext(new LLNode<T>(x, null));
        tail = tail.getNext();
    }

    public boolean isEmpty() {
        return head.getCargo() == null;
    }

    public T peekFront() {
        return head.getCargo();
    }

    public static void main(String[] args) {
        NodeQueue<String> queue = new NodeQueue<String>();
        System.out.println(queue.isEmpty());
        queue.enqueue("hi");
        queue.enqueue("hello");
        queue.enqueue("howdy");
        System.out.println(queue.peekFront()+"\n");
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
    }

}