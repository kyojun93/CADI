package com.example.owner.a6week;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {
    private ArrayList<Student> stuList;
    private StudentAdapter stuAdapter;
    private ListView StudentView;
    private Button btn1;
    private TextView text1;
    private TextView text2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1 =(Button)findViewById(R.id.btn1);
        text1 = (TextView)findViewById(R.id.edName);
        text2 = (TextView)findViewById(R.id.edAge);
        StudentView = (ListView) findViewById(R.id.StudentView);

        stuList = new ArrayList<>();
        stuList.add(new Student("함성호","12학번"));
        stuList.add(new Student("김우영","11학번"));
        stuList.add(new Student("박종민","12학번"));
        stuList.add(new Student("한채연","16학번"));
        stuList.add(new Student("정예진","13학번"));
        stuList.add(new Student("정성일","12학번"));
        stuList.add(new Student("오지헌","11학번"));
        stuList.add(new Student("서명윤","14학번"));
        stuList.add(new Student("노현영","14학번"));
        stuList.add(new Student("김나경","16학번"));



        stuAdapter = new StudentAdapter(stuList, MainActivity.this);

        StudentView.setAdapter(stuAdapter);

    }
}
