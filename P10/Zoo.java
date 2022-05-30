package com.company;

import IO.ClaseIO;
import IO.Tablas;

import java.util.ArrayList;

public class Zoo {
    private ArrayList<Animal> animales;
    private Veterinario veterinario;

    public Zoo(Veterinario veterinario){
        animales =  new ArrayList<Animal>();
        setVeterinario(veterinario);
    }
    public void setAnimales(ArrayList<Animal> animales){
        this.animales = animales;
    }

    public ArrayList<Animal> getAnimales(){
        return animales;
    }

    public void setVeterinario(Veterinario veterinario) {
        this.veterinario = veterinario;
    }

    public Veterinario getVeterinario() {
        return veterinario;
    }

    public void agregarAnimal(Animal animal){
        animales.add(animal);
    }

    public void eliminarAnimal(Animal animal){
        animales.remove(animal);
    }

    public void imprimirAnimales(){

        String [][] datos = new String[animales.size()][];

        for(int i = 0; i < animales.size(); i++){
            datos[i] = animales.get(i).generarDatosAnimal();
        }

        String [][] tabla = new String[animales.size() + 1][];

        tabla[0] = new String[]{"Nombre", "Edad", "Tipo de alimento", "Receta medica brindada", "Esta vacunado", "Fue sedado"};

        for(int i = 0; i < datos.length; i++){
            if( i == 0)
                tabla[1] = datos[i];
            else
                tabla[i + 1] = datos[i];
        }

        Tablas.tablaSimple(tabla, true);
    }

    public void imprimirVeterinario(){
        ClaseIO.imprimirMensaje("\t\tInformacion del veterinario \n\n" + getVeterinario().getNombre());
        ClaseIO.imprimirMensaje("Animales que cuida: " + getAnimales().size());
        ClaseIO.imprimirMensaje("Salario: " + getVeterinario().getSalario());
        ClaseIO.imprimirMensaje("*****************************************************");
    }
}
