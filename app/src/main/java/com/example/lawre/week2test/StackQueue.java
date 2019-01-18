package com.example.lawre.week2test;

import java.util.EmptyStackException;
import java.util.Stack;

public class StackQueue<E>
{
    Stack<E> mainStack, tempStack;

    public StackQueue()
    {
        mainStack = new Stack<>();
        tempStack = new Stack<>();
    }

    public void enQueue(E o)
    {
        while(!mainStack.isEmpty())
        {
            tempStack.push(mainStack.pop());
        }
        mainStack.push(o);
        while(!tempStack.isEmpty())
        {
            mainStack.push(tempStack.pop());
        }
    }

    public E deQueue()
    {
        if(!mainStack.isEmpty())
            return mainStack.pop();
        else
            return null;
    }

    public void printQueue()
    {
        while(!mainStack.isEmpty())
        {
            E o = mainStack.pop();
            System.out.println(o.toString());
            tempStack.push(o);
        }
        while(!tempStack.isEmpty())
        {
            mainStack.push(tempStack.pop());
        }
    }
}
