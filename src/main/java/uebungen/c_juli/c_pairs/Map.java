package uebungen.c_juli.c_pairs;

import java.util.ArrayList;
import java.util.List;

public class Map<K, V> {

    List<Pair<K, V>> pairs = new ArrayList<>();

    public Map() {
    }

    public void put(K key, V value) {
        Pair pair = new Pair(key, value);
        pairs.add(pair);
    }

    public V find(K key) {
        // checks for each element
        for (int i = 0; i < pairs.size(); i++) {
            // if the key matches
            if (pairs.get(i).getKey().equals(key)) {
                // and returns the associated value in that case
                return  pairs.get(i).getValue();
            }

            //throw new IllegalArgumentException("kein Eintrag");
            //return key;
        }
        return null;

    }
    public Map<V,K> flip(){
        Map<V,K> flipMap= new Map<>();
        for(int i = 0; i < pairs.size();i++){
            Pair<K,V> pair = pairs.get(i);
            flipMap.put(pair.getValue(),pair.getKey());
        }

        return flipMap;
    }


    @Override
    public String toString() {
        return "Map{" + "pairs=" + pairs +'}';
    }
}


