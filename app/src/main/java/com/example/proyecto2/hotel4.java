package com.example.proyecto2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.Toast;

public class hotel4 extends AppCompatActivity {
    RatingBar est4;
    Button btn4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotel4);
        asignar();
    }

    private void asignar() {
        est4=findViewById(R.id.ratingBar4);
        est4.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float v, boolean b) {
                Toast.makeText(hotel4.this,"su calificacion es de "+v+" estreallas",Toast.LENGTH_LONG).show();
            }
        });
        btn4=findViewById(R.id.button4);
    }
    public  void retono4(View view)throws Exception{
        String link = "https://www.booking.com/searchresults.es.html?aid=344353;label=metatrivago-hotel-1456334_xqdz-3c70692d3f8b7eb924c56b3d15297338_los-1_nrm-1_gstadt-2_gstkid-0_curr-cop_lang-es_itt-1_trvlp-b_losb-1_bw-12_bwb-8_trvbm-a_split-47340a%2C47646b_defdate-0_trvref-2990b5d4-1540-417a-b23b-7a949db6201c;sid=61f8783b9c94e00e7225ffcf542b540c;checkin=2019-12-08;checkout=2019-12-09;city=-601684;highlighted_hotels=1456334;hlrd=with_av;itt=1;keep_landing=1;redirected=1;selected_currency=COP;source=hotel;sr_show_room=145633402_170667048_2_1_0;trv_curr=COP;trv_dp=95402&utm_campaign=co&utm_content=los-1_nrm-1_gstadt-2_gstkid-0_curr-cop_lang-es_itt-1_trvlp-b_losb-1_bw-12_bwb-8_trvbm-a_split-47340a%2C47646b_defdate-0_trvref-2990b5d4-1540-417a-b23b-7a949db6201c&utm_medium=meta&utm_source=metatrivago&utm_term=hotel-1456334&";
        Intent intent = null;
        intent = new Intent(intent.ACTION_VIEW, Uri.parse(link));
        Toast.makeText(this,"gracias por su confianza", Toast.LENGTH_SHORT).show();
        startActivity(intent);
    }
}
