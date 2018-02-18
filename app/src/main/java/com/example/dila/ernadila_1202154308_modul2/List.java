package com.example.dila.ernadila_1202154308_modul2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

import java.util.ArrayList;

public class List extends AppCompatActivity {

    private RecyclerView rvView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;
    private ArrayList<String> dataMenu;
    private ArrayList<String> dataHarga;
    private ArrayList<Integer> gambar;
    private TextView a,b;

    //Daftar Menu Makanan
    private String[] Judul = {"Batagor", "Siomay","Karedok","Mendoan","Surabi","Tahu Gejrot",
            "Cireng Rujak","Cuanki Bandung","Sate Ayam","Mie Kocok Bandung"};
    //Daftar Harga
    private String[] test = {"Rp. 15.000", "Rp. 15.000","Rp. 20.000","Rp. 7.000","Rp. 5.000","Rp. 6.000","Rp. 15.000","Rp. 20.000",
            "Rp. 25.000","Rp. 25.000"};
    //Daftar Gambar
    private int[] Gambar = {R.drawable.batagor, R.drawable.siomay,R.drawable.karedok,R.drawable.mendoan,R.drawable.surabi,
            R.drawable.tahu,R.drawable.cireng,R.drawable.cuanki,R.drawable.sate,R.drawable.mie};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        //mendeklarasikan array list untuk menu, harga dan gambar
        dataMenu = new ArrayList<>();
        dataHarga = new ArrayList<>();
        gambar = new ArrayList<>();
        DaftarItem();

//        iniDataMenu();
//        iniDataHarga();
//        initgambar();

        rvView = (RecyclerView) findViewById(R.id.recyclerview);
        rvView.setHasFixedSize(true);

        /**
         * Kita menggunakan LinearLayoutManager untuk list standar
         * yang hanya berisi daftar item
         * disusun dari atas ke bawah
         */
        layoutManager = new LinearLayoutManager(this);
        rvView.setLayoutManager(layoutManager);

        adapter = new ListAdapterView(dataMenu,dataHarga,gambar);
        rvView.setAdapter(adapter);
    }
    private void DaftarItem(){
        for (int w=0; w<Judul.length; w++){
            dataMenu.add(Judul[w]);
            dataHarga.add(test[w]);
            gambar.add(Gambar[w]);
        }
    }
}
