package com.moruna.mediatorpattern;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MediatorPatternTest extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mediator_pattern_test);

        Colleague A = new ConcreteColleagueA();
        Colleague B = new ConcreteColleagueB();
        Mediator mediator = new ConcreteMediator(A, B);

        A.setNum(200,mediator);
        Log.d("MediatorPatter","A="+A.getNum());
        Log.d("MediatorPatter","AaffectB="+B.getNum());

        B.setNum(10,mediator);
        Log.d("MediatorPatter","B="+B.getNum());
        Log.d("MediatorPatter","BaffectA="+A.getNum());
    }
}
