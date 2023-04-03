package com.example.proyecto2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.RatingBar;
import android.widget.Toast;

import com.example.proyecto2.paginas.frapagina1;
import com.example.proyecto2.paginas.frapagina2;
import com.example.proyecto2.paginas.frapagina3;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private ViewPager paginas;
    private PagerAdapter Adaptadas;
    ImageButton h1,h2,h3,h4,h5,h6,h7,h8,h9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        List<Fragment> list = new ArrayList<>();
        list.add(new frapagina1());
        list.add(new frapagina2());
        list.add(new frapagina3());

        paginas=findViewById(R.id.pagina);
        Adaptadas= new sliderpaginas(getSupportFragmentManager(),list);

        paginas.setAdapter(Adaptadas);

        asignar();
    }

    private void asignar() {
        h1=findViewById(R.id.imageButton);
        h2=findViewById(R.id.imageButton5);
        h3=findViewById(R.id.imageButton7);
        h4=findViewById(R.id.imageButton3);
        h5=findViewById(R.id.imageButton9);
        h6=findViewById(R.id.imageButton11);
        h7=findViewById(R.id.imageButton14);
        h8=findViewById(R.id.imageButton16);
        h9=findViewById(R.id.imageButton18);
    }
    public void hotel1(View view){
        Intent I =new Intent(this,hotel1.class);
        startActivity(I);
    }
    public void hotel2(View view){
        Intent e =new Intent(this,hotel2.class);
        startActivity(e);
    }
    public void hotel3(View view){
        Intent o =new Intent(this,hotel3.class);
        startActivity(o);
    }
    public void hotel4(View view){
        Intent u =new Intent(this,hotel4.class);
        startActivity(u);
    }
    public void hotel5(View view){
        Intent y =new Intent(this,hotel5.class);
        startActivity(y);
    }
    public void hotel6(View view){
        Intent t =new Intent(this,hotel6.class);
        startActivity(t);
    }
    public void hotel7(View view){
        Intent r =new Intent(this,hotel7.class);
        startActivity(r);
    }
    public void hotel8(View view){
        Intent w=new Intent(this,hotel8.class);
        startActivity(w);
    }
    public void hotel9(View view){
        Intent q=new Intent(this,hotel9.class);
        startActivity(q);
    }


}
