package com.example.hci_kidoatm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class KudoLogin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kudo_login);
    }

    public void btnClicked(View view){
        Intent i =new Intent(this,KudoDashboard.class);
        startActivity(i);
    }
}
