package com.example.mirimspinner;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    String[] posterTitles = {"너의 이름은", "시간을 달리는 소녀", "별을 쫒는 아이", "늑대아이", "이웃집 토토로",
            "센과 치히로", "마녀 배달부 키키", "메리와 마녀의 꽃", "모노노케 히메", "천공의 성 라퓨타"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner spinner1 = findViewById(R.id.spinner1);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, posterTitles);
        spinner1.setAdapter(adapter);
    }
}