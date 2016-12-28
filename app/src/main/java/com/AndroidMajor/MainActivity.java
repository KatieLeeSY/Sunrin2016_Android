package com.AndroidMajor;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button mButtonBasic, mButtonCustom, mButtonDatabase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mButtonBasic = (Button) findViewById(R.id.btn_basic);
        mButtonCustom = (Button) findViewById(R.id.btn_custom);
        mButtonDatabase = (Button) findViewById(R.id.btn_database);

        View.OnClickListener onClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (view.getId()) {
                    case R.id.btn_mission01:
                        startActivity(new Intent(MainActivity.this, BasicActivity.class));
                        break;
                    case R.id.btn_mission02:
                        startActivity(new Intent(MainActivity.this, CustomActivity.class));
                        break;
                    case R.id.btn_mission03:
                        startActivity(new Intent(MainActivity.this, DatabaseActivity.class));
                        break;
                }
            }
        };
        mButtonBasic.setOnClickListener(onClickListener);
        mButtonCustom.setOnClickListener(onClickListener);
        mButtonDatabase.setOnClickListener(onClickListener);
    }
}
