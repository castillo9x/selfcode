package com.selfcode;

public class DoublyLinkedList< T extends Comparable <T>> {
    private Node<T> head;
    private Node<T> tail;

    public void insert(T data){
        Node<T> newNode = new Node<>(data);

        if(tail == null){
            tail = newNode;
            head = newNode;
        }else{
            newNode.setPreviousNode(tail);
            tail.setNextNode(newNode);
            tail = newNode;
        }
    }

    public void traverseForwad(){
        Node<T> actualNode = head;
        while(actualNode !=null){
            System.out.println(actualNode.toString());
            actualNode = actualNode.getNextNode();
        }
    }
    public void traverseBackwad(){
        Node<T> actualNode = tail;
        while(actualNode !=null){
            System.out.println(actualNode.toString());
            actualNode = actualNode.getPreviousNode();
        }
    }
}
