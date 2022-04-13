/*
Watermelon: Justin, Anthony, Jomin
apcs pd7
HW90 & HW91: Deque
2022-04-12
time spent: 0.2 hr + class time
*/

public class NASCAR {
    public static void main(String[] args) {
        Deque<String> deque = new WatermelonDeque<String>();
        deque.offerLast("blue cheese");
        deque.offerLast("is made from blue cows");
        deque.offerFirst("hey did you know that");
        System.out.println(deque);
        deque.pollFirst();
        System.out.println(deque);
        deque.pollLast();
        System.out.println(deque);
        deque.offerLast("goes well with blue milk");
        System.out.println(deque);
        System.out.println(deque.peekFirst());
        System.out.println(deque.peekLast());
        System.out.println(deque.pollFirst());
        System.out.println(deque.pollLast());
        System.out.println("nothing left: "+deque.pollFirst());

    }
}
