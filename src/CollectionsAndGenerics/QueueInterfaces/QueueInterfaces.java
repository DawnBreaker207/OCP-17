package CollectionsAndGenerics.QueueInterfaces;

import java.util.*;

public class QueueInterfaces {

    public static void main(String[] args) {
	Queue<Integer> queue = new LinkedList<>();
	queue.add(10);
	queue.add(4);

	System.out.println(queue.remove());
	System.out.println(queue.peek());

	Deque<Integer> deque = new LinkedList<>();

	deque.offerFirst(10);
	deque.offerLast(4);
	deque.peekFirst();
	deque.pollFirst();
	deque.pollLast();
	deque.pollFirst();
	deque.peekFirst();

	Deque<Integer> stack = new ArrayDeque<>();
	stack.push(10);
	stack.push(4);
	stack.peek();
	stack.poll();
	stack.poll();
	stack.peek();
    }

}
