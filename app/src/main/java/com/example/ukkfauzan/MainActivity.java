package com.example.ukkfauzan;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    EditText edtHarga, edtDiskon;
    TextView tmplDiskon, tmplTotal, tmplHarga;
    Button btnHitung;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtHarga=findViewById(R.id.formHarga);
        edtDiskon=findViewById(R.id.formDiskon);
        tmplDiskon=findViewById(R.id.textDiskon);
        tmplTotal=findViewById(R.id.textTotal);
        tmplHarga=findViewById(R.id.textHarga);
        btnHitung=findViewById(R.id.btnHitung);

        btnHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                htgTotal();
            }
        });
    }

    public void htgTotal(){
        String hrg = edtHarga.getText().toString().trim();
        String dskn = edtDiskon.getText().toString().trim();

        if (hrg.isEmpty()) {
            hrg = "0";
        }
        if (dskn.isEmpty()) {
            dskn = "0";
        }

        double hrgDb;
        double dsknDb;

        try {
            hrgDb = Double.parseDouble(hrg);
            dsknDb = Double.parseDouble(dskn);
        } catch (NumberFormatException e){
            Toast.makeText(this, "Input harus berupa angka!", Toast.LENGTH_SHORT).show();
            return;
        }

        if (hrgDb < 0){
            Toast.makeText(this, "Harga harus lebih dari 0", Toast.LENGTH_SHORT).show();
            return;
        }
        if (dsknDb < 0 || dsknDb > 100) {
            Toast.makeText(this, "Diskon harus lebih dari 0 atau kurang dari 100", Toast.LENGTH_SHORT).show();
            return;
        }

        tmplHarga.setText("Harga : Rp" + hrgDb);
        tmplDiskon.setText("Diskon : " + dsknDb + "%");
        double ttlHarga = hrgDb - (hrgDb * dsknDb / 100);
        tmplTotal.setText("Total Harga : Rp" + ttlHarga);
    }
}