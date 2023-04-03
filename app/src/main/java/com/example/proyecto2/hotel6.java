package com.example.proyecto2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.Toast;

public class hotel6 extends AppCompatActivity {
    RatingBar est6;
    Button btn6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotel6);
        asignar();
    }

    private void asignar() {
        est6=findViewById(R.id.ratingBar6);
        est6.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float v, boolean b) {
                Toast.makeText(hotel6.this,"su calificacion es de "+v+" estreallas",Toast.LENGTH_LONG).show();
            }
        });
        btn6=findViewById(R.id.button6);
    }
    public  void retono6(View view)throws Exception{
        String link = "https://co.hoteles.com/search.do?resolved-location=CITY%3A298631%3AUNKNOWN%3AUNKNOWN&destination-id=298631&q-destination=Yopal,%20Colombia&q-check-in=2019-12-08&q-check-out=2019-12-09&q-rooms=1&q-room-0-adults=2&q-room-0-children=0&f-hotel-id=493666";
        Intent intent = null;
        intent = new Intent(intent.ACTION_VIEW, Uri.parse(link));
        Toast.makeText(this,"gracias por su confianza", Toast.LENGTH_SHORT).show();
        startActivity(intent);
    }
}
