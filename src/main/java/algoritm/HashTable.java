package algoritm;

import java.util.LinkedList;

public class HashTable<K, V> {

    private static final int init_basket_count = 16;
    private static final double LOAD_FACTOR = 0.75;
    private int size = 0;
    private basket[] baskets;


    public HashTable() {
        this(init_basket_count);
    }

    public HashTable(int initSize) {
        baskets = (basket[]) new Object[initSize];
    }

    private int calculateBasketIndex(K key) {
        return key.hashCode() % baskets.length;
    }


    private class entity {
        private K key;
        private V value;
    }

    private class basket {
        private Node head;

        public boolean remove(K key) {
            if (head != null) {
                if (head.value.key.equals(key)) {
                    head = head.next;
                } else {
                    Node node = head;
                    while (node.next != null) {
                        if (node.next.value.key.equals(key)) {
                            node.next = node.next.next;
                            return true;
                        }
                        node = node.next;
                    }
                }
            }
            return false;
        }

        public boolean add(entity entity) {
            Node node = new Node();
            node.value = entity;
            if (head != null) {
                Node current = head;
                while (true) {
                    if (current.value.key.equals(entity.key)) {
                        return false;
                    }
                    if (current.next == null) {
                        current.next = node;
                        return true;
                    } else {
                        current = current.next;
                    }
                }
            } else {
                head = node;
                return true;
            }
        }


        private class Node {
            private Node next;
            private entity value;
        }

        public V get_basket(K key) {
            Node item = head;
            while (item != null) {
                if (item.value.key.equals(key)) {
                    return item.value.value;
                }
                item = item.next;
            }
            return null;
        }

    }

    public V get_basket_out(K key) {
        int index = calculateBasketIndex(key);
        basket basket = baskets[index];
        if (basket != null) {
            return basket.get_basket(key);
        }
        return null;
    }

    public boolean put(K key, V value) {
        if (baskets.length * LOAD_FACTOR < size) {
            recalculate();
        }
        int index = calculateBasketIndex(key);
        basket bask = baskets[index];
        if (bask == null) {
            bask = new basket();
            baskets[index] = bask;
        }
        entity entity  = new entity();
        entity.key = key;
        entity.value = value;
        boolean add = bask.add(entity);
        if (add) {
            size++;
        }
        return add;
    }

    public boolean remove(K key) {
        int index = calculateBasketIndex(key);
        basket basket = baskets[index];
        boolean remove = basket.remove(key);
        if (remove) {
            size--;
        }
        return remove;
    }

    private void recalculate() {
        basket[] old = baskets;
        baskets = (basket[]) new Object[old.length * 2];
        for (int i = 0; i < old.length; i++) {
            basket basket = old[i];
            basket.Node node = basket.head;
            while (node != null) {
                put(node.value.key, node.value.value);
                node = node.next;
            }
            old[i] = null;
        }
    }

}






