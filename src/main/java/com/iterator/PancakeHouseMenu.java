package com.iterator;

import java.util.ArrayList;
/**
 * @author cuiliu
 */
public class PancakeHouseMenu {
    ArrayList<MenuItem> menuItems;
    public PancakeHouseMenu(){
        menuItems = new ArrayList<MenuItem>();
        addItem("Regular Pancake Breakfast", "Pancakes with fired eggs, sausage", false, 2.99);
        addItem("Blueberry Pancakes", "Pancakes made with fresh blueberries", true, 3.49);
        addItem("Waffles", "Waffles, with your choice of blue of blueberries or strawberries", true, 3.59);
    }

    private void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.add(menuItem);

    }

    @Deprecated
    public ArrayList<MenuItem> getMenuItems() {
        return menuItems;
    }
    public Iterator createIterator(){
        return new PancakeHouseMenuIterator(menuItems);
    }

}
