package algoritm;

import org.w3c.dom.Node;


public class spisok {

    private Node head;
    private Node tail;

    // делаем односвязный список
    private class Node {
        private int value;
        private Node next;
        private Node previous;

    }

    // добавляем элемент в начало односвязного списка
    public void addFirst(int value) {
        Node first = new Node();
        first.value = value;
        if (head != null) {
            first.next = head;
        }
        head = first;

    }

    // удаляем элемент из односвязного списка
    public void deleteFirst() {
        if (head != null) {
            head = head.next;
        }
    }

    // поиск элемента в односвязном списке True or False
    public boolean ifFind(int value) {
        Node i = head;
        while (i != null) {
            if (i.value == value) {
                return true;
            }
            i = i.next;
        }
        return false;
    }

    //    добавление новых элементов в конец списка и
    public void addLast(int value) {
        Node last = new Node();
        last.value = value;
        if (head == null) {
            head = last;
        } else {
            Node i = head;
            while (i.next != null) {
                i = i.next;
            }
            i.next = last;
        }
    }

    //    удаление последнего элемента из списка
    public void deleteLast() {
        if (head != null) {
            Node i = head;
            while (i.next != null) {
                if (i.next.next == null) {
                    i.next = null;
                    return;
                }
                i = i.next;
            }
            head = null;
        }
    }

    //    метод разворота связного списка
    public void revert() {
        Node currentNode = head;
        while (currentNode!=null){
            Node next = currentNode.next;
            Node previous = currentNode.previous;
            currentNode.next = previous;
            currentNode.previous = next;
            if (previous == null){
                tail = currentNode;
            }
            if (next== null){
                head=currentNode;
            }
            currentNode = next;
        }

    }
}



