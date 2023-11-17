package designPatterns.strategy;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private DisCountStrategy strategy;

    @Test
    void 신선한과일가격() {


        Item banana = new Item(3000);
        Item apple  = new Item(1500);

       List<Item> items = new ArrayList<>();

       items.add(banana);
       items.add(apple);

        strategy = new FirstGuestDiscountStrategy();

        Calculator cal = new Calculator(strategy);
        int price = cal.calculate(items);

        int correctPrice = (int) (banana.getPrice() * 0.9 + apple.getPrice() * 0.9);

        assertThat(price).isEqualTo(correctPrice);

    }
}