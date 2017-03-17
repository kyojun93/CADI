package com.example.owner.a6week;

import android.widget.BaseAdapter;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import java.util.ArrayList;

public class StudentAdapter extends BaseAdapter {
    private ArrayList<Student> StuList;
    private Context context;
    private ListView sList;
    private Button btn1;
    private TextView text1;
    private TextView text2;
    int position;

    public StudentAdapter(ArrayList<Student> stuList, Context context) {
        this.StuList = stuList;
        this.context = context;
    }

    @Override
    public int getCount() {

        return StuList.size();
    }

    @Override
    public Object getItem(int position) {

        return StuList.get(position);
    }

    @Override
    public long getItemId(int position) {

        return position;
    }


    private void selectButton(Button btn1, int position) {
        btn1.setOnClickListener(new btnListener(position));
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View itemView = LayoutInflater.from(context).inflate(R.layout.activity_student_adapter, parent, false);
        sList = (ListView) itemView.findViewById(R.id.StudentView);
        btn1 = (Button) itemView.findViewById(R.id.btn1);
        text1 = (TextView) itemView.findViewById(R.id.edName);
        text2 = (TextView) itemView.findViewById(R.id.edAge);
        this.position = position;
        fillViews(sList, position);
        return itemView;
    }
    private void fillViews(ListView sList, int position) {
        text1.setText(StuList.get(position).getStudentname());
        text2.setText(StuList.get(position).getStudentage());
        selectButton(btn1, position);
    }


    private class btnListener implements View.OnClickListener {
        int position;
        public btnListener(int position) {
            this.position = position;
        }
        @Override
        public void onClick(View v) {
            Toast.makeText(context, StuList.get(position).getStudentname() + " / " + StuList.get(position).getStudentage() , Toast.LENGTH_LONG).show();
        }
    }
}
