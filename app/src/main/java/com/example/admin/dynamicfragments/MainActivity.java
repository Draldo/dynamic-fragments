package com.example.admin.dynamicfragments;

import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.FrameLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        FragmentManager fragment = getSupportFragmentManager();
        fragment.beginTransaction()
                .add(R.id.a_frame1, new BlankFragment())
                .add(R.id.a_frame2, new BlankFragment())
                .add(R.id.a_frame3, new BlankFragment())
                .commit();
    }
}
