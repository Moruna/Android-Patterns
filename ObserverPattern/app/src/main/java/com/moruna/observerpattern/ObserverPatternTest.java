package com.moruna.observerpattern;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class ObserverPatternTest extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_observer_pattern_test);
        ConcreteSubject.getInstance()
                .addObserver(new ConcreteObserverA());
        ConcreteSubject.getInstance()
                .addObserver(new ConcreteObserverB());
        ConcreteSubject.getInstance().doSomething();
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        ConcreteSubject.getInstance()
                .deleteObserver(new ConcreteObserverA());
        ConcreteSubject.getInstance()
                .deleteObserver(new ConcreteObserverB());
    }
}
