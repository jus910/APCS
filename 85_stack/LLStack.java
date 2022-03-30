import java.util.LinkedList;

public class LLStack<E> implements Stack<E> {
    LinkedList<E> stack;

    public LLStack() {
        stack = new LinkedList<E>();
    }

    public boolean isEmpty() {
        return stack.size()==0;
    }

    public E peekTop() {
        if (isEmpty()) return null;
        return stack.getLast();
    }

    public E pop() {
        if (isEmpty()) return null;
        return stack.removeLast();
    }

    public void push(E x) {
        stack.add(x);
    }
    
}
