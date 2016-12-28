package com.AndroidMajor;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by XNOTE on 2016-12-28.
 */

public class BasicActivity_Edit extends AppCompatActivity {
    EditText editText;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basic_edit);
        editText = (EditText)findViewById(R.id.editText);
        textView = (TextView)findViewById(R.id.TextView);
        Button button = (Button)findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                textView.setText(editText.getText());
            }
        });
    }
}