package com.AndroidMajor;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by XNOTE on 2016-12-28.
 */

public class BasicActivity_1219 extends AppCompatActivity {
    EditText et1, et2, et3;
    Button btn;

    //    private ListView listView;
    //    private String[] ITEMS = {"크리스마스","커플","와우"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basic_1219);
        et1 = (EditText) findViewById(R.id.year);
        et2 = (EditText) findViewById(R.id.month);
        et3 = (EditText) findViewById(R.id.day);
        btn = (Button) findViewById(R.id.btn);
        btn.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View view) {
//                Intent intent = new Intent(Mission01Activity.this, SubActivity.class);
//                intent.putExtra("year",year.getText().toString());
//                intent.putExtra("month",month.getText().toString());
//                intent.putExtra("day",day.getText().toString());
                //String year = getIntent().getStringExtra("year");
                Integer year = Integer.valueOf(et1.getText().toString());
                Integer month = Integer.valueOf(et2.getText().toString());
                Integer day = Integer.valueOf(et3.getText().toString());
                if (month <= 0 || month >= 13 || day <= 0 || day >= 32) {
                    Toast.makeText(BasicActivity_1219.this, "오류 발생", Toast.LENGTH_SHORT).show();
                } else {
                    Intent intent = new Intent(BasicActivity_1219.this, BasicActivity_1219_sub.class);

                    intent.putExtra("year", year);
                    intent.putExtra("month", month);
                    intent.putExtra("day", day);

                    startActivity(intent);
                }
            }
        });
//        listView = (ListView)findViewById(R.id.listview);
//        ArrayAdapter adapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1,ITEMS);
//        listView.setAdapter(adapter);
    }
}