package com.example.anvat;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.bumptech.glide.Glide;
import com.example.anvat.Model.MonAn;

public class ChiTiet extends AppCompatActivity {
    Toolbar toolbarchitiet;
    ImageView img_chitiet;
    TextView text_ten_chitiet, text_gia_chitiet, text_chitiet;
    Spinner spinner;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chitiet);
        Anhxa();
        ActionToolBar();
        GetChitiet();
        CatchEventSpinner();
    }
    private void Anhxa() {
        toolbarchitiet = (Toolbar) findViewById(R.id.toolbarchitiet);
        img_chitiet = (ImageView) findViewById(R.id.img_chitiet);
        text_ten_chitiet = (TextView) findViewById(R.id.text_ten_chitet);
        text_gia_chitiet = (TextView) findViewById(R.id.text_gia_chitiet);
        text_chitiet = (TextView) findViewById(R.id.text_mota_chitiet);
        spinner = (Spinner) findViewById(R.id.spinner);
        button = (Button) this.<View>findViewById(R.id.btn_themgiohang);
    }
    private void ActionToolBar() {
        setSupportActionBar(toolbarchitiet);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        toolbarchitiet.setNavigationOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
    private void GetChitiet() {
        String id = "";
        String TenChiTiet = "";
        String Gia = "";
        String HinhAnhChiTiet = "";
        String MoTaChiTiet = "";
        String idloaimonan = "";
        MonAn monAn = (MonAn) getIntent().getSerializableExtra("thongtinsanpham");
        id = monAn.getIdmonan();
        TenChiTiet = monAn.getTenmonan();
        Gia = monAn.getGiamonan();
        HinhAnhChiTiet = monAn.getHinhanhmonan();
        MoTaChiTiet = monAn.getMota();
        idloaimonan = monAn.getIdloaimonan();
        text_ten_chitiet.setText(TenChiTiet);
        text_gia_chitiet.setText(Gia);
        text_chitiet.setText("Giá: " + MoTaChiTiet + "Đồng");

    }
    private void CatchEventSpinner() {
        Integer[] soluong = new Integer[]{1,2,3,4,5,6,7,8,9,10};
        ArrayAdapter<Integer> arrayAdapter = new ArrayAdapter<Integer>(this,android.R.layout.simple_spinner_dropdown_item,soluong);
        spinner.setAdapter(arrayAdapter);
    }
}
