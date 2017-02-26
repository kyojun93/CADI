package com.example.owner.a4week;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    private Intent intent2, intent;
    private String name, age;
    private Button bnt2;
    private ImageView imgV;

    @Override
    public void onBackPressed() {
        intent = new Intent(SecondActivity.this, MainActivity.class);
        intent.putExtra("send", "잘받았습니다");
        setResult(RESULT_OK, intent);
        super.onBackPressed();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        bnt2 = (Button)findViewById(R.id.bnt2);
        intent2 = getIntent();
        name = intent2.getStringExtra("name");
        age = intent2.getStringExtra("age");
        Toast.makeText(SecondActivity.this, name + " / " + age + "입니다.",Toast.LENGTH_LONG).show();
        bnt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                LayoutInflater inflater = (LayoutInflater) getSystemService( Context.LAYOUT_INFLATER_SERVICE );
                LinearLayout linearLayout = (LinearLayout)findViewById(R.id.linear);
                View view2 = inflater.inflate(R.layout.img,null,false);
                linearLayout.addView(view2);
            }
        });

    }
}
