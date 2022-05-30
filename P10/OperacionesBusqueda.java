package com.company;

import java.util.ArrayList;

public abstract class OperacionesBusqueda {

    public static int buscarAnimal(ArrayList<Animal> animales, String nombre){
        int encontrado = -1;

        for(int i = 0; i < animales.size(); i++){
            if( animales.get(i).getNombre().equals(nombre)){
                encontrado = i;
            }
        }
        return encontrado;
    }
}
