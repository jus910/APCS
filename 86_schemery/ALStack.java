import java.util.ArrayList;

public class ALStack<E> implements Stack<E> {
    ArrayList<E> stack;
    public ALStack() {
        stack = new ArrayList<E>();
    }

    public boolean isEmpty() {
        return stack.size()==0;
    }

    public E peekTop() {
        if (isEmpty()) return null;
        return stack.get(stack.size()-1);
    }

    public E pop() {
        if (isEmpty()) return null;
        E temp = peekTop();
        stack.remove(stack.size()-1);
        return temp;
    }

    public void push(E x) {
        stack.add(x);
    }
    
    public String toString() {
        String s = "";
        for (E x : stack) {
            s+= x+" ";
        }
        return s;
    }
}
