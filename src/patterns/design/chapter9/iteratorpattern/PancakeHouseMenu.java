package patterns.design.chapter9.iteratorpattern;

import java.util.ArrayList;

/**
 * Created by Scott on 9/20/2015.
 */
public class PancakeHouseMenu {
    ArrayList<MenuItem> menuItems;

    public PancakeHouseMenu() {
        menuItems = new ArrayList<>();

        addItem("K&B's Pancake Breakfast","Pancakes with scrambled eggs, and toast", true, 2.99);

        addItem("Regular Pancake Breakfast","Pancake with fried eggs, sausage",false,3.99);

        addItem("Blueberry Pancake Breakfast","Pancakes made with fresh blueberries",true,3.49);

        addItem("Waffles","Waffles, with choice of fruit",true,3.59);
    }

    public void addItem(String name, String description, boolean isVeg, double price){
        MenuItem item = new MenuItem(name,description,isVeg,price);
        menuItems.add(item);
    }

    public ArrayList<MenuItem> getMenuItems() {
        return menuItems;
    }
}
