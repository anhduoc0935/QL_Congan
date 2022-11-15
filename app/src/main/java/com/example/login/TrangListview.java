package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class TrangListview extends AppCompatActivity {
    ListView lvsach;
    ArrayList<Congan> conganArrayList;
    ConganAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        AnhXa();
        adapter =new ConganAdapter(this, R.layout.dong_congan, conganArrayList);
        lvsach.setAdapter(adapter);
    }

    private void AnhXa() {
        lvsach =(ListView) findViewById(R.id.list_view);
        conganArrayList =new ArrayList<>();

        conganArrayList.add(new Congan("Nguyen Van A","Thieu ta","Da Nang","Viet Nam",R.drawable.biasach));
        conganArrayList.add(new Congan("Nguyen Van B","Trung tuong","Hue","Viet Nam",R.drawable.biasach));
        conganArrayList.add(new Congan("Nguyen Van C","Dai ta","Ha Noi","Viet Nam",R.drawable.biasach));
        conganArrayList.add(new Congan("Nguyen Van D","Thieu uy","Ho Chi Minh","Viet Nam",R.drawable.biasach));
    }

}