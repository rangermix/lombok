package lombok.core;

import java.util.Map;

public interface LombokCache<K, V> {
    int getRetention();

    // 0 means infinite
    void setRetention(int seconds);

    int getCapacity();

    // 0 means infinite
    void setCapacity(int n);

    V get(K k);

    void put(K k, V v);


}
