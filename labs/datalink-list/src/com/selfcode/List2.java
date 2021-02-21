package com.selfcode;

public interface List2<T extends Comparable<T>> {
    Node<T> getMiddleNode();
    void insert(T data);
    void remove(T data);
    void traverse();
    int size();
}
