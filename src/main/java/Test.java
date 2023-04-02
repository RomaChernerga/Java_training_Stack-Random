import dequeue.Dequeue;
import dequeue.DequeueImpl;
import queue.PriorityQueueImpl;
import queue.Queue;
import queue.QueueImpl;
import stack.Stack;
import stack.StackImpl;

import java.util.PriorityQueue;

public class Test {
    public static void main(String[] args) {
//        testStack();
//        testQueue();
        testDequeue();
//        testPriorityQueue();

    }

    private static void testDequeue() {

        Dequeue<Integer> dequeue = new DequeueImpl<>(6);

        System.out.println("add element: " + dequeue.insertLeft(1));
        System.out.println("add element: " + dequeue.insertRight(9));
//        System.out.println("add element: " + dequeue.insertLeft(2));
//        System.out.println("add element: " + dequeue.insertRight(10));
//        System.out.println("add element: " + dequeue.insertRight(11));
//        System.out.println("add element: " + dequeue.insertLeft(3));
//        System.out.println("add element: " + dequeue.insertLeft(4));

        dequeue.display();

    }

    private static void testPriorityQueue() {

        Queue<Integer> queue = new PriorityQueueImpl<>(5);
        System.out.println("add element: " + queue.insert(34));
        System.out.println("add element: " + queue.insert(12));
        System.out.println("add element: " + queue.insert(20));
        System.out.println("add element: " + queue.insert(16));
        System.out.println("add element: " + queue.insert(14));
        System.out.println("add element: " + queue.insert(17));

        queue.display();
        System.out.println("remove: " + queue.remove());
        queue.display();

    }

    private static void testStack() {

        Stack<Integer> stack = new StackImpl<>(5);


        System.out.println(addToStack(stack, 12));
        System.out.println(addToStack(stack, 16));
        System.out.println(addToStack(stack, 22));
        System.out.println(addToStack(stack, 5));
        System.out.println(addToStack(stack, 1));
        System.out.println(addToStack(stack, 32));

        stack.display();

        System.out.println("top value: " + stack.pop()); // удаляем верхний элемент
        System.out.println("top value: " + stack.peek()); // показываем верхний элемент

        stack.display();


    }
    private static boolean addToStack(Stack<Integer> stack, int num) {
        if(!stack.isFull()) {
            stack.push(num);
            return true;
        }
        return false;
    }

    private static void testQueue() {

        Queue<Integer>queue = new QueueImpl<>(5);

        System.out.println("add element: " + queue.insert(34));
        System.out.println("add element: " + queue.insert(12));
        System.out.println("add element: " + queue.insert(20));
        System.out.println("add element: " + queue.insert(16));
        System.out.println("add element: " + queue.insert(14));
        System.out.println("add element: " + queue.insert(17));

        queue.display();
        System.out.println("remove: " + queue.remove());
        queue.display();


    }

}
