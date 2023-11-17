package designPatterns.strategy;

public class Item {

    private boolean fresh;

    public int getPrice() {
        return 0;
    }

    public boolean isFresh() {
        return fresh;
    }

    public void setFresh(boolean fresh) {
        this.fresh = fresh;
    }
}
