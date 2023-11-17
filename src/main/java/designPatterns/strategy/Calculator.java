package designPatterns.strategy;

import java.util.List;

public class Calculator {

    private DisCountStrategy disCountStrategy;

    public Calculator(DisCountStrategy disCountStrategy) {
        this.disCountStrategy = disCountStrategy;
    }

    public int calculate(boolean firstGuest, List<Item> items) {
        int sum = 0;

        for(Item item : items) {
            sum += disCountStrategy.getDiscountPrice(item);
        }

        /*
        for (Item item : items) {
            if(firstGuest)
                sum += (int) (item.getPrice() * 0.9); // 첫 손님 10% 할인
            else if(! item.isFresh())
                sum += (int) (item.getPrice() * 0.8); // 덜 신선한 것 20% 할인
            else
                sum += item.getPrice();
        }
         */
        return sum;
    }
}
