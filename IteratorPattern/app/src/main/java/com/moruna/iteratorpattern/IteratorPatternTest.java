package com.moruna.iteratorpattern;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;

public class IteratorPatternTest extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iterator_pattern_test);

        Aggregate aggregate = new ConcreteAggregate();
        aggregate.add("one");
        aggregate.add("two");
        aggregate.add("three");
        Iterator iterator = aggregate.iterator();
        while (iterator.hasNext()) {
            Log.d("IteratorPattern", " iterator.next()="
                    + iterator.next());
        }
    }
}
