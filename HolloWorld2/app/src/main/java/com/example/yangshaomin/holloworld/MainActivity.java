package com.example.yangshaomin.holloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button myButn_1;


    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState){


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //通过findViewById()初始化控件
        myButn_1 =(Button) findViewById(R.id.btn_1 );
        //匿名类部类方法实现按钮2的点击事件
        myButn_1 .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myButn_1 .setText("登陆按钮被点击");
            }

            });
            {


        }

    }
}
