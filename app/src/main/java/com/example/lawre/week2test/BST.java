package com.example.lawre.week2test;

public class BST
{
    BinaryItem firstItem;

    public BST(int[] inputArray)
    {
        for(int i =0; i<inputArray.length;i++)
        {
            add(inputArray[i]);
        }
    }

    public void add(int intToAdd)
    {
        firstItem = insert(firstItem, intToAdd);
    }

    public BinaryItem insert(BinaryItem bi, int intToAdd)
    {
        if(bi == null)
        {
            return new BinaryItem(intToAdd);
        }
        else
        {
            if(intToAdd <= bi.getMyValue())
            {
                bi.myLeft = insert(bi.getMyLeft(),intToAdd);
            }
            else
            {
                bi.myRight = (insert(bi.getMyRight(),intToAdd));
            }
            return bi;
        }
    }

    public void printPreorder()
    {
        print(firstItem);
    }

    private void print(BinaryItem bi)
    {
        if (bi != null)
        {
            System.out.println(bi.getMyValue());
            print(bi.getMyLeft());
            print(bi.getMyRight());
        }
    }
}
