package com.selfcode;

public class LinkedList2<T extends Comparable<T>> implements List2<T> {

    private Node<T> root;
    private int numberOfTiems;

    @Override
    public void insert(T data) {
        if (root == null) {
            root = new Node<>(data);
        } else {
            insertBegining(data);
        }

    }

    @Override
    public void remove(T data) {
        // a - b -c

        if (root == null) return;

        if (root.getData().compareTo(data) == 0) {
            root = root.getNextNode();
        } else {
            remove(data, root, root.getNextNode());
        }

    }

    private void remove(T data, Node<T> actualNode, Node<T> nextNode) {
        while (nextNode.getNextNode() != null) {
            if (nextNode.getData().compareTo(data) == 0) {
                numberOfTiems--;
                actualNode.setNextNode(nextNode.getNextNode());
                nextNode = null;
                return;
            }
            actualNode = nextNode;
            nextNode = nextNode.getNextNode();
        }

    }

    private void insertBegining(T data) {
        Node<T> newNode = new Node<>(data);
        newNode.setNextNode(root);
        root = newNode;
    }

    private void insertEnd(T data, Node<T> node) {
        if (node.getNextNode() != null) {
            insertEnd(data, node.getNextNode());
        } else {
            Node<T> newNode = new Node<>(data);
            node.setNextNode(newNode);
        }
    }


    @Override
    public void traverse() {
        if (root == null) return;
        Node<T> actualNode = root;
        while (actualNode != null) {
            System.out.println(actualNode.toString());
            actualNode = actualNode.getNextNode();
        }
    }

    @Override
    public int size() {
        return numberOfTiems;
    }
}
