package designPatterns.strategy;

public class NonFreshItemDiscountStrategy implements DisCountStrategy{

    @Override
    public int getDiscountPrice(Item item) {
        return (int) (item.getPrice() * 0.8);
    }
}
