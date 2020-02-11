package com.example.txtview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
TextView textView1, textView2, textView3,textView4, edittext, button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView1 = findViewById(R.id.textview_one) ;
        textView2 = findViewById(R.id.textview_two);
        textView3 = findViewById(R.id.textview_three);
        textView4 = findViewById(R.id.textview_four);
        edittext = findViewById(R.id.edit_text);
        button = findViewById(R.id.button1);

        textView1.setOnClickListener(this);
        textView2.setOnClickListener(this);
        textView3.setOnClickListener(this);
        textView4.setOnClickListener(this);
        edittext.setOnClickListener(this);
        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.textview_one:
                Toast.makeText(this,"This is first Text", Toast.LENGTH_SHORT).show();
                break;
            case R.id.textview_two:
                Toast.makeText(this, "This is the second text", Toast.LENGTH_SHORT).show();
                break;
            case R.id.textview_three:
                Toast.makeText(this, "This is the third text",Toast.LENGTH_SHORT).show();
                break;
            case R.id.textview_four:
                Toast.makeText(this, "This is the fourth text", Toast.LENGTH_SHORT).show();
                break;
            case R.id.edit_text:
                String name = edittext.getText().toString().trim();
                Toast.makeText(getApplicationContext(), ""+name,Toast.LENGTH_SHORT).show();
                break;

        }
    }
}
