package com.example.proyecto2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.Toast;

public class hotel2 extends AppCompatActivity {
    RatingBar est2;
    Button btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotel2);
        asignar();
    }

    private void asignar() {
        est2=findViewById(R.id.ratingBar2);
        est2.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float v, boolean b) {
                Toast.makeText(hotel2.this,"su calificacion es de "+v+" estreallas",Toast.LENGTH_LONG).show();
            }
        });
        btn2=findViewById(R.id.button2);
    }
    public  void retono2(View view) throws Exception{
        String link ="https://www.google.com/travel/hotels/entity/CgoIsu32mc_O5oYHEAE/prices?g2lb=2502548%2C4258168%2C4270442%2C4271060%2C4306835%2C4317915%2C4328159%2C4371335%2C4419364%2C4433754%2C4447566%2C4456077%2C4463263%2C4270859%2C4284970%2C4291517%2C4412689&hl=es-CO&gl=co&un=1&rp=ELLt9pnPzuaGBxCy7faZz87mhgc4AkAASAHAAQI&ictx=1&ved=0CAAQ5JsGahcKEwjwwOqbk_7sAhUAAAAAHQAAAAAQAg&utm_campaign=sharing&utm_medium=link&utm_source=htls&hrf=IgNDT1AqFgoHCOQPEAsYFBIHCOQPEAsYFRgBKACCASQweDhlNmIwZGE1NGFkNGZhMTE6MHg3MGQ5YTc0ZjMzZGI2YjKaASYaJDB4OGU2YjBkYTU0YWQ0ZmExMToweDcwZDlhNzRmMzNkYjZiMg";
        Intent intent = null;
        intent = new Intent(intent.ACTION_VIEW, Uri.parse(link));
        Toast.makeText(this,"gracias por su confianza", Toast.LENGTH_SHORT).show();
        startActivity(intent);
        /*Intent i=new Intent(this,MainActivity.class);
        Toast.makeText(this,"Reservacion Efectuada", Toast.LENGTH_SHORT).show();
        startActivity(i);*/
    }
}
