package com.example.lawre.week2test;

public class CustArrayList<E>
{
    int arraySize;
    Object[] arrayOfObjects;
    Object[] bumpedArrayOfObjects;

    public CustArrayList()
    {
        arraySize = 10;
        arrayOfObjects = new Object[arraySize];
    }

    public void add(Object o)
    {
        if(arrayOfObjects[arraySize-1] != null)
        {
            bumpedArrayOfObjects = new Object[arraySize*2];
            for(int i=0;i<arraySize;i++)
            {
                bumpedArrayOfObjects[i] = arrayOfObjects[i];
            }
            arrayOfObjects = bumpedArrayOfObjects;
            arrayOfObjects[arraySize+1] = o;
            arraySize *= 2;
        }
        else
        {
            int i = 0;
            while(arrayOfObjects[i] != null)
            {
                i++;
            }
            arrayOfObjects[i] = o;
        }
    }

    public Object getObject(int i)
    {
        return arrayOfObjects[i];
    }

    public void remove(Object o)
    {
        int index = -1;
        for(int i = 0; i < arraySize; i++)
        {
            if(arrayOfObjects[i].equals(o))
            {
                index = i;
            }
        }
        if(index == -1)
        {
            return;
        }
        for(int i = index; i< arraySize-1;i++)
        {
            arrayOfObjects[i+1] = arrayOfObjects[i];
        }
    }

    public void printList()
    {
        for(int i = 0; i < arrayOfObjects.length; i++)
        {
            if(arrayOfObjects[i] != null)
                System.out.println(arrayOfObjects[i].toString());
        }
    }
}
