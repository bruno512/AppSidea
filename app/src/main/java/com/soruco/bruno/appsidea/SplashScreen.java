package com.soruco.bruno.appsidea;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Handler;
import android.widget.Toast;

public class SplashScreen extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        try{
            setContentView(R.layout.activity_splash_screen);

        }catch (Exception ex){
            Toast.makeText(this, ex.getMessage(),Toast.LENGTH_LONG).show();
        }

        // Para que muestre la pantalla de carga espere 4 seg y pase a la otra pantalla
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashScreen.this, MainActivity.class);
                startActivity(intent);
            }
        }, 4000); // espera 4 seg
    }
}
