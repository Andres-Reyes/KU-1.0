package com.example.ku10;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.Toast;

import com.example.ku10.databinding.FragmentServiciosBinding;
import com.example.ku10.databinding.ListaServiciosBinding;

import java.util.ArrayList;

import Adaptadores.AdapterServicio;
import Entidades.Servicio;

public class FragmentServicios extends Fragment {

    AdapterServicio adapterServicio;
    RecyclerView recyclerView;
    ArrayList <Servicio> listaServicios;
    FragmentTransaction transaction;
    Fragment fragmentServicios, fragmentDetalleServicio;

    @Nullable
    @Override

    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.fragment_servicios, container, false);
        recyclerView = view.findViewById(R.id.recyclerView);
        listaServicios = new ArrayList<>();
        cargarLista();
        mostrarData();
        return view;
    }

    public void cargarLista(){
        listaServicios.add(new Servicio("Auxiliar de Mantenimiento área electrónica","Importante empresa del sector - Bogotá, D.C.","Empresa de producción líder del sector requiere TECNICO O TECNOLOGO en Electricidad industrial, Automatización...", "Hace 1 hora", R.drawable.schedule));
        listaServicios.add(new Servicio("Punzonador","ASERTEMPO COLOMBIA S.A - Medellín, Antioquia","Empresa de producción líder del sector requiere TECNICO O TECNOLOGO en Electricidad industrial, Automatización...", "Hace 5 minutos", R.drawable.acquisition));
        listaServicios.add(new Servicio("Tecnico de mantenimiento","Casalimpia s.a. - Barrancabermeja, Santander","Empresa de producción líder del sector requiere TECNICO O TECNOLOGO en Electricidad industrial, Automatización...", "Hace 25 minutos", R.drawable.magistrate));
        listaServicios.add(new Servicio("Técnico de sistemas de seguridad electrónica Alarmas","Automotores Llano Grande S.A. - Yopal, Casanare","Empresa de producción líder del sector requiere TECNICO O TECNOLOGO en Electricidad industrial, Automatización...", "Hace 12 horas", R.drawable.image));
        listaServicios.add(new Servicio("Coordinador de Calidad Automotriz","Importante empresa del sector Casanare, Yopal","Empresa de producción líder del sector requiere TECNICO O TECNOLOGO en Electricidad industrial, Automatización...", "Hace 19 minutos", R.drawable.loading));
        listaServicios.add(new Servicio("Mecánico instalación de espárragos","ASERTEMPO COLOMBIA S.A - Medellín, Antioquia","Empresa de producción líder del sector requiere TECNICO O TECNOLOGO en Electricidad industrial, Automatización...", "Hace 5 horas", R.drawable.schedule));
        listaServicios.add(new Servicio("Oficial electrico","Importante empresa del sector Casanare, Yopal","Empresa de producción líder del sector requiere TECNICO O TECNOLOGO en Electricidad industrial, Automatización...", "Hace 18 minutos", R.drawable.magistrate));
        listaServicios.add(new Servicio("Técnico en Identificación de Automotores","Importante empresa del sector - Bogotá, D.C.","Empresa de producción líder del sector requiere TECNICO O TECNOLOGO en Electricidad industrial, Automatización...", "Hace 1 minuto", R.drawable.image));
        listaServicios.add(new Servicio("Técnico mecánico automotriz","Casalimpia s.a. - Barrancabermeja, Santander","Empresa de producción líder del sector requiere TECNICO O TECNOLOGO en Electricidad industrial, Automatización...", "Hace 12 horas", R.drawable.pay));
        listaServicios.add(new Servicio("Auxiliar eléctrico","Automotores Llano Grande S.A. - Yopal, Casanare","Empresa de producción líder del sector requiere TECNICO O TECNOLOGO en Electricidad industrial, Automatización...", "Hace 9 minutos", R.drawable.loading));
    }

    public void mostrarData(){
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        adapterServicio = new AdapterServicio(getContext(), listaServicios);
        recyclerView.setAdapter(adapterServicio);
    }

}