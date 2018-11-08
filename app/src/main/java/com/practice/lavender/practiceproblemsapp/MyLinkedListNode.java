package com.practice.lavender.practiceproblemsapp;

public class MyLinkedListNode<T> {

    private MyLinkedListNode<T> mNextNode;
    private T mData;

    public MyLinkedListNode(T data) {
        mData = data;
    }

    public MyLinkedListNode<T> getNextNode() {
        return mNextNode;
    }

    public void setNextNode(MyLinkedListNode<T> mNextNode) {
        this.mNextNode = mNextNode;
    }

    public Object getData() {
        return mData;
    }

    public void setmData(T mData) {
        this.mData = mData;
    }

    void appendToTail(T d) {
        MyLinkedListNode<T> end = new MyLinkedListNode<>(d);
        MyLinkedListNode<T> n = this;
        while (n.mNextNode != null) {
            n = n.mNextNode;
        }
        n.mNextNode = end;
    }
}
