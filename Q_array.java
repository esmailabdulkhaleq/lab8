package lab8;

import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;

public class Q_array<E> implements Queue<E> {


    public E[] elements;
    private E[] data;
        private int front;
        private int size;

        public Q_array(int capacity) {
            data = (E[]) new Object[capacity];
        }

        public void rotate() {
            if (size <= 1) {
                return;
            }
            E temp = data[front];
            front = (front + 1) % data.length;
            data[(front + size - 1) % data.length] = temp;
        }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator<E> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public boolean add(E e) {
        return false;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public boolean offer(E e) {
        return false;
    }

    @Override
    public E remove() {
        return null;
    }

    @Override
    public E poll() {
        return null;
    }

    @Override
    public E element() {
        return null;
    }

    @Override
    public E peek() {
        return null;
    }

    // enqueue, dequeue, and other methods omitted for brevity
    }


