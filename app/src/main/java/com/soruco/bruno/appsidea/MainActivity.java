package com.soruco.bruno.appsidea;

import android.app.ListActivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnContactos, btnContactosUtiles, btnInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnContactos = (Button) findViewById(R.id.btContactos);
        btnContactosUtiles = (Button) findViewById(R.id.btContactosUtiles);
        btnInfo = (Button) findViewById(R.id.btInfo);

        try{
            btnContactos.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    Intent intent = new Intent(MainActivity.this, ListaContactos.class);
                    startActivity(intent);
                }
            });

            btnContactosUtiles.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    Intent intent = new Intent(MainActivity.this, ListaContactosUtiles.class);
                    startActivity(intent);
                }
            });

            btnInfo.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    Intent intent = new Intent(MainActivity.this, Info.class);
                    startActivity(intent);
                }
            });
        }catch (Exception ex){
            Toast.makeText(this,ex.getMessage(),Toast.LENGTH_SHORT).show();
        }
    }
}
