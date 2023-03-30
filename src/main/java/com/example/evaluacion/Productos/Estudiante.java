package com.example.evaluacion.Productos;

public class Estudiante {

    private int codigo;
    private String Nombre;
    private String Apellido;
    private String[] Materias;
    private float[] Notas;
    private String Juicio;

    public Estudiante(int codigo, String nombre, String apellido, String[] materias, float[] notas, String juicio) {
        this.codigo = codigo;
        Nombre = nombre;
        Apellido = apellido;
        Materias = materias;
        Notas = notas;
        Juicio = juicio;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String apellido) {
        Apellido = apellido;
    }

    public String[] getMaterias() {
        return Materias;
    }

    public void setMaterias(String[] materias) {
        Materias = materias;
    }

    public float[] getNotas() {
        return Notas;
    }

    public void setNotas(float[] notas) {
        Notas = notas;
    }

    public String getJuicio() {
        return Juicio;
    }

    public void setJuicio(String juicio) {
        Juicio = juicio;
    }
}