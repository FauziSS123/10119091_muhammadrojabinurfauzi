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
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class LoginActivity extends Activity implements View.OnClickListener{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Button button = findViewById(R.id.button);
        button.setOnClickListener(this);

        Button btndaftar = findViewById(R.id.btndaftar);
        btndaftar.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button:
                Intent pindahIntent = new Intent(LoginActivity.this, MainActivity.class);
                startActivity(pindahIntent);
                break;
        }

        switch (v.getId()){
            case R.id.btndaftar:
                Intent pindahIntent = new Intent(LoginActivity.this, RegisterActivity.class);
                startActivity(pindahIntent);
                break;
        }
    }


}