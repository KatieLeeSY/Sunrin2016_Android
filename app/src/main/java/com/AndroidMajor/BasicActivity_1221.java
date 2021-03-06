package com.AndroidMajor;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by XNOTE on 2016-12-28.
 */

public class BasicActivity_1221 extends AppCompatActivity {
    private EditText edit;
    private TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basic_1221);

        edit = (EditText) findViewById(R.id.edit_1221);
        text = (TextView) findViewById(R.id.text_count);
        findViewById(R.id.btn_count).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("me", "count!");
                text.setText(edit.getText().toString().length() + "글자");
            }
        });
        findViewById(R.id.btn_clear).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edit.setText("");
            }
        });

        edit.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                text.setText(s.toString().length() + "글자");
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }
}