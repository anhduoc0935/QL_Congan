package com.example.login;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class ConganAdapter extends BaseAdapter {

    private Context context;
    private int layout;
    private List<Congan> conganList;

    public ConganAdapter(Context context, int layout, List<Congan> conganList) {
        this.context = context;
        this.layout = layout;
        this.conganList = conganList;
    }

    @Override
    public int getCount() {
        return conganList.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater inflater= (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        view=inflater.inflate(layout,null);


        TextView txtTen =(TextView) view.findViewById(R.id.textviewten);
        TextView txtCapbac =(TextView) view.findViewById(R.id.textviewcapbac);
        TextView txtCongtac =(TextView) view.findViewById(R.id.textviewcongtac);
        TextView txtQuocgia =(TextView) view.findViewById(R.id.textviewquocgia);
        ImageView imgHinh= (ImageView) view.findViewById(R.id.imageviewHinh);

        Congan congan= conganList.get(i);
        txtTen.setText(congan.getTen());
        txtCapbac.setText(congan.getCapBac());
        txtCongtac.setText(congan.getNoiCongTac());
        txtQuocgia.setText(congan.getQuocGia());
        imgHinh.setImageResource(congan.getHinh());
        return view ;
    }
}
