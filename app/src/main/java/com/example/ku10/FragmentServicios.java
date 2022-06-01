package com.example.ku10;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link FragmentServicios#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FragmentServicios extends Fragment {
    private Button mbtnAñadir;
    private ListView mListView;
    private EditText mEditText;

    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_servicios);
        mbtnAñadir = mbtnAñadir.findViewById(R.id.btnAgregar);
        mListView = mListView.findViewById(R.id.listView);
        mEditText = mEditText.findViewById(R.id.etlista);



    }

    private void setContentView(int fragment_servicios) {
    }
}