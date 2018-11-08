package com.practice.lavender.practiceproblemsapp;

public class MyLinkedList<T> {

    private MyLinkedListNode<T> mHead;

    public MyLinkedList(MyLinkedListNode head) {
        mHead = head;
    }

    public MyLinkedListNode getHead() {
        return mHead;
    }

    public void setHead(MyLinkedListNode head) {
        this.mHead = head;
    }
}
