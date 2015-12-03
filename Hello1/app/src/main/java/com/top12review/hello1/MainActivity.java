package com.top12review.hello1;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
        implements View.OnClickListener {

    Button btnLogin;
    EditText etEmail, etPass;
    ImageView iv1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etEmail = (EditText) findViewById(R.id.etEmail);
        etPass = (EditText) findViewById(R.id.etPass);
        btnLogin = (Button) findViewById(R.id.btnLogin);
        btnLogin.setOnClickListener(this);
        iv1 = (ImageView)findViewById(R.id.iv1);
//        iv1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Log.i("MainActivity", "Image Click");
//            }
//        });

        iv1.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {

                AlertDialog.Builder dialog =
                        new AlertDialog.Builder(MainActivity.this);
                dialog.setTitle("My Title");
                dialog.setMessage("My Message");
                dialog.setPositiveButton("Save", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(MainActivity.this, "Save", Toast.LENGTH_SHORT).show();
                    }
                });
                dialog.setNegativeButton("Discard", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(MainActivity.this, "Discard", Toast.LENGTH_SHORT).show();
                    }
                });
                dialog.setIcon(android.R.drawable.btn_star);
                dialog.show();


                Log.i("MainActivity", "Image Long Click");
                return true;
            }
        });

        iv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),
                        "Click",
                        Toast.LENGTH_SHORT).show();
            }
        });

    }

    @Override
    public void onClick(View v){
        Log.i("MainActivity", "click");

        AlertDialog.Builder dialog = new AlertDialog.Builder(this);

    }
}
