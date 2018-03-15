package com.example.alunos.adicionando_img;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ImageView boneca;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        boneca = (ImageView) findViewById(R.id.img_boneca);
    }
    public void onClick(View v){
        Toast.makeText(this, "Bonequinha linda!!", Toast.LENGTH_LONG).show();
    }
}
