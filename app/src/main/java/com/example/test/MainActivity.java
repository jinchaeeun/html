package com.example.test;


import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    //로그 찍기
    // Debug 관련 ------------------------------
    private final static String TAG = "TEST_APP";      //Log 출력 시 구분자, 여러 프로그램을 실행하다보면 어느 앱에서 에러가 났는지 확인할 수 없어서 태그를 달아줌
    //private LinearLayout joinLAY; //레이아웃 변수 설정
    // Control ---------------------------------
    private final Random random = new Random();
    // UI 관련 변수 ----------------------------
    private LinearLayout eventTestLAY;
    private TextView txt_title;


    //---------------------------------------------

    // 멤버 메서드
    //---------------------------------------------
    //AppCompatActivity's method ------------------

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //사용자에게 보여지는 화면 설정
        setContentView(R.layout.event_listener_test);

        // 디버깅을 위한 로그 출력
        //i는 info, d는 디버그, e는 에러
        Log.i(TAG, "onCreate()");

        eventTestLAY = findViewById(R.id.eventtestLAY);

        txt_title = findViewById(R.id.txt_title);
    }


    // onClick 속성 지원 Method --------------------------
    // UI 요소 중 onClick 속성 설정한 경우 실행되는 메서드
    public void clickFunc(View v) {
        if (v.getId() == R.id.btnPowderBlue) {
            eventTestLAY.setBackgroundColor(Color.rgb(random.nextInt(255), random.nextInt(255), random.nextInt(255)));
            //eventTestLAY.setBackgroundColor(Color.parseColor("#FFB0E0E6"));
            txt_title.setVisibility(View.VISIBLE);
        } else if (v.getId() == R.id.btnPlum) {
            eventTestLAY.setBackgroundColor(Color.rgb(random.nextInt(255), random.nextInt(255), random.nextInt(255)));
            //eventTestLAY.setBackgroundColor(Color.parseColor("#FFDDA0DD"));
            txt_title.setVisibility(View.INVISIBLE);
        } else if (v.getId() == R.id.txt_title) {
            Log.i(TAG, "Title CLICK~~~");
        }

    }

}