package lombok.core;

import java.util.concurrent.ConcurrentHashMap;

public class LombokLRUCache<K, V> extends ConcurrentHashMap<K, V> implements LombokCache<K, V> {

    class Node<K, V> {
        Node<K, V> prev, next;
        K k;
        V v;
        long birthEpoch;
    }

    @Override
    public int getRetention() {
        return 0;
    }

    @Override
    public void setRetention(int seconds) {

    }

    @Override
    public int getCapacity() {
        return 0;
    }

    @Override
    public void setCapacity(int n) {

    }
}
