package com.example.lawre.week2test;

public class Item
{
    private Character myChar;
    private Item nextItem;

    public Item(Character myChar) {
        this.myChar = myChar;
    }

    public Character getMyChar() {
        return myChar;
    }

    public void setMyChar(Character myChar) {
        this.myChar = myChar;
    }

    public Item getNextItem() {
        return nextItem;
    }

    public void setNextItem(Item nextItem) {
        this.nextItem = nextItem;
    }
}
