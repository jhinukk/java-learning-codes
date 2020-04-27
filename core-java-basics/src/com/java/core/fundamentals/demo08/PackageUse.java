package com.java.core.fundamentals.demo08;

import com.java.core.fundamentals.demo01.*;

class PackageUse{
    public static void main(String[] args) {
        GroceryItem groceryItem = new GroceryItem(12,45,88);
        System.out.println(groceryItem.totalItems());
    }
}
