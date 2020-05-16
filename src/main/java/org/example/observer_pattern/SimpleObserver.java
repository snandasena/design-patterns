package org.example.observer_pattern;

public class SimpleObserver implements Observer {
    private int value;
    private Subject simpleSubject;

    public SimpleObserver(Subject subject) {
        this.simpleSubject = subject;
        simpleSubject.registerObserver(this);
    }

    @Override
    public void update(int value) {
        this.value = value;
        display();
    }

    public void display() {
        System.out.println("Value: " + value);
    }
}
