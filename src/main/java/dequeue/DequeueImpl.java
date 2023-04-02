package dequeue;

import java.util.Arrays;

public class DequeueImpl<E> implements Dequeue<E> {

    protected final E[] data;
    protected int size;
    protected final int DEFAULT_HEAD = 0;
    protected final int DEFAULT_TAIL = -1;
    protected int tail;
    protected int head;


    public DequeueImpl(int maxSize) {
        this.data = (E[])new Object[maxSize];
        head = DEFAULT_HEAD;
        tail = DEFAULT_TAIL;
    }

    @Override
    public boolean insertLeft(E value) {
        if(isFull()) {
            return false;
        }

        if (tail == data.length - 1) {
            tail = DEFAULT_TAIL;
        }
        data[++tail] = value;
        size++;

        return false;
    }

    @Override
    public boolean insertRight(E value) {
        if(isFull()) {
            return false;
        }

        if (head == data.length - 1) {
            head = DEFAULT_HEAD;
        }
        data[++head] = value;
        size++;
        return true;
    }

    @Override
    public E removeLeft() {
        if (isEmpty()) {
            return null;
        }

        if(head == data.length) {
            head = DEFAULT_HEAD;
        }

        E value = data[head++];
        size--;
        return value;
    }

    @Override
    public E removeRight() {
        if (isEmpty()) {
            return null;
        }

        if(tail == data.length) {
            tail = DEFAULT_TAIL;
        }

        E value = data[tail++];
        size--;
        return value;
    }


    @Override
    public boolean insert(E value) {
        return false;
    }

    @Override
    public E remove() {
        return null;
    }

    @Override
    public E peekFront() {
        return data[head];
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean isFull() {
        return size == data.length;
    }

    @Override
    public void display() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "DequeueImpl{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                ", DEFAULT_HEAD=" + DEFAULT_HEAD +
                ", DEFAULT_TAIL=" + DEFAULT_TAIL +
                ", tail=" + tail +
                ", head=" + head +
                '}';
    }
}
