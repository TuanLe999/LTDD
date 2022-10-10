package com.example.apptonghop;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ListFriendActivity extends AppCompatActivity {
    ArrayList<User> listUser; //Mảng dữ liệu sản phẩm
    ProductListViewAdapter2 productListViewAdapter2;
    ListView listViewUser;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_friend);

        listUser = new ArrayList<>();
        listUser.add(new User(1,R.drawable.ggpixel4, "Google Pixel 4", 1500));
        listUser.add(new User(2,R.drawable.iphone7, "Iphone 7", 700));
        listUser.add(new User(3,R.drawable.iphone14, "Sony Abc", 2800));
        listUser.add(new User(4,R.drawable.xiaomi, "Samsung XYZ", 900));


        productListViewAdapter2 = new ProductListViewAdapter2(listUser);

        listViewUser = findViewById(R.id.listViewUser);
        listViewUser.setAdapter(productListViewAdapter2);



    }
}