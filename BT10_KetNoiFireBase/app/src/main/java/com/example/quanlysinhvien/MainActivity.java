package com.example.quanlysinhvien;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.example.quanlysinhvien.adapter.SinhVienAdapter;
import com.example.quanlysinhvien.model.SinhVien;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView lvSinhVien = findViewById(R.id.lvSinhVien);



        ArrayList<SinhVien> sinhVienArrayList = new ArrayList<>();
        sinhVienArrayList.add(new SinhVien("1","123","Trần Kim Vũ","kimvu@gmail.com"));
        sinhVienArrayList.add(new SinhVien("2","124","Lê Hoàng Anh Tuấn","TuanLee@gmail.com"));

        SinhVienAdapter adapter = new SinhVienAdapter(this, R.layout.custom_listview_item, sinhVienArrayList);

        lvSinhVien.setAdapter(adapter);


    }

    private void GetData(){
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference("DbSinhVien");
        myRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                adapter.clear();

                for(DataSnapshot data : snapshot.getChildren()){
                    SinhVien sinhVien = data.getValue(SinhVien.class);
                    sinhVien.setId(data.getKey());
                    adapter.add(sinhVien);
                    Log.d("TAG", "onDataChange: " + sinhVien.getHoTen());
                }
                Toast.makeText(getApplicationContext(),"Load data success",Toast.LENGTH_LONG).show();
            }



            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Toast.makeText(getApplicationContext(),"Load data falsed" + error.toString(),Toast.LENGTH_LONG).show();
                Log.d("TAG", "onCancelled: ");
            }
        });
    }
}