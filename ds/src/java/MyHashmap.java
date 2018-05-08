import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

/**
 * Created by mani on 04/05/18.
 */
public class MyHashmap<T,U> implements Map<T,U> {

    private final static int DEFAULT_INITIAL_CAPACITY = 10;
    private int theSize;

    MyEntry<T,U> table[] = new MyEntry[DEFAULT_INITIAL_CAPACITY];

    private T hashFunc(T key){
        return key;
    }

    private int indexFor(int hash, int length) {
        return hash % length;
    }

    @Override
    public int size() {
        return theSize;
    }

    @Override
    public boolean isEmpty() {
        return theSize==0;
    }

    @Override
    public boolean containsKey(Object key) {
        return false;
    }

    @Override
    public boolean containsValue(Object value) {
        return false;
    }

    @Override
    public U get(Object key) {
        Integer hash = (Integer) hashFunc((T)key);
        int index = indexFor(hash,table.length);
        theSize++;
        return (table[index]==null) ? null: table[index].value;
    }

    @Override
    public U put(T key, U value) {
        Integer hash = (Integer) hashFunc(key);
        int index = indexFor(hash,table.length);
        table[index] = new MyEntry<>(key,value);
        theSize++;
        return table[index].value;
    }

    @Override
    public U remove(Object key) {
        Integer hash = (Integer) hashFunc((T) key);
        int index = indexFor(hash,table.length);
        U oldValue = table[index].value;
        table[index] = null;
        --theSize;
        return oldValue;
    }

    @Override
    public void putAll(Map<? extends T, ? extends U> m) {

    }

    @Override
    public void clear() {

    }

    @Override
    public Set<T> keySet() {
        return null;
    }

    @Override
    public Collection<U> values() {
        return null;
    }

    @Override
    public Set<Entry<T, U>> entrySet() {
        return null;
    }

    @Override
    public boolean equals(Object o) {
        return false;
    }

    @Override
    public int hashCode() {
        return 0;
    }

    @Override
    public U getOrDefault(Object key, U defaultValue) {
        return null;
    }

    @Override
    public void forEach(BiConsumer<? super T, ? super U> action) {

    }

    @Override
    public void replaceAll(BiFunction<? super T, ? super U, ? extends U> function) {

    }

    @Override
    public U putIfAbsent(T key, U value) {
        return null;
    }

    @Override
    public boolean remove(Object key, Object value) {
        return false;
    }

    @Override
    public boolean replace(T key, U oldValue, U newValue) {
        return false;
    }

    @Override
    public U replace(T key, U value) {
        return null;
    }

    @Override
    public U computeIfAbsent(T key, Function<? super T, ? extends U> mappingFunction) {
        return null;
    }

    @Override
    public U computeIfPresent(T key, BiFunction<? super T, ? super U, ? extends U> remappingFunction) {
        return null;
    }

    @Override
    public U compute(T key, BiFunction<? super T, ? super U, ? extends U> remappingFunction) {
        return null;
    }

    @Override
    public U merge(T key, U value, BiFunction<? super U, ? super U, ? extends U> remappingFunction) {
        return null;
    }

    private class MyEntry<T,U> {
        T key;
        U value;
        MyEntry<T,U> next;

        MyEntry(T key,U value) {
            this.key = key;
            this.value = value;
        }
    }
}
