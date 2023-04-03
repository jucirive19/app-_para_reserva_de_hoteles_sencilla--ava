package com.example.proyecto2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.Toast;

public class hotel7 extends AppCompatActivity {
    RatingBar est7;
    Button btn7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotel7);
        asignar();
    }

    private void asignar() {
        est7=findViewById(R.id.ratingBar7);
        est7.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float v, boolean b) {
                Toast.makeText(hotel7.this,"su calificacion es de "+v+" estreallas",Toast.LENGTH_LONG).show();
            }
        });
        btn7=findViewById(R.id.button6);
    }
    public  void retono7(View view)throws Exception{
        String link = "https://www.booking.com/searchresults.es.html?aid=344353;label=metatrivago-hotel-1340077_xqdz-71c68d0b59b65dabd1859e3b0d8d6785_los-1_nrm-1_gstadt-2_gstkid-0_curr-cop_lang-es_itt-1_trvlp-b_losb-1_bw-12_bwb-8_trvbm-a_split-47340a%2C47646b_defdate-0_trvref-17fd430a-22bd-416c-b540-6cc49876d17c;sid=61f8783b9c94e00e7225ffcf542b540c;checkin=2019-12-08;checkout=2019-12-09;city=-601684;highlighted_hotels=1340077;hlrd=with_av;itt=1;keep_landing=1;redirected=1;selected_currency=COP;source=hotel;sr_show_room=134007705_85857041_2_1_0;trv_curr=COP;trv_dp=135532&utm_campaign=co&utm_content=los-1_nrm-1_gstadt-2_gstkid-0_curr-cop_lang-es_itt-1_trvlp-b_losb-1_bw-12_bwb-8_trvbm-a_split-47340a%2C47646b_defdate-0_trvref-17fd430a-22bd-416c-b540-6cc49876d17c&utm_medium=meta&utm_source=metatrivago&utm_term=hotel-1340077&";
        Intent intent = null;
        intent = new Intent(intent.ACTION_VIEW, Uri.parse(link));
        Toast.makeText(this,"gracias por su confianza", Toast.LENGTH_SHORT).show();
        startActivity(intent);
    }
}
