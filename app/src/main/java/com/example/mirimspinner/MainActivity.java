package com.example.mirimspinner;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    ImageView imgv;

    String[] posterTitles = {"너의 이름은", "시간을 달리는 소녀", "별을 쫒는 아이", "늑대아이", "이웃집 토토로",
            "센과 치히로", "마녀 배달부 키키", "메리와 마녀의 꽃", "모노노케 히메", "천공의 성 라퓨타"};
    int[] imgRes = {R.drawable.m1, R.drawable.m2, R.drawable.m3, R.drawable.m4, R.drawable.m5,
            R.drawable.m6, R.drawable.m7, R.drawable.m8, R.drawable.m9, R.drawable.m10};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner spinner1 = findViewById(R.id.spinner1);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, posterTitles);
        spinner1.setAdapter(adapter);
        spinner1.setOnItemSelectedListener(spinnerListener);
        imgv = findViewById(R.id.imgv);
    }

    AdapterView.OnItemSelectedListener spinnerListener = new AdapterView.OnItemSelectedListener() {
        @Override
        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
            imgv.setImageResource(imgRes[position]);
        }

        @Override
        public void onNothingSelected(AdapterView<?> parent) {

        }
    };
}