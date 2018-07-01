package com.example.pyous.mapappfinal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MenuActivity extends AppCompatActivity {

    private static RadioGroup radio_g;
    private static RadioButton radio_b, home,msg,logout, help;
    private static Button bok;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }

    public void OnClick(View v){

        radio_g = (RadioGroup) findViewById(R.id.rg_page);
        home = (RadioButton) findViewById(R.id.radio_home);
        msg = (RadioButton) findViewById(R.id.radio_msg);
        help = (RadioButton) findViewById(R.id.radio_help);
        logout = (RadioButton) findViewById(R.id.radio_logout);
        if (v.getId() == R.id.B_ok)
        {
            int selected_id = radio_g.getCheckedRadioButtonId();
            radio_b = (RadioButton) findViewById(selected_id);


            if(selected_id == home.getId()){
                Intent i = new Intent(MenuActivity.this, MapsActivity.class);
                startActivity(i);

            }

            else if(selected_id == msg.getId()){

            }

            else if(selected_id == help.getId()){
                Intent i = new Intent(MenuActivity.this, HelpActivity.class);
                startActivity(i);

            }

            else{

                Intent i = new Intent(MenuActivity.this, MainActivity.class);
                startActivity(i);
            }

        }
    }
}
