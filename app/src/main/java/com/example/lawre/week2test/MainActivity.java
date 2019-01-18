package com.example.lawre.week2test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity
{
    LinkList linkedList;
    BST binaryTree;
    StackQueue<String> stackQueue;
    CustArrayList<String> arrayList;

    public static void main(String[] args)
    {
        MainActivity mainAc = new MainActivity();
        mainAc.linkedList();;
        mainAc.stackQueue();
        mainAc.custArrayList();
        mainAc.binarySearchTree();
    }

    public MainActivity()
    {
        linkedList = new LinkList("Brandon ");
        int[] intArray = {50,32,13,65,34,22,3,76,90};
        binaryTree = new BST(intArray);
        stackQueue = new StackQueue<>();
        arrayList = new CustArrayList<>();
    }

    public void linkedList()
    {
        System.out.println("Linked List Problem: \n");
        linkedList.printList();
        linkedList.add(new Item('T'));
        linkedList.printList();
        System.out.println();
        linkedList.remove(4);
        linkedList.printList();
        System.out.println("");
    }

    public void binarySearchTree()
    {
        System.out.println("\n Binary Search Tree Problem: \n");

        binaryTree.printPreorder();
    }

    public void stackQueue()
    {
        System.out.println("\n Queue Stack Problem: \n");
        stackQueue.enQueue("abc");
        stackQueue.enQueue("bcd");
        stackQueue.enQueue("cde");
        stackQueue.enQueue("def");
        stackQueue.printQueue();
        stackQueue.deQueue();
        System.out.println("Dequeuing");
        stackQueue.printQueue();
    }

    public void custArrayList()
    {
        System.out.println("\n Custom Array List Problem: \n");
        for(int i = 0; i < 10; i++)
        {
            arrayList.add("String " + (i+1));
        }
        arrayList.printList();;
        arrayList.add("String 11");
        System.out.println("Adding another string");
        arrayList.printList();;
    }
}
