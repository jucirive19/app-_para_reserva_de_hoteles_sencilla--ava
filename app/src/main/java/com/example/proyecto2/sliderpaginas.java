package com.example.proyecto2;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import java.util.List;

public class sliderpaginas extends FragmentStatePagerAdapter {
    private List<Fragment> Listapaginas;

    public sliderpaginas(FragmentManager fm, List<Fragment> Listapaginas) {
        super(fm);
        this.Listapaginas=Listapaginas;
    }

    @Override
    public Fragment getItem(int position) {
        return Listapaginas.get(position);
    }

    @Override
    public int getCount() {
        return Listapaginas.size();
    }
}
