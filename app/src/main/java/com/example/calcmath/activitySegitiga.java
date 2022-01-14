package com.example.calcmath;

import static android.text.TextUtils.*;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class activitySegitiga extends AppCompatActivity {

    double keliling, luas;
    EditText sisiKeliling, alasLuas, tinggiLuas;
    TextView resultKeliling, resultLuas;
    Button hitKeliling, hitLuas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segitiga);

        sisiKeliling = findViewById(R.id.sisiKeliling);
        alasLuas = findViewById(R.id.alasLuas);
        tinggiLuas = findViewById(R.id.tinggiLuas);

        resultKeliling = findViewById(R.id.resultKeliling);
        resultLuas = findViewById(R.id.resultLuas);

        hitKeliling = findViewById(R.id.hitKeliling);
        hitLuas = findViewById(R.id.hitLuas);

        hitKeliling.setOnClickListener(v -> {
            String valSisi = sisiKeliling.getText().toString();
            double valueSisi = Double.parseDouble(valSisi);

            if (isEmpty(sisiKeliling.getText())) {
//                jika tidak ada isinya
            } else {
//                Jika ada isinya
                keliling = valueSisi * 3;
                resultKeliling.setText("Hasil : " + keliling + " cm");
            }
        });

        hitLuas.setOnClickListener(v -> {
            String valAlas = alasLuas.getText().toString();
            String valTinggi = tinggiLuas.getText().toString();
            double valueAlas = Double.parseDouble(valAlas);
            double valueTinggi = Double.parseDouble(valTinggi);

            if (isEmpty(alasLuas.getText())) {
//                Jika tidak ada isinya
                alasLuas.setError("Lebar sisi wajib diisi!");
                alasLuas.requestFocus();
            } else {
//                Jika ada isinya
                luas = 0.5 * valueAlas * valueTinggi;
                resultLuas.setText("Hasil : " + luas + " cm2");
            }

        });
    }
}