package algoritm;

public class RedBlackTree<K extends Comparable<K>,V> {
    private int size = 0;
    private Node root;
    private static final boolean RED = true;
    private static final boolean BLACK = true;

    class Node {
        private K key;
        private V value;
        private Node leftChild;
        private Node rightChild;
        private boolean color;


        public Node(K key, V value) {
            this.key = key;
            this.value = value;
            leftChild = null;
            rightChild = null;
            color = RED;
        }
    }

    public boolean isRed(Node node) {
        if (node == null) {
            return BLACK;
        }
        return node.color;
    }

    private void flipColors(Node node) {
        node.color = RED;
        node.leftChild.color = BLACK;
        node.rightChild.color = RED;
    }

    public void add(K key, V value) {
        root = add(root, key, value);
        root.color = BLACK;   // Последний корневой узел - ЧЕРНЫЙ
    }

    private Node add(Node node, K key, V value) {
        if(node==null){
            size++;
            return new Node(key,value);
        }

        if(key.compareTo(node.key)<0){
            node.leftChild=add(node.leftChild,key,value);
        }else if(key.compareTo(node.key)>0){
            node.rightChild=add(node.rightChild,key,value);
        }else{
            node.value=value;
        }

        if(isRed(node.rightChild)&&!isRed(node.leftChild)){
            node=leftRotate(node);
        }
        if(isRed(node.leftChild)&&isRed(node.leftChild.leftChild)){
            node=rightRotate(node);
        }
        if(isRed(node.leftChild)&&isRed(node.rightChild)){
            flipColors(node);
        }
        return node;
    }

    private Node rightRotate(Node node) {
        return null;
    }

    private Node leftRotate(Node node) {
        return null;
    }


}
