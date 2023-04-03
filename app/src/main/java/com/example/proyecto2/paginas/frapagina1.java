package com.example.proyecto2.paginas;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RatingBar;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.proyecto2.MainActivity;
import com.example.proyecto2.R;

public class frapagina1 extends Fragment {
    RatingBar est1;
    @Nullable
    @Override

    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {

        ViewGroup paquete = (ViewGroup) inflater.
                inflate(R.layout.pagina1, container
                        , false);

        return paquete;

    }


}
