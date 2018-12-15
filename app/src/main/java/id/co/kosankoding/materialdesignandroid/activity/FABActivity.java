package id.co.kosankoding.materialdesignandroid.activity;

import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import id.co.kosankoding.materialdesignandroid.R;

public class FABActivity extends AppCompatActivity {

    EditText etNamaLengkap;
    FloatingActionButton fabTambah;

    String namaLengkap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fab);

        etNamaLengkap = findViewById(R.id.et_nama_lengkap);
        fabTambah = findViewById(R.id.fab_tambah);

        fabTambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                namaLengkap = etNamaLengkap.getText().toString();
                Snackbar.make(findViewById(R.id.layout_main), "Nama Lengkap : " + namaLengkap, Snackbar.LENGTH_LONG).show();
            }
        });
    }
}
