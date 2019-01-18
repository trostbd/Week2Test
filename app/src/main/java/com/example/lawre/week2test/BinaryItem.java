package com.example.lawre.week2test;

public class BinaryItem
{
    int myValue;
    public BinaryItem myLeft, myRight;

    public BinaryItem(int myValue) {
        this.myValue = myValue;
    }

    public int getMyValue() {
        return myValue;
    }

    public void setMyValue(int myValue) {
        this.myValue = myValue;
    }

    public BinaryItem getMyLeft() {
        return myLeft;
    }

    public void setMyLeft(BinaryItem myLeft) {
        this.myLeft = myLeft;
    }

    public BinaryItem getMyRight() {
        return myRight;
    }

    public void setMyRight(BinaryItem myRight) {
        this.myRight = myRight;
    }
}
