package Entidades;

import java.io.Serializable;

public class Servicio{

    private String nombre;
    private String subtitulo;
    private String detallar;
    private String ver;
    private int imagenid;

    public Servicio(){

    }

    public Servicio(String nombre, String subtitulo, String detallar, String ver, int imagenid) {
        this.nombre = nombre;
        this.subtitulo = subtitulo;
        this.detallar = detallar;
        this.ver = ver;
        this.imagenid = imagenid;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSubtitulo() {
        return subtitulo;
    }

    public void setSubtitulo(String subtitulo) {
        this.subtitulo = subtitulo;
    }

    public String getDetallar() {
        return detallar;
    }

    public void setDetallar(String detallar) {
        this.detallar = detallar;
    }

    public String getVer() { return ver; }

    public void setVer(String ver) { this.ver = ver; }

    public int getImagenid() {
        return imagenid;
    }

    public void setImagenid(int imagenid) {
        this.imagenid = imagenid;
    }
}
