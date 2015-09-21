package patterns.design.chapter9.iteratorpattern;

/**
 * Created by Scott on 9/20/2015.
 */
public class MenuItem {
    private String name;
    private String description;
    private boolean isVeggie;
    private double price;

    public MenuItem(String name, String description, boolean isVeggie, double price) {
        this.name = name;
        this.description = description;
        this.isVeggie = isVeggie;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public boolean isVeggie() {
        return isVeggie;
    }

    public double getPrice() {
        return price;
    }
}
