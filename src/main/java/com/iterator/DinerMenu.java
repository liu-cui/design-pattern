package com.iterator;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class DinerMenu {
    static final int MAX_ITEMS = 6;
    int numberOfItems = 0;
    MenuItem[] menuItems;
    public DinerMenu(){
        menuItems = new MenuItem[MAX_ITEMS];
        addItem("Vegetarian BLT", "(Fakin') Bacon with lettuce & tomato on whole wheat", true, 2.99);
        addItem("Soup of the day","Soup of the day, with a side of potato salad", false, 2.99);
        addItem("Hotdog", "A hot dog, with saurkraut, relish, onions, topped with cheess", false, 3.05);
    }

    private void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        if(numberOfItems >= MAX_ITEMS){
            log.info("Sorry, menu is full! Can't add item to menu");
        }else{
            menuItems[numberOfItems] = menuItem;
            numberOfItems += 1;
        }
    }
    @Deprecated
    public MenuItem[] getMenuItems() {
        return menuItems;
    }

    public Iterator createIterator(){
        return new DinnerMenuIterator(menuItems);
    }
}
