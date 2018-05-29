package com.ittepic.tdmm_proyecto15_ivanleobardoestradasalinas;


public class DataProvider {
    // 1.1. Definir campos de clase para los elementos del CardView
    private String Nombre;
    private String Descripcion;
    private String Boton;
    private int image;

    // 1.2. Generar el constructor

    public DataProvider(String nombre, String descripcion, String boton, int image) {
        this.Nombre = nombre;
        this.Descripcion = descripcion;
        this.Boton = boton;
        this.image = image;
    }

    // 1.3. Generar los métodos getter.


    public String getTitle() {
        return Nombre;
    }

    public String getShortdesc() {
        return Descripcion;
    }

    public String getRating() {
        return Boton;
    }

    public int getImage() {
        return image;
    }
}
