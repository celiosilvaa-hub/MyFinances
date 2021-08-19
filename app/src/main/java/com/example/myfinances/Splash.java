package com.example.myfinances;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import static android.view.WindowManager.*;

public class Splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        //Oculta barra com o nome da active na tela do celular.
        getSupportActionBar().hide();
        //Deixa a tela full Screen
        getWindow().setFlags(LayoutParams.FLAG_FULLSCREEN, LayoutParams.FLAG_FULLSCREEN);
        //Trabalha com fila de processamento
        Handler hd = new Handler();
        //Contua um tempo para depois chamas a próxima tela
        hd.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent it = new Intent(Splash.this, MainActivity.class);
                startActivity(it);
                finish();
            }
        }, 2000);

    }
}