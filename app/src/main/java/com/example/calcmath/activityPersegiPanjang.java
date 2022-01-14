package com.example.calcmath;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class activityPersegiPanjang extends AppCompatActivity {

    float luas, keliling;
    EditText panjangKeliling, lebarKeliling, panjangLuas, lebarLuas;
    TextView resultKeliling, resultLuas;
    Button hitKeliling, hitLuas;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_persegi_panjang);

        panjangKeliling = findViewById(R.id.panjangKeliling);
        lebarKeliling = findViewById(R.id.lebarKeliling);
        panjangLuas = findViewById(R.id.panjangLuas);
        lebarLuas = findViewById(R.id.lebarLuas);

        resultKeliling = findViewById(R.id.resultKeliling);
        resultLuas = findViewById(R.id.resultLuas);

        hitKeliling = findViewById(R.id.hitKeliling);
        hitLuas = findViewById(R.id.hitLuas);

        hitKeliling.setOnClickListener(v -> {
            String valPanjang = panjangKeliling.getText().toString();
            float valuePanjang = Float.parseFloat(valPanjang);

            String valLebar = lebarKeliling.getText().toString();
            float valueLebar = Float.parseFloat(valLebar);

            if (TextUtils.isEmpty(panjangKeliling.getText())) {
//                Jika tidak ada isinya
            } else {
//                Jika ada isinya
                keliling = 2 * (valuePanjang + valueLebar);
                resultKeliling.setText("Hasil : " + keliling + " cm");
            }
        });

        hitLuas.setOnClickListener(v -> {
            String valPanjang = panjangLuas.getText().toString();
            float valuePanjang = Float.parseFloat(valPanjang);

            String valLebar = lebarLuas.getText().toString();
            float valueLebar = Float.parseFloat(valLebar);

            if (TextUtils.isEmpty(panjangLuas.getText())) {
//                Jika tidak ada isinya
            } else {
//                Jika ada isinya
                luas = valuePanjang * valueLebar;
                resultLuas.setText("Hasil : " + luas + " cm2");
            }
        });

    }
}