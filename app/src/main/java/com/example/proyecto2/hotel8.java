package com.example.proyecto2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.Toast;

public class hotel8 extends AppCompatActivity {
    RatingBar est8;
    Button btn8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotel8);
        asignar();
    }

    private void asignar() {
        est8=findViewById(R.id.ratingBar8);
        est8.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float v, boolean b) {
                Toast.makeText(hotel8.this,"su calificacion es de "+v+" estreallas",Toast.LENGTH_LONG).show();
            }
        });
        btn8=findViewById(R.id.button8);
    }
    public  void retono8(View view)throws Exception{
        String link = "https://hoteles.tiquetesbaratos.com/hotel/hotel-campestre-la-bendicion-yopal?checkin=2019-12-08&checkout=2019-12-09&source=trivago&ispackage=false&placetype=6&rooms=1&room1.adults=2&room1.kids=0&room1.agekids=&kids=0&agekids=&CampaignToken=06cf6b5847f84aaa8c6e41cfc456e74e&trv_reference=c999893f-b9f3-4056-8245-f394daa0d89f";
        Intent intent = null;
        intent = new Intent(intent.ACTION_VIEW, Uri.parse(link));
        Toast.makeText(this,"gracias por su confianza", Toast.LENGTH_SHORT).show();
        startActivity(intent);
    }
}
