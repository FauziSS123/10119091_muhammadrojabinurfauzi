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

public class RegisterActivity extends Activity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        Button daftar = findViewById(R.id.btndaftar2);
        daftar.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btndaftar2:
                Intent pindahIntent = new Intent(RegisterActivity.this, MainActivity.class);
                startActivity(pindahIntent);
                break;
        }
    }
}