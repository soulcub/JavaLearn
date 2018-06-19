package com.company.w8.Shopping;

import java.util.ArrayList;

public class GroceryStore implements IShop {
    ArrayList<Item> listItems = new ArrayList<>();

    public GroceryStore(Item item) {
        listItems.add(item);
    }

    @Override
    public void addItem(Item item) {
        listItems.add(item);
    }

    @Override
    public void printItemsOfShop() {
        for (Item itemsOfShop : listItems) {
            System.out.println(itemsOfShop.toString());
        }
    }

    @Override
    public void getName() {
        for (Item nameOfItem : listItems) {
            nameOfItem.getName();
        }
    }

    @Override
    public void removeItem(int indexOfItem) {
        listItems.remove(indexOfItem);
    }

    @Override
    public boolean checkIfItemInStore(Item checkItemToBuy) {
        boolean itemPresentInSohop = false;
        for (Item itemFromShop : listItems) {
            if (itemFromShop.compareTo(checkItemToBuy) == 0) itemPresentInSohop = true;
            else itemPresentInSohop = false;
        }
        return itemPresentInSohop;
    }
}
