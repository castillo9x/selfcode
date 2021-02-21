package com.selfcode;

import java.util.Comparator;

public class Node<T extends Comparable<T>> {
    private T data;
    private Node<T> nextNode;
    private Node<T> previousNode;

    public Node(T data) {
        this.data = data;
    }

    public Node(T data, Node<T> nextNode, Node<T> previousNode) {
        this.data = data;
        this.nextNode = nextNode;
        this.previousNode = previousNode;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Node<T> getNextNode() {
        return nextNode;
    }

    public void setNextNode(Node<T> nextNode) {
        this.nextNode = nextNode;
    }

    public Node<T> getPreviousNode() {
        return previousNode;
    }

    public void setPreviousNode(Node<T> previousNode) {
        this.previousNode = previousNode;
    }

    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                '}';
    }
}
