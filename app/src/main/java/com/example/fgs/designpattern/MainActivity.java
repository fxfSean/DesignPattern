package com.example.fgs.designpattern;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.fgs.designpattern.Adapter.ServerOne;
import com.example.fgs.designpattern.Adapter.SeverThree;
import com.example.fgs.designpattern.Adapter.SeverTwo;
import com.example.fgs.designpattern.Adapter.XMLBuilder;
import com.example.fgs.designpattern.Observer.Observer1;
import com.example.fgs.designpattern.Observer.SubjectFor3d;
import com.example.fgs.designpattern.Observer.SubjectForSSQ;
import com.example.fgs.designpattern.SingleTon.Singleton;
import com.example.fgs.designpattern.Strategy.Strategy1;
import com.example.fgs.designpattern.Strategy.Strategy2;
import com.example.fgs.designpattern.Strategy.StrategyToastUtil;

public class MainActivity extends AppCompatActivity {
    Button btnSingleton,btnStrategy1,btnStrategy2,btnAdapter,btnObserver;

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnSingleton = (Button)findViewById(R.id.btn_singleton);
        btnSingleton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Singleton singleton = Singleton.getInstance();
                singleton.ShowToast(MainActivity.this);
            }
        });
        btnStrategy1 = (Button)findViewById(R.id.btn_strategy1);
        btnStrategy1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StrategyToastUtil strategyToastUtil = new StrategyToastUtil();
                strategyToastUtil.ToastStrategy(MainActivity.this,"Strategy1",new Strategy1());
            }
        });

        btnStrategy2 = (Button)findViewById(R.id.btn_strategy2);
        btnStrategy2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StrategyToastUtil strategyToastUtil = new StrategyToastUtil();
                strategyToastUtil.ToastStrategy(MainActivity.this,"Strategy2",new Strategy2());
            }
        });

        btnAdapter = (Button)findViewById(R.id.btn_adapter);
        btnAdapter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                XMLBuilder.buildXML(new ServerOne());
                XMLBuilder.buildXML(new SeverTwo());
                XMLBuilder.buildXML(new SeverThree());
            }
        });
        btnObserver = (Button)findViewById(R.id.btn_observer);
        btnObserver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SubjectFor3d subjectFor3d = new SubjectFor3d();
                SubjectForSSQ subjectForSSQ = new SubjectForSSQ();
                Observer1 observer1 = new Observer1();
                observer1.registerSubject(subjectFor3d);
                observer1.registerSubject(subjectForSSQ);
                subjectFor3d.setMsg("hello SubjectFor3d's msg comming");
                subjectForSSQ.setMsg("hi SubjectforSSQ's msg here are");
            }
        });
    }
}
