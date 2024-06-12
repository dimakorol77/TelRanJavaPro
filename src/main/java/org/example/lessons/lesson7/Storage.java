package org.example.lessons.lesson7;



public class Storage {
    private Node  head;
    private Node  tail;
    private int size;




class Node {
    Object data;
    Node next;

    public Node(Object data) {
        this.data = data;
    }
}

    public Storage() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public  void append (Object element) {
    Node newNode = new Node(element);
    if(head==null ){
        head=newNode;
    } else {
        tail.next=newNode;


    }   tail = newNode;



    }

}
