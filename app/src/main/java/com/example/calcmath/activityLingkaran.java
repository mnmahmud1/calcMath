package com.example.calcmath;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class activityLingkaran extends AppCompatActivity {

    double keliling, luas;
    EditText jariKeliling, jariLuas;
    TextView resultKeliling, resultLuas;
    Button hitKeliling, hitLuas;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lingkaran);

        jariKeliling = findViewById(R.id.jariKeliling);
        jariLuas = findViewById(R.id.jariLuas);

        resultKeliling = findViewById(R.id.resultKeliling);
        resultLuas = findViewById(R.id.resultLuas);

        hitKeliling = findViewById(R.id.hitKeliling);
        hitLuas = findViewById(R.id.hitLuas);

        hitKeliling.setOnClickListener(v -> {
            String valJari = jariKeliling.getText().toString();
            float valueJari = Float.parseFloat(valJari);

            if (TextUtils.isEmpty(jariKeliling.getText())){
//                Jika tidak ada isinya
            } else {
//                Jika ada isinya
                keliling = 2 * (3.14 * valueJari);
                resultKeliling.setText("Hasil : " + keliling + " cm");

            }
        });

        hitLuas.setOnClickListener(v -> {
            String valJari = jariLuas.getText().toString();
            float valueJari = Float.parseFloat(valJari);

            if (TextUtils.isEmpty(jariLuas.getText())){
//                Jika tidak ada isinya
            } else {
//                Jika ada isinya
                luas = 3.14 * (valueJari * valueJari);
                resultLuas.setText("Hasil : " + luas + " cm2");

            }
        });

    }

}