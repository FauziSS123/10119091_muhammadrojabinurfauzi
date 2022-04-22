// nim : 10119091
// nama : muhammadrojabinurfauzi
// tanggal pengerjaan : 19 April 2022
package com.example.a10119091_muhammadrojabinurfauzi;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends Activity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnprofil = findViewById(R.id.btnprofil);
        btnprofil.setOnClickListener(this);

        Button btnkeluar = findViewById(R.id.btnkeluar);
        btnkeluar.setOnClickListener(this);

//        Button btnprofile = findViewById(R.id.btnprofile);
//        btnprofile.setOnClickListener(this);
    }


    @Override
    public void onClick(View a) {
            switch (a.getId()){
                case R.id.btnprofil:
                    Intent pindahIntent = new Intent(MainActivity.this, ProfileActivity.class);
                    startActivity(pindahIntent);
                    break;
            }
            switch (a.getId()){
                case R.id.btnkeluar:
                    Intent pindahIntent = new Intent(MainActivity.this, LoginActivity.class);
                    startActivity(pindahIntent);
                break;
        }
//        switch (v.getId()){
//            case R.id.btnprofile:
//                Intent pindahIntent = new Intent(MainActivity.this, ProfileActivity.class);
//                startActivity(pindahIntent);
//                break;
//        }
        }



}