package com.example.owner.a4week;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button btn;
    private EditText editname, editage;
    private Intent intent;
    private static final int code = 101;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = (Button)findViewById(R.id.btn1);
        editname = (EditText)findViewById(R.id.edname);
        editage = (EditText)findViewById(R.id.edage);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("name", editname.getText().toString());
                intent.putExtra("age", editage.getText().toString());
                startActivityForResult(intent, 101);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        switch (requestCode){
            case code:
                if(resultCode == RESULT_OK){
                    Toast.makeText(getApplicationContext(), data.getStringExtra("send"),Toast.LENGTH_LONG).show();
                }
                break;
        }
    }
}
