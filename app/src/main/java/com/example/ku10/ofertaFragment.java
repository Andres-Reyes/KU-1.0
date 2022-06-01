package com.example.ku10;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class ofertaFragment extends Fragment {

View vista;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        vista = inflater.inflate(R.layout.fragment_oferta, container, false);

        Button btn = vista.findViewById(R.id.button1);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                FragmentTransaction ft = getParentFragmentManager().beginTransaction();

                ft.replace(R.id.nav_host_fragment_content_main, new fragment_infolaboral(), null);
                ft.addToBackStack(ofertaFragment.class.getName());
                ft.commit();

            }
        });

        return vista;
    }
}