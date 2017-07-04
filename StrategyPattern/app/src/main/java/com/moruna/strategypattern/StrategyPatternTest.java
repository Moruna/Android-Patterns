package com.moruna.strategypattern;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class StrategyPatternTest extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_strategy_pattern_test);
        Dog dog = new Dog();
        dog.run();

        dog.setStrategy(new StrategyA());
        dog.run();

        dog.setStrategy(new StrategyB());
        dog.run();
    }
}
