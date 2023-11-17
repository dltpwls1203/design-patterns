package designPatterns.strategy;

public class Item {

    private final int price;
    private boolean fresh;
    
    public Item(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public boolean isFresh() {
        return fresh;
    }

    public void setFresh(boolean fresh) {
        this.fresh = fresh;
    }
}
