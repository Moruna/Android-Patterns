package com.moruna.visitorpattern;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.List;

public class VisitorPatternTest extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_visitor_pattern_test);
        List<Element> list = ObjectGenerator.getList();
        for(Element e: list){
            e.accept(new ConcreteVisitor());
        }
    }
}
