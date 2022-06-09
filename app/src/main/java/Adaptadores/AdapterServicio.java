package Adaptadores;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.ku10.R;

import java.util.ArrayList;

import Entidades.Servicio;

public class AdapterServicio extends RecyclerView.Adapter<AdapterServicio.ViewHolder> implements View.OnClickListener {

    LayoutInflater inflater;
    ArrayList<Servicio> model;

    private View.OnClickListener listener;

    public AdapterServicio(Context context, ArrayList<Servicio> model){
        this.inflater = LayoutInflater.from(context);
        this.model = model;
    }

    @NonNull
    @Override
    public AdapterServicio.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.lista_servicios, parent, false);
        view.setOnClickListener(this);
        return new ViewHolder(view);
    }

    public void setOnClickListener(View.OnClickListener listener) {
        this.listener = listener;
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterServicio.ViewHolder holder, int position) {
        String nombre = model.get(position).getNombre();
        String subtitulo = model.get(position).getSubtitulo();
        String detallar = model.get(position).getDetallar();
        String ver = model.get(position).getVer();
        int imagen = model.get(position).getImagenid();
        holder.nombres.setText(nombre);
        holder.subtitulos.setText(subtitulo);
        holder.detallar.setText(detallar);
        holder.ver.setText(ver);
        holder.imagen.setImageResource(imagen);
    }

    @Override
    public int getItemCount() {
        return model.size();
    }

    @Override
    public void onClick(View v) {
        if(listener!=null){
            listener.onClick(v);
        }
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        TextView nombres, subtitulos, detallar, ver;
        ImageView imagen;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            nombres = itemView.findViewById(R.id.nombre_servicio);
            subtitulos = itemView.findViewById(R.id.descripcion_empresa);
            detallar = itemView.findViewById(R.id.descripcion_servicio);
            ver = itemView.findViewById(R.id.descripcion_hora);
            imagen = itemView.findViewById(R.id.imagen_servicio);
        }
    }

}
