package com.example.apptonghop;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class ProductListViewAdapter2 extends BaseAdapter {


    final ArrayList<User> listProduct;

    ProductListViewAdapter2(ArrayList<User> listProduct) {
        this.listProduct = listProduct;
    }

    @Override
    public int getCount() {

        return listProduct.size();
    }

    @Override
    public Object getItem(int position) {

        return listProduct.get(position);
    }

    @Override
    public long getItemId(int position) {
        //Trả về một ID của phần
        return listProduct.get(position).id;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View viewProduct;
        if (convertView == null) {
            viewProduct = View.inflate(parent.getContext(), R.layout.product_view2, null);
        } else viewProduct = convertView;


        //Bind sữ liệu phần tử vào View
        User user = (User) getItem(position);
        ((CircleImageView) viewProduct.findViewById(R.id.imgUser)).setBackgroundResource(Integer.parseInt(String.format("%d",user.img)));
        ((TextView) viewProduct.findViewById(R.id.userName)).setText(String.format("ID = %d", user.name));
        ((TextView) viewProduct.findViewById(R.id.follower)).setText(String.format("Tên SP : %d", user.follower));

        return viewProduct;
    }
}
