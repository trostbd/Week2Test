package com.example.lawre.week2test;

public class LinkList
{
    Item firstItem;
    char[] charArray;

    public LinkList(String convertString)
    {
        charArray = convertString.toCharArray();
        firstItem = new Item(charArray[0]);
        Item currItem = firstItem;
        for(int i=1;i<charArray.length;i++)
        {
            Item nextItem = new Item(charArray[i]);
            currItem.setNextItem(nextItem);
            currItem = nextItem;
        }
    }

    public void add(Item newItem)
    {
        Item currItem = firstItem;
        while(currItem.getNextItem() != null)
        {
            currItem = currItem.getNextItem();
        }
        currItem.setNextItem(newItem);
    }

    public boolean remove(int index)
    {
        Item current = firstItem;
        if (firstItem != null)
        {
            for (int i = 0; i < index; i++)
            {
                if (current.getNextItem() == null)
                    return false;

                current = current.getNextItem();
            }
            current.setNextItem(current.getNextItem().getNextItem());
            return true;
        }
        return false;
    }

    public void printList()
    {
        Item currItem = firstItem;
        while(currItem != null)
        {
            System.out.println(currItem.getMyChar());
            currItem = currItem.getNextItem();
        }
    }
}
