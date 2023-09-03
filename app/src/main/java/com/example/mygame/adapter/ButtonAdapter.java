package com.example.mygame.adapter;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.mygame.R;
import com.example.mygame.model.ButtonModel;

import java.util.ArrayList;
import java.util.List;

public class ButtonAdapter extends BaseAdapter {
    private Context context;
    private int layout;
    private ArrayList<ButtonModel> buttonList;

    public ButtonAdapter(Context context, int layout, ArrayList<ButtonModel> buttonList) {
        this.context = context;
        this.layout = layout;
        this.buttonList = buttonList;
    }

    @Override
    public int getCount() {
        return buttonList.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    private class ViewHolder {
        Button button;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder holder;

        if(view == null) {
            holder = new ViewHolder();
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(layout, null);
            holder.button = (Button) view.findViewById(R.id.btnItem);
            view.setTag(holder);
        } else {
            holder = (ViewHolder) view.getTag();
        }

        ButtonModel buttonModel = buttonList.get(i);
        holder.button.setText(buttonModel.getBtnText());

        return view;
    }
}
