package com.company;

import IO.ClaseIO;

import java.util.Arrays;

public class Alumno{
    private String nombre;
    private String matricula;
    private float[] calificaciones;
    private float promedioGeneral;

    public Alumno(String nombre, String matricula, int numCalificaciones){
        this.nombre = nombre;
        this.matricula = matricula;
        calificaciones = new float[numCalificaciones];
        promedioGeneral = (float) 0.0;
    }

    public String getNombre() {
        return nombre;
    }

    public String getMatricula() {
        return matricula;
    }

    public float getPromedioGeneral() {
        return promedioGeneral;
    }

    public void setCalificaciones(float[] calificaciones) {
        this.calificaciones = calificaciones;

        for(int i = 0; i < calificaciones.length; i++){
            promedioGeneral += calificaciones[i];
        }

        promedioGeneral = promedioGeneral / calificaciones.length;
    }

    public void mostrarAlumno(){
        ClaseIO.imprimirMensaje("Nombre de alumno: " + getNombre());
        ClaseIO.imprimirMensaje("Matricula: " + getMatricula());
        ClaseIO.imprimirMensaje("Calificaciones: ");
        imprimirCalificaciones();
        ClaseIO.imprimirMensaje("\nPromedio: " + getPromedioGeneral());
    }

    private void imprimirCalificaciones(){
        int numberRows = 0;
        for(int i = 0; i < calificaciones.length; i++){
            numberRows += 1;
            ClaseIO.imprimirMensajeSinSalto("Cal No." + (i+1) + ": << " + calificaciones[i] + ">>  ");
            if(numberRows == 3) {
                ClaseIO.imprimirMensaje("\n");
                numberRows = 0;
            }
        }
    }

    @Override
    public String toString() {
        return "" +
                "nombre='" + nombre + '\'' +
                ", matricula='" + matricula + '\'' +
                ", calificaciones=" + Arrays.toString(calificaciones) +
                ", promedioGeneral=" + promedioGeneral +'\n';
    }

    public byte[] guardarAlumno(){
        return this.toString().getBytes();
    }
}
