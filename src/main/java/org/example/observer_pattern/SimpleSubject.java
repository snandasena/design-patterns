package org.example.observer_pattern;

import java.util.ArrayList;

public class SimpleSubject implements Subject {
    private ArrayList<Observer> observers;
    private int value = 0;

    public SimpleSubject() {
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(value);
        }
    }

    public void setValue(int value) {
        this.value = value;
        notifyObservers();
    }
}
