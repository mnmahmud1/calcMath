package com.example.calcmath;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class activityPersegi extends AppCompatActivity {
    float keliling = 0;
    float luas = 0;
    EditText sisiKeliling, sisiLuas;
    TextView resultKeliling, resultLuas;
    Button hitSisiLuas, hitSisiKeliling;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_persegi);

        sisiKeliling = findViewById(R.id.sisiKeliling);
        sisiLuas = findViewById(R.id.sisiLuas);
        resultKeliling = findViewById(R.id.resultKeliling);
        resultLuas = findViewById(R.id.resultLuas);
        hitSisiKeliling = findViewById(R.id.hitSisiKeliling);
        hitSisiLuas = findViewById(R.id.hitSisiLuas);

        hitSisiKeliling.setOnClickListener(v -> {
            String value = sisiKeliling.getText().toString();
            float sisi = Float.parseFloat(value);

            if (TextUtils.isEmpty(sisiKeliling.getText())) {
                sisiKeliling.setError("Lebar sisi wajib diisi!");
                sisiKeliling.requestFocus();
//                    Context context = getApplicationContext();
//                    Toast toast = Toast.makeText(this, "Lebar sisi wajib diisi!", Toast.LENGTH_SHORT);
//                    toast.show();
            } else {
                keliling = sisi * 4;
                resultKeliling.setText("Hasil : " + keliling + " cm");
            }
        });

        hitSisiLuas.setOnClickListener(v -> {
            String value = sisiLuas.getText().toString();
            float sisi = Float.parseFloat(value);

            if (TextUtils.isEmpty(sisiLuas.getText())) {
                sisiLuas.setError("Lebar sisi wajib diisi!");
                sisiLuas.requestFocus();
//                    Context context = getApplicationContext();
//                    Toast toast = Toast.makeText(this, "Lebar sisi wajib diisi!", Toast.LENGTH_SHORT);
//                    toast.show();
            } else {
                luas = sisi * sisi;
                resultLuas.setText("Hasil : " + luas + " cm2");
            }
        });


    }
}