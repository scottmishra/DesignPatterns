package patterns.design.chapter9.iteratorpattern;

import java.util.ArrayList;

/**
 * Created by Scott on 9/20/2015.
 */
public class PancakeHouseMenuIterator implements Iterator {

    ArrayList<MenuItem> menuItems;
    int position = 0;

    public PancakeHouseMenuIterator(ArrayList<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    @Override
    public boolean hasNext() {
        if(position < menuItems.size()){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public Object next() {
        MenuItem item = menuItems.get(position);
        position++;
        return item;
    }
}
