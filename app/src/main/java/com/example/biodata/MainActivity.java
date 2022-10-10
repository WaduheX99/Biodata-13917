package com.example.biodata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnAlamat, btnTelepon, btnEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnTelepon = findViewById(R.id.btnTelepon);
        btnEmail = findViewById(R.id.btnEmail);
        btnAlamat = findViewById(R.id.btnAlamat);
        String email = "affandifaza@gmail.com";

        btnTelepon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nomor = "087734261776";
                Intent calling = new Intent(Intent.ACTION_DIAL);
                calling.setData(Uri.fromParts("tel", nomor, null));
                startActivity(calling);
            }
        });

        btnEmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent sendingEmail = new Intent(Intent.ACTION_VIEW
                        , Uri.parse("mailto:"+ email));
                startActivity(sendingEmail);
            }
        });

        btnAlamat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent openMap = new Intent(Intent.ACTION_VIEW
                        , Uri.parse("geo:-7.034209, 110.452914"));
                startActivity(openMap);
            }
        });
    }
}