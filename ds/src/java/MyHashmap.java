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
    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
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
        return null;
    }

    @Override
    public U put(T key, U value) {
        return null;
    }

    @Override
    public U remove(Object key) {
        return null;
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
}
