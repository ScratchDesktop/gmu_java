// package project_2;

public class Label<K, V extends Comparable<V>> implements Comparable<Label<K, V>> {
    private K key;
    private V value;

    public Label(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public final K getKey() {
        return key;
    }

    public final V getValue() {
        return value;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(obj instanceof Label) {
            Label<?, ?> other = (Label<?, ?>) obj;
            return this.value.equals(other.getValue());
        }
        return false;
    }

    @Override
    public int compareTo(Label<K, V> other) {
        return this.value.compareTo(other.getValue());
    }
}
