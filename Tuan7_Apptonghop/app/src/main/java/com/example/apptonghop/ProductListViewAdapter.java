package com.example.apptonghop;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class ProductListViewAdapter extends BaseAdapter {


    final ArrayList<Product> listProduct;

    ProductListViewAdapter(ArrayList<Product> listProduct) {
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
            viewProduct = View.inflate(parent.getContext(), R.layout.product_view, null);
        } else viewProduct = convertView;


        //Bind sữ liệu phần tử vào View
        Product product = (Product) getItem(position);
        ((CircleImageView) viewProduct.findViewById(R.id.imgProduct)).setBackgroundResource(Integer.parseInt(String.format("%d",product.img)));
        ((TextView) viewProduct.findViewById(R.id.nameproduct)).setText(String.format("%s", product.name));
        ((TextView) viewProduct.findViewById(R.id.priceproduct)).setText(String.format("%d người theo dõi", product.follower));


        return viewProduct;
    }
}
