package stack;

public interface Stack<E> {

    void push(E value); // Добавление в стек, в самый конец и оттуда же забираем

    E pop();  // извлечение последнего элемента из стека

    E peek(); // top()  показываем последний элемент

    int size();

    boolean isEmpty();

    boolean isFull();

    void display();


}
