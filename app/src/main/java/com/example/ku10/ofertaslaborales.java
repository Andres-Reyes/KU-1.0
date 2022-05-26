package com.example.ku10;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;


public class ofertaslaborales extends Fragment implements View.OnClickListener {

    public void PlaceholderFragment() {
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_laboral, container, false);

        Button btn = (Button) rootView.findViewById(R.id.button1);
        btn.setOnClickListener(this);

        return rootView;
    }


    @Override
    public void onClick(View v) {
        Intent intent = new Intent (v.getContext(), ofertaslaborales.class);
        startActivityForResult(intent, 0);
        switch (v.getId()) {

            case R.id.button1:
                Toast.makeText(getActivity(), "Button clicked", Toast.LENGTH_LONG).show();

        }

    }
}