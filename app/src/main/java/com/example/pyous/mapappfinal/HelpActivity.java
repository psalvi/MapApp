package com.example.pyous.mapappfinal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class HelpActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help);
    }

    public void OnClickk(View v){
        if (v.getId() == R.id.B_back)
        {
            Intent i = new Intent(HelpActivity.this, MenuActivity.class);
            startActivity(i);

        }
    }
}
