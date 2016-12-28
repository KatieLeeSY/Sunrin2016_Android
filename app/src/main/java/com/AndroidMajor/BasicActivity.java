package com.AndroidMajor;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by XNOTE on 2016-12-28.
 */

public class BasicActivity extends AppCompatActivity {
    private Button mButtonEdit, mButton1219, mButton1221;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basic);
        mButtonEdit = (Button) findViewById(R.id.btn_edit);
        mButton1219 = (Button) findViewById(R.id.btn_1219);
        mButton1221 = (Button) findViewById(R.id.btn_1221);

        View.OnClickListener onClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (view.getId()) {
                    case R.id.btn_edit:
                        startActivity(new Intent(BasicActivity.this, BasicActivity_Edit.class));
                        break;
                    case R.id.btn_1219:
                        startActivity(new Intent(BasicActivity.this, BasicActivity_1219.class));
                        break;
                    case R.id.btn_1221:
                        startActivity(new Intent(BasicActivity.this, BasicActivity_1221.class));
                        break;
                }
            }
        };
        mButtonEdit.setOnClickListener(onClickListener);
        mButton1219.setOnClickListener(onClickListener);
        mButton1221.setOnClickListener(onClickListener);
    }
}