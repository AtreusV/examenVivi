package com.example.evaluacion.servicio;

import com.example.evaluacion.Productos.Estudiante;

import java.util.ArrayList;

public class servicioEstudiantes {

    ArrayList<Estudiante> lista = new ArrayList<>();
    ArrayList<Estudiante> listaprueba = new ArrayList<>();


    public servicioEstudiantes() {

        lista.add(new Estudiante(1, "Arturo", "Henriquez", new String[]{"matematicas", "Español", "Ingles"}, new float[]{1.5f, 1.0f, 2.5f}, ""));
        lista.add(new Estudiante(2, "Nicolas", "Lopez", new String[]{"Deportes", "Matematicas", "Ingles"}, new float[]{3.5f, 4.0f, 5.0f}, ""));
        lista.add(new Estudiante(3, "raulinio", "ignacio", new String[]{"Ciencias", "Quimica", "Español"}, new float[]{5.0f, 4.3f, 4.0f}, ""));
        lista.add(new Estudiante(4, "ester", "mejia", new String[]{"Ciencias", "Quimica", "Español"}, new float[]{5.0f, 4.3f, 4.0f}, ""));
        lista.add(new Estudiante(5, "gustavo", "hernando", new String[]{"Ciencias", "Quimica", "Español"}, new float[]{5.0f, 4.3f, 4.0f}, ""));
    }

    public ArrayList<Estudiante> listar() {
        promedio();
        return lista;
    }

    public String agregarUsuario(Estudiante estud){
        lista.add(estud);
        return "registro exitoso";
    }

    public String promedio() {
        float promedio = 0;

        for (int i = 0; i < lista.size(); i++) {
            promedio = (lista.get(i).getNotasEstu()[0] + lista.get(i).getNotasEstu()[1] + lista.get(i).getNotasEstu()[2])/3;
            if (promedio >= 3.0) {
                lista.get(i).setJuicio("Aprobado");
                lista.set(i, lista.get(i));
            } else {
                lista.get(i).setJuicio("Desaprobado");
            }
        }
        return "listaprueba";
    }
}












































































    /*public ArrayList<Estudiante> eliminarEstudiante(){

        for (int i = 0; i < lista.size(); i++) {
            if(lista.get(i).getJuicio().equals("Desaprobado")){
                lista.remove(lista.get(i));
            }
        }

        return lista;
    }


    public String ModificarEs(Estudiante E){

        boolean resp = false;

        for (Estudiante Es : lista){

            if (Es.getCodigo() == E.getCodigo()){

                Es.setNotas(E.getNotas());

                resp = true;
            }
        }

        String respuesta = "";

        if(resp == true){
            respuesta = "Se han actualizado los datos";

        }else{
            respuesta = "No se han actualizado los datos";
        }

        return respuesta;
    }
     */

