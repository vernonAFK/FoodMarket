package model;

import java.util.Objects;

import static model.constants.Color.COLOR_RED;
import static model.constants.Discount.DISCOUNT_FOR_ALL;
import static model.constants.Discount.DISCOUNT_FOR_RED_APPLE;

public class Apple extends Food {
    private final String color;

    public Apple(Integer amount, Double price, String color) {
        super(amount, price, true);
        this.color = color;
    }

    @Override
    public Double getDiscount() {
        return Objects.equals(color, COLOR_RED) ?
                DISCOUNT_FOR_RED_APPLE : DISCOUNT_FOR_ALL;
    }
}
