package com.moruna.abstractfactorypattern;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.moruna.abstractfactorypattern.AbstractFactory.ChildFactory;
import com.moruna.abstractfactorypattern.AbstractFactory.IFactory;
import com.moruna.abstractfactorypattern.AbstractFactory.MenFactory;

public class AbstractFactoryPatternTest extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abstract_factory_pattern_test);

        IFactory factory = new ChildFactory();
        factory.createToy().getName();
        factory.createCloth().getName();

        factory = new MenFactory();
        factory.createToy().getName();
        factory.createCloth().getName();
    }
}
