package org.example.programming.to.an.it_n_face;

public class MallardDuck extends Duck {

    public MallardDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    void display() {
        System.out.println("I'm a real Mallard duck");
    }
}
