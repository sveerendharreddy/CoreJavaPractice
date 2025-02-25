package design;

import java.util.*;

public class LRUImplementation {
    public static void main(String[] args) {
        System.out.println("LRU");
        LRUCache lruCache = new LRUCache(2);
        lruCache.put(1);
        lruCache.put(2);
        lruCache.put(3);
        lruCache.get(4);
        lruCache.get(2);
        lruCache.put(4);

        lruCache.display();
    }
}

class LRUCache{

    Deque<Integer> dequeMap;
    Set<Integer> store;
    final int maxSize;

    LRUCache(int maxSize) {
        this.maxSize = maxSize;
        this.dequeMap = new ArrayDeque<>();
        this.store = new HashSet<>(maxSize);
    }

    public void evict(){

    }
    public void put(int key){
        if (dequeMap.size() == maxSize){
            dequeMap.removeLast();
            store.remove(key);
        }
        dequeMap.addFirst(key);
        store.add(key);
    }

    public int get(int key){
        if (store.contains(key)){
            dequeMap.remove(key);
            dequeMap.addFirst(key);
            return key;
        }else {
            return -1;
        }
    }

    public void display(){
        Iterator<Integer> iterator = dequeMap.iterator();
        if (iterator.hasNext()){
            System.out.print(iterator.next() + " ");
        }
    }

}
