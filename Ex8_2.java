package lab8;

import java.util.Queue;

public abstract class Ex8_2<E> implements Queue<E>, Cloneable {
    private E[] elements;
    private int head;
    private int tail;
    private int size;

    public void arrayQ(int c) {
        elements = (E[]) new Object[c];
        head = 0;
        tail = 0;
        size = 0;
    }


    @Override
    public Q_array<E> clone() {
        try {
            Q_array<E> clonedQueue = (Q_array<E>) super.clone();
            clonedQueue.elements = elements.clone();
            return clonedQueue;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    @Override
    public void clear() {


    }
}


