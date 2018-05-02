import java.util.*;

/**
 * Created by mani on 25/04/18.
 */
public class MyArrayList<E> implements List<E>, RandomAccess {

    private static final Object[] DEFAULTCAPACITY_EMPTY_ELEMENTDATA = {};

    private static final int GROWTH_FACTOR = 5;

    private int DEFAULT_INITIAL_CAPACITY = 10;

    transient Object[] elementData;

    private int theSize = 0;

    MyArrayList() {
        elementData = DEFAULTCAPACITY_EMPTY_ELEMENTDATA;
    }

    MyArrayList(int initialCapacity) {
        elementData = new Object[initialCapacity];
    }

    @Override
    public int size() {
        return theSize;
    }

    @Override
    public boolean isEmpty() {
        return theSize == 0;
    }

    @Override
    public boolean contains(Object o) {
        for(int index=0;index<theSize;index++) {
            return (elementData[index].equals(o));
        }
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
    public boolean add(E element) {
        if((elementData == DEFAULTCAPACITY_EMPTY_ELEMENTDATA) || isFull()){
            resizeArray();
        }
        elementData[theSize++] = element;
        return true;
    }

    private boolean isFull() {
        return (elementData.length <= theSize);
    }

    private void resizeArray() {
        Object[] newArray = new Object[theSize + GROWTH_FACTOR];
        for(int index=0;index<theSize;index++) {
            newArray[index] = elementData[index];
        }
        elementData = newArray;
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
    public boolean addAll(int index, Collection<? extends E> c) {
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
        elementData = DEFAULTCAPACITY_EMPTY_ELEMENTDATA;
        theSize = 0;
    }

    @Override
    public E get(int index) {
        rangeCheck(index);
        return (E) elementData[index];
    }

    private void rangeCheck(int index) {
        if (index < 0 || index >= theSize)
            throw new ArrayIndexOutOfBoundsException();
    }

    @Override
    public E set(int index, E element) {
        return null;
    }

    @Override
    public void add(int index, E element) {

    }

    @Override
    public E remove(int index) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        for(int index=0;index<theSize;index++) {
            if(elementData[index].equals(o))
                return index;
        }
        return -1;
    }

    @Override
    public int lastIndexOf(Object o) {
        for(int index=theSize-1;index>=0;index--) {
            if(elementData[index].equals(o))
                return index;
        }
        return -1;
    }

    @Override
    public ListIterator<E> listIterator() {
        return null;
    }

    @Override
    public ListIterator<E> listIterator(int index) {
        return null;
    }

    @Override
    public List<E> subList(int fromIndex, int toIndex) {
        return null;
    }
}
