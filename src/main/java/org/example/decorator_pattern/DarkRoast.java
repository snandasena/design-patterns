package org.example.decorator_pattern;

public class DarkRoast extends Beverage {

    public DarkRoast() {
        description = "Dark roast Coffee";
    }

    @Override
    public double cost() {
        return .99;
    }
}
