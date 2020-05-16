package org.example.adapter_patern;

public class MallardDuck implements Duck {
    @Override
    public void quack() {
        System.out.println("Quack");
    }

    @Override
    public void fly() {
        System.out.println("MallardDuck is flying!!");
    }
}
