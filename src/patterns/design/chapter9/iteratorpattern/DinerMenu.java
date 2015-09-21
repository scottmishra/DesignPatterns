package patterns.design.chapter9.iteratorpattern;

/**
 * Created by Scott on 9/20/2015.
 */
public class DinerMenu {
    private final int MAX_ITEMS = 6;
    int numberOfItems = 0;
    MenuItem[] menuItems;

    public DinerMenu() {
        menuItems = new MenuItem[MAX_ITEMS];

        addItem("Veggie BLT","Faccon, with lettuce and tomato on whole wheat",true,2.99);

        addItem("BLT","Bacone with lettuce and tomato on whole wheat",false,2.99);

        addItem("Soup of the Day","Soup of the day with a side of potato salad",false,3.29);

        addItem("HotDog","A hot odg, with saurkraut, relish, onions, topped with cheese",false, 3.05);
    }

    public void addItem(String name, String description, boolean isVeg, double price){
        MenuItem item = new MenuItem(name,description,isVeg,price);
        if(numberOfItems < MAX_ITEMS){
            menuItems[numberOfItems] = item;
            numberOfItems++;
        }else{
            System.err.println("Sorry, the menu is full! CAn't add item to menu");
        }
    }

    //Dont want this anymore as it exposes out implementation
//    public MenuItem[] getMenuItems() {
//        return menuItems;
//    }

    //Now the iteration of the menuItems is based inside the DinerMenuIterator class
    //And the base class conforms to a easily expandable iterator pattern
    public Iterator createIterator(){
        return new DinerMenuIterator(menuItems);
    }
}
