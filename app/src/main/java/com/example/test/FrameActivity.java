package com.example.test;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class FrameActivity extends AppCompatActivity {
    private Button BTN;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_frame);
    }
    //버튼 클릭 시 사라지게 하기
    public void onClick(View v) {
        v.setVisibility(View.GONE);
    }
}