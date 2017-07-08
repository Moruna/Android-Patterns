package com.moruna.builderpattern;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class BuilderPatternTest extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_builder_pattern_test);
        Director director = new Director();
        Product productA = director.getProductA();
        productA.showProduct();

        Product productB = director.getProductB();
        productB.showProduct();
    }
}
