package com.kjy.app0223;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.FrameLayout;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity {
    FrameLayout layout;
    BottomNavigationView bnv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        layout = findViewById(R.id.framelayout);
        bnv = findViewById(R.id.bnv);
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.framelayout,new Fragment1()).commit();


        bnv.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch (item.getItemId()){
                    case R.id.item1:
                        getSupportFragmentManager().beginTransaction()
                                .replace(R.id.framelayout,new Fragment1()).commit();
                                        //    위치, 객체
                        break;
                    case R.id.item2:
                        getSupportFragmentManager().beginTransaction()
                                .replace(R.id.framelayout,new Fragment2()).commit();
                        break;
                    case R.id.item3:
                        getSupportFragmentManager().beginTransaction()
                                .replace(R.id.framelayout,new Fragment3()).commit();
                        break;
                    case R.id.item4:
                        getSupportFragmentManager().beginTransaction()
                                .replace(R.id.framelayout,new Fragment4()).commit();
                        break;

                };

                // 현재 이벤트가 종료되었는지 여부를 리턴 => LongClick!! 할 때 !
                return true;
            }
        });



        // bnv 를 클릭했을 때 어떤 메뉴가 선택됐는지 검사해서
        // frameLayout에 들어갈 Fragment 결정해주면 됨!


    }
}