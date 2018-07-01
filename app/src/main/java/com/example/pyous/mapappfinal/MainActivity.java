package com.example.pyous.mapappfinal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void OnClick(View v){
        if (v.getId() == R.id.Blogin)
        {
            EditText a = (EditText)findViewById(R.id.TFusername) ;
            EditText p = (EditText)findViewById(R.id.password);
            final String struser = a.getText().toString();
            final String strpass = p.getText().toString();
            // Button1= (Button)findViewById(R.id.Blogin);
            if ( validate(struser,strpass))
            {
                Intent i = new Intent(MainActivity.this, MapsActivity.class);
                startActivity(i);

            }
            else
            {
                Toast toast = Toast.makeText(MainActivity.this,"Username or Password is incorrect",Toast.LENGTH_SHORT);
                toast.show();

            }
        }



    }

    /**
     * This method is created for username and password verification. If they are correct it will return true otherwise false
     * @param Username
     * @param Password
     * @return
     */

    public Boolean validate(String Username, String Password)
    {
        if((Username.compareTo( "Admin")) == 0 && (Password.compareTo( "1234"))==0){
            return true;

        }
        else {
            return false;

        }


    }


}
