package com.habib.animalia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    ImageButton btnKucing,btnAnjing, btnBurung;
    public static final String JENIS_GALERI_KEY = "JENIS GALERI";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inisialisasiView();
    }

    private void inisialisasiView() {
        btnKucing = findViewById(R.id.btn_buka_ras_kucing);
        btnAnjing = findViewById(R.id.btn_buka_ras_anjing);
        btnBurung = findViewById(R.id.btn_buka_ras_burung);
        btnKucing.setOnClickListener(view -> bukaGaleri("Kucing"));
        btnAnjing.setOnClickListener(view -> bukaGaleri("Anjing"));
        btnBurung.setOnClickListener(view -> bukaGaleri("Burung"));
    }

    private void bukaGaleri(String jenisHewan) {
        Log.d("MAIN", "Buka activity Kucing");
        Intent intent = new Intent(this, GaleriActivity.class);
        intent.putExtra(JENIS_GALERI_KEY, jenisHewan);
        startActivity(intent);
    }
}