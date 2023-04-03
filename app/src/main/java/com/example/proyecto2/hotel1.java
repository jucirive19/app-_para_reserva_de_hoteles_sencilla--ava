package com.example.proyecto2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.Toast;

public class hotel1 extends AppCompatActivity {
    RatingBar est1;
    Button btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotel1);
        asignar();
    }

    private void asignar() {
        est1=findViewById(R.id.ratingBar);
        est1.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float v, boolean b) {
                Toast.makeText(hotel1.this,"su calificacion es de "+v+" estreallas",Toast.LENGTH_LONG).show();
            }
        });
        btn1=findViewById(R.id.button);
    }
    public  void retono1(View view)throws Exception{
        String link = "https://www.google.com/travel/hotels/entity/CgoInv7Hq-7q-aRLEAE/prices?g2lb=2502548%2C4258168%2C4270442%2C4271060%2C4306835%2C4317915%2C4328159%2C4371335%2C4419364%2C4433754%2C4447566%2C4456077%2C4463263%2C4270859%2C4284970%2C4291517%2C4412689&hl=es-CO&gl=co&un=1&rp=EJ7-x6vu6vmkSzgCQABIAcABAg&ictx=1&ved=0CAAQ5JsGahcKEwi4pdXdkv7sAhUAAAAAHQAAAAAQAw&utm_campaign=sharing&utm_medium=link&utm_source=htls&hrf=IgNDT1AqFgoHCOUPEAEYCRIHCOUPEAEYChgBKACCASUweDhlNmIwZGFjOGFlOWQxZDU6MHg0YjQ5ZTc1NmU1NzFmZjFlmgEnGiUweDhlNmIwZGFjOGFlOWQxZDU6MHg0YjQ5ZTc1NmU1NzFmZjFl";
        Intent intent = null;
        intent = new Intent(intent.ACTION_VIEW, Uri.parse(link));
        Toast.makeText(this,"gracias por su confianza", Toast.LENGTH_SHORT).show();
        startActivity(intent);
       /* Intent o=new Intent(this,MainActivity.class);
        Toast.makeText(this,"Reservacion Efectuada", Toast.LENGTH_SHORT).show();
        startActivity(o);*/
    }
}
