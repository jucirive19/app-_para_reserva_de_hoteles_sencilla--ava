package com.example.proyecto2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.Toast;

public class hotel3 extends AppCompatActivity {
    RatingBar est3;
    Button btn3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotel3);
        asignar();
    }

    private void asignar() {
        est3=findViewById(R.id.ratingBar3);
        est3.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float v, boolean b) {
                Toast.makeText(hotel3.this,"su calificacion es de "+v+" estreallas",Toast.LENGTH_LONG).show();
            }
        });
        btn3=findViewById(R.id.button3);
    }
    public  void retono3(View view)throws Exception{
        String link = "https://www.booking.com/searchresults.es.html?aid=344353;label=metatrivago-hotel-1339582_xqdz-66a478a6363b883e5fe2a7108e907955_los-1_nrm-1_gstadt-2_gstkid-0_curr-cop_lang-es_itt-1_trvlp-b_losb-1_bw-11_bwb-8_trvbm-a_split-47340a%2C47646b_defdate-0_trvref-4679f877-d7d0-4def-99bd-a096aa22b400;sid=61f8783b9c94e00e7225ffcf542b540c;checkin=2019-12-07;checkout=2019-12-08;city=-601684;highlighted_hotels=1339582;hlrd=with_av;itt=1;keep_landing=1;redirected=1;selected_currency=COP;source=hotel;sr_show_room=133958201_87516485_0_1_0;trv_curr=COP;trv_dp=127192&utm_campaign=co&utm_content=los-1_nrm-1_gstadt-2_gstkid-0_curr-cop_lang-es_itt-1_trvlp-b_losb-1_bw-11_bwb-8_trvbm-a_split-47340a%2C47646b_defdate-0_trvref-4679f877-d7d0-4def-99bd-a096aa22b400&utm_medium=meta&utm_source=metatrivago&utm_term=hotel-1339582&";
        Intent intent = null;
        intent = new Intent(intent.ACTION_VIEW, Uri.parse(link));
        Toast.makeText(this,"gracias por su confianza", Toast.LENGTH_SHORT).show();
        startActivity(intent);
    }
}
