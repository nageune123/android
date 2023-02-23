package com.kjy.app0223;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


public class Fragment4 extends Fragment {
    Button btn_1,btn_2;
    TextView tv_1,tv_2;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // java 랑 짝지어진 xml 파일을 view객체(Inflate해서)로 만들어서 리턴~
        View view = inflater.inflate(R.layout.fragment_4, container, false);

        btn_1=view.findViewById(R.id.btn_1);
        btn_2=view.findViewById(R.id.btn_2);
        tv_1=view.findViewById(R.id.tv_1);
        tv_2=view.findViewById(R.id.tv_2);

        // 1. 1~30 까지 숫자를 세는 Thread를 설계(클래스로) - 설계는 1개
        // 2. 버튼 눌렀을 때 Thread 객체를 생성하고 start! - 생성은 2개

        return view;
    }

    class TimeThread extends Thread{

        // Thread 메소드 실행순서(Life Cycle)
        // start -> run - > destroy


        @Override
        public void run() {

        }
    }


}