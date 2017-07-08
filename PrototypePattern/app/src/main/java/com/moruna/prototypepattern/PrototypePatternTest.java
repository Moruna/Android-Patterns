package com.moruna.prototypepattern;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class PrototypePatternTest extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prototype_pattern);
        ConcretePrototype prototype = new ConcretePrototype();
        for (int i = 0; i < 5; i++) {
            ConcretePrototype clonePrototype =
                    (ConcretePrototype) prototype.clone();
            clonePrototype.show();
        }
    }
}
