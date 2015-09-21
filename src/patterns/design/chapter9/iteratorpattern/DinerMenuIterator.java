package patterns.design.chapter9.iteratorpattern;

/**
 * We have moved the implementation of the iteration of the array out of the dine class
 * and into its own class that utilizes out iterator interface
 * Created by Scott on 9/20/2015.
 */
public class DinerMenuIterator implements Iterator {

    MenuItem[] items;
    int position = 0;

    public DinerMenuIterator(MenuItem[] items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        if(position >= items.length || items[position] == null){
            return false;
        }else {
            return true;
        }
    }

    @Override
    public Object next() {
        MenuItem item = items[position];
        position++;
        return item;
    }
}
