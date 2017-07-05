package com.moruna.factorypattern;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.moruna.factorypattern.mutiFactory.ChildToyCreator;
import com.moruna.factorypattern.mutiFactory.IToyCreator;
import com.moruna.factorypattern.mutiFactory.MenToyCreator;

public class FactoryPatternTest extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_factory_pattern_test);

        //多个工厂角色
        IToyCreator toyCreator = new ChildToyCreator();
        toyCreator.createToy();

        toyCreator = new MenToyCreator();
        toyCreator.createToy();

        //单个工厂角色，通过参数返回不同的产品对象
//        IToyCreator toyCreator = new ConcreteToyCreator();
//        toyCreator.createToy(ChildToy.class);
//        toyCreator.createToy(MenToy.class);

    }

}
