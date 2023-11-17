package designPatterns.strategy;

public class FirstGuestDiscountStrategy implements DisCountStrategy{

    @Override
    public int getDiscountPrice(Item item) {
        return (int) (item.getPrice() * 0.9);
    }
}
