package queue;

public interface Queue<E> {

    boolean insert(E value); // позволяет добавлять элемент

    E remove(); // удаляет элемент (т.е. первый добавленный)

    E peekFront(); // показывает ближайший элемент для извлечения (т.е. сначала)

    int size();

    boolean isEmpty();

    boolean isFull();

    void display();

}
