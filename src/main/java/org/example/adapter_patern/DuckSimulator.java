package org.example.adapter_patern;

public class DuckSimulator {

    static void testDuck(Duck duck) {
        duck.fly();
        duck.quack();
    }

    public static void main(String[] args) {
        // test a duck
        Duck duck = new MallardDuck();
        testDuck(duck);

        Turkey turkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(turkey);
        testDuck(turkeyAdapter);
    }
}
