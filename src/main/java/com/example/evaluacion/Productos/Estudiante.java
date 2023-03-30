package com.example.evaluacion.Productos;

public class Estudiante {

    private int iDcodigo;
    private String nombreEstu;
    private String apellidoEstu;
    private String[] materiasEstu;
    private float[] notasEstu;
    private String Juicio ;

    public Estudiante(int iDcodigo, String nombreEstu, String apellidoEstu, String[] materiasEstu, float[] notasEstu, String juicio) {
        this.iDcodigo = iDcodigo;
        this.nombreEstu = nombreEstu;
        this.apellidoEstu = apellidoEstu;
        this.materiasEstu = materiasEstu;
        this.notasEstu = notasEstu;
        Juicio = juicio;
    }

    //getter

    public int getiDcodigo() {
        return iDcodigo;
    }

    public String getNombreEstu() {
        return nombreEstu;
    }

    public String getApellidoEstu() {
        return apellidoEstu;
    }

    public String[] getMateriasEstu() {
        return materiasEstu;
    }

    public float[] getNotasEstu() {
        return notasEstu;
    }

    public String getJuicio() {
        return Juicio;
    }


    //setter
    public void setiDcodigo(int iDcodigo) {
        this.iDcodigo = iDcodigo;
    }

    public void setNombreEstu(String nombreEstu) {
        this.nombreEstu = nombreEstu;
    }

    public void setApellidoEstu(String apellidoEstu) {
        this.apellidoEstu = apellidoEstu;
    }

    public void setMateriasEstu(String[] materiasEstu) {
        this.materiasEstu = materiasEstu;
    }

    public void setNotasEstu(float[] notasEstu) {
        this.notasEstu = notasEstu;
    }

    public void setJuicio(String juicio) {
        Juicio = juicio;
    }
}
