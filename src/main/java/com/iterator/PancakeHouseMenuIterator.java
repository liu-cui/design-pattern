package com.iterator;

import java.awt.*;
import java.util.ArrayList;

/**
 * @author cuiliu
 */
public class PancakeHouseMenuIterator implements Iterator{
    ArrayList<MenuItem> menuItems;
    int position = 0;

    public PancakeHouseMenuIterator(ArrayList<MenuItem> menuItems){
        this.menuItems = menuItems;
    }
    @Override
    public boolean hasNext() {
        return position < menuItems.size() && menuItems.get(position) != null;
    }

    @Override
    public Object next() {
        MenuItem menuItem = menuItems.get(position);
        position += 1;
        return menuItem;
    }
}
