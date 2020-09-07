
package com.example.basicloginapp;


import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import com.example.basicloginapp.R;

public class MainActivity extends AppCompatActivity {
    EditText etUsername,etPassword;
    Button btsubmit;

    @Override
    protected void onCreate (Bundle savedInstanceState)  {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etUsername = findViewById(R.id.et_username);
        etPassword = findViewById(R.id.et_password);
        btsubmit = findViewById(R.id.bt_submit);

        btsubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (etUsername.getText().toString().equals(etPassword.getText().toString())) {
                    
                    Intent submitIntent = new Intent(MainActivity.this,Activity2.class);
                    startActivity(submitIntent);
                    finish();
                }
                else 
                {
                    Toast.makeText(getApplicationContext(),"password and username dosent match", Toast.LENGTH_SHORT).show();
                }
                //AlertDialog.Builder builder = new AlertDialog.Builder(
                  //       MainActivity.this
                //);

               // builder.setIcon(R.drawable.ab_check);
               // builder.setTitle("Login Successfully !!!");
                //builder.setMessage("Welcome...");

                //builder.setNegativeButton("YES", new DialogInterface.OnClickListener()
                //{
                  //  @Override
                    //public void onClick(DialogInterface dialog, int i) {
                      //  dialog.cancel();




                //    }
                //});
                //AlertDialog alertDialog = builder.create();
                //alertDialog.show();



            }
           
            


            });
        } ;
    }







