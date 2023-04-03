package com.example.proyecto2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.Toast;

public class hotel9 extends AppCompatActivity {
    RatingBar est9;
    Button btn9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotel9);
        asignar();
    }

    private void asignar() {
        est9=findViewById(R.id.ratingBar9);
        est9.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float v, boolean b) {
                Toast.makeText(hotel9.this,"su calificacion es de "+v+" estreallas",Toast.LENGTH_LONG).show();
            }
        });
        btn9=findViewById(R.id.button9);
    }
    public  void retono9(View view)throws Exception{
        String link = "https://www.booking.com/searchresults.es.html?aid=344353;label=metatrivago-hotel-2789185_xqdz-3c70692d3f8b7eb924c56b3d15297338_los-1_nrm-1_gstadt-2_gstkid-0_curr-cop_lang-es_itt-1_trvlp-b_losb-1_bw-12_bwb-8_trvbm-a_split-47340a%2C47646b_defdate-0_trvref-5c092828-72dd-4884-a599-f80d81fd74d2;sid=61f8783b9c94e00e7225ffcf542b540c;checkin=2019-12-08;checkout=2019-12-09;city=-601684;highlighted_hotels=2789185;hlrd=with_av;itt=1;keep_landing=1;redirected=1;selected_currency=COP;source=hotel;sr_show_room=278918502_174190984_2_1_0;trv_curr=COP;trv_dp=110167&utm_campaign=co&utm_content=los-1_nrm-1_gstadt-2_gstkid-0_curr-cop_lang-es_itt-1_trvlp-b_losb-1_bw-12_bwb-8_trvbm-a_split-47340a%2C47646b_defdate-0_trvref-5c092828-72dd-4884-a599-f80d81fd74d2&utm_medium=meta&utm_source=metatrivago&utm_term=hotel-2789185&";
        Intent intent = null;
        intent = new Intent(intent.ACTION_VIEW, Uri.parse(link));
        Toast.makeText(this,"gracias por su confianza", Toast.LENGTH_SHORT).show();
        startActivity(intent);
    }
}
