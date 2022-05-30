package com.company;

import IO.ClaseIO;

import java.io.*;
import java.util.Random;

public class Main {
    public static void main(String [] args){
        Random random = new Random();

        String[] calificacionesArchivo;
        Alumno[] alumnos = new Alumno[3];

        for(int i =0; i < alumnos.length; i++){
            alumnos[i] = new Alumno(
                    ClaseIO.capturaCadena("Nombre del alumno [" + (i+1) + "]"),
                    ClaseIO.capturaCadena("Matricula"),
                    7
            );
        }

        // Copiar el path from content root para utilizar el archivo csv

        calificacionesArchivo=extraerDatos("src/com/company/practica11.csv",',');

        for (Alumno value : alumnos) {
            float[] calificaciones = new float[7];
            for (int j = 0; j < calificaciones.length; j++) {
                try {
                    calificaciones[j] = Float.parseFloat(
                            calificacionesArchivo[random.nextInt(calificacionesArchivo.length)]
                    );
                } catch (NumberFormatException e) {
                    ClaseIO.imprimirMensaje("Error: Formateo de valor no valido");
                } catch (ArrayIndexOutOfBoundsException ex) {
                    ClaseIO.imprimirMensaje("Error: Indice fuera de rango");
                    ex.printStackTrace();
                }
            }

            value.setCalificaciones(calificaciones);
        }

        for(Alumno alumno : alumnos){
            alumno.mostrarAlumno();
            ClaseIO.pausa();
            ClaseIO.imprimirMensaje("\n");
        }

        guardardatos("alumnos", alumnos);
    }

    private static String[] extraerDatos(String documento, char separador){

        FileInputStream fileInputStream = null;
        int nBytes;
        byte[] buffer = new byte[81];
        String texto = "";
        String[] calificacionesArchivo;

        try{
            fileInputStream = new FileInputStream(documento);
            nBytes = fileInputStream.read(buffer, 0, 81);
            texto = new String(buffer, 0, nBytes);
        }catch (FileNotFoundException e) {
            ClaseIO.imprimirMensaje("Error: Documento no encontrado");
        }catch (IOException ex){
            ClaseIO.imprimirMensaje("Error: Error al obtener archivo");
        }finally {
            if(fileInputStream != null) {
                try {
                    fileInputStream.close();
                } catch (IOException e) {
                    ClaseIO.imprimirMensaje("Error: documento no se pudo cerrar correctamente");
                }
            }
        }

        calificacionesArchivo = texto.split(String.valueOf(separador));

        return calificacionesArchivo;
    }

    private static void guardardatos(String nombreSalida, Object[] objetoAGuardar){
        FileOutputStream archivoSalida = null;

        try{
            archivoSalida = new FileOutputStream(nombreSalida + ".txt");
            for(Object objeto: objetoAGuardar){
                if( objeto instanceof Alumno)
                    archivoSalida.write(((Alumno) objeto).guardarAlumno());
            }
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            if(archivoSalida != null) {
                try {
                    archivoSalida.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                ClaseIO.imprimirMensaje("Archivo de datos generado");
            }
        }
    }
}