package com.example.fgs.designpattern;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.fgs.designpattern.Adapter.ServerOne;
import com.example.fgs.designpattern.Adapter.SeverThree;
import com.example.fgs.designpattern.Adapter.SeverTwo;
import com.example.fgs.designpattern.Adapter.XMLBuilder;
import com.example.fgs.designpattern.Decorator.Equipment.ArmEquip;
import com.example.fgs.designpattern.Decorator.Equipment.ShoeEquip;
import com.example.fgs.designpattern.Decorator.Gam.BlueGemDecorator;
import com.example.fgs.designpattern.Decorator.Gam.RedGemDecorator;
import com.example.fgs.designpattern.Decorator.Gam.YellowGemDecorator;
import com.example.fgs.designpattern.Decorator.XEquip;
import com.example.fgs.designpattern.Factory.RouJiaMo;
import com.example.fgs.designpattern.Factory.RouJiaMoFactoryStore;
import com.example.fgs.designpattern.Factory.RoujiaMoStore;
import com.example.fgs.designpattern.Factory.SimpleRouJiaMoFactroy;
import com.example.fgs.designpattern.Factory.XianRouJiaMoStore;
import com.example.fgs.designpattern.Observer.Observer1;
import com.example.fgs.designpattern.Observer.SubjectFor3d;
import com.example.fgs.designpattern.Observer.SubjectForSSQ;
import com.example.fgs.designpattern.SingleTon.Singleton;
import com.example.fgs.designpattern.Strategy.Strategy1;
import com.example.fgs.designpattern.Strategy.Strategy2;
import com.example.fgs.designpattern.Strategy.StrategyToastUtil;

public class MainActivity extends AppCompatActivity {
    Button btnSingleton,btnStrategy1,btnStrategy2,btnAdapter,btnObserver,btnDecorator,
            btnFactory;

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

        btnDecorator = (Button)findViewById(R.id.btn_decorator);
        btnDecorator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 一个镶嵌2颗红宝石，1颗蓝宝石的靴子
                System.out.println(" 一个镶嵌2颗红宝石，1颗蓝宝石的靴子");
                XEquip equip = new RedGemDecorator(new RedGemDecorator(new BlueGemDecorator(new ShoeEquip())));
                System.out.println("攻击力  : " + equip.caculateAttack());
                System.out.println("描述 :" + equip.description());
                System.out.println("-------");
                // 一个镶嵌1颗红宝石，1颗蓝宝石的武器
                System.out.println(" 一个镶嵌1颗红宝石，1颗蓝宝石,1颗黄宝石的武器");
                equip = new RedGemDecorator(new BlueGemDecorator(new YellowGemDecorator(new ArmEquip())));
                System.out.println("攻击力  : " + equip.caculateAttack());
                System.out.println("描述 :" + equip.description());
                System.out.println("-------");
            }
        });

        btnFactory = (Button)findViewById(R.id.btn_factory);
        btnFactory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //正常逻辑
                RoujiaMoStore store = new RoujiaMoStore();
                store.sellRouJiaMo("Suan");
                //简单工厂
                SimpleRouJiaMoFactroy factroy = new SimpleRouJiaMoFactroy();
                RouJiaMoFactoryStore factoryStore = new RouJiaMoFactoryStore(factroy);
                factoryStore.sellRouJiaMo("La");

                //抽象工厂
                RoujiaMoStore roujiaMoStore = new XianRouJiaMoStore();
                RouJiaMo suanRoujiaMo = roujiaMoStore.sellRouJiaMo("Suan");
                System.out.println(suanRoujiaMo.name);
            }
        });
    }
}
