package stack;

import java.util.Arrays;

public class StackImpl<E> implements Stack<E>{

    private final E[] data; // для сохранения результатов стека
    private int size;

    public StackImpl(int maxSize) {
        this.data = (E[])new Object[maxSize];
    }


    @Override
    public void push(E value) {
        data[size++] = value; // т.е. обращаемся к последнему элементу в стеке и добавляем на след позицию элемент
    }

    @Override
    public E pop() {  // извлекает посл элемент их стека, т.е. удаляет
        E value = data[size-1];
        data[--size] = null;
        return value;
    }

    @Override
    public E peek() { // показ последнего элемента
        return data[size-1];
    }

    @Override
    public int size() { //показ размера массива
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean isFull() {
        return size == data.length; // т.е. сравниваем size с длинной размера массива
    }

    @Override
    public void display() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (int i = size-1; i >= 0; i--) {
            sb.append(data[i]);
            if (i > 0) {
                sb.append(", ");
            }
        }
        sb.append("]");

        return sb.toString() ;
    }
}
