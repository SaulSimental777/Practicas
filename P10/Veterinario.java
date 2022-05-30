package com.company;

import IO.ClaseIO;

public class Veterinario {
    private String nombre;
    private double salario;

    public Veterinario(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
    }

    public void aplicarVacuna(Animal animal){
        animal.aplicarvacuna(true);
        ClaseIO.imprimirMensaje(animal.getNombre() + " ha sido vacunado");
    }

    public void imprimirDiagnosticoAnimal(Animal animal){
        ClaseIO.imprimirMensaje("Diagnostico PARA " + animal.getNombre());
        ClaseIO.imprimirMensaje("\tEsta vacunado? " + animal.estaVacunado());
        ClaseIO.imprimirMensaje("\tUltima Receta: " +  animal.getRecetar());
        ClaseIO.imprimirMensaje("\tFue sedado? " + animal.estaSedado());
    }

    public void aplicarSedante(Animal animal){
        animal.aplicarSedante(true);
        ClaseIO.imprimirMensaje("Sedante aplicado a " + animal.getNombre());
    }

    public void recetarMedicamento(Animal animal){
        if( animal instanceof Perro){
            animal.setRecetar("Nexgard Spectra (Antipulgas)");
        }

        if( animal instanceof Gato){
            animal.setRecetar("Cefovecina sódica (Prevencion de fiebre)");
        }

        if( animal instanceof Leon){
            animal.setRecetar("Ketamina (Anestesico)");
        }

        ClaseIO.imprimirMensaje("Receta aplicada, para visualizar imprimir el diagnostico Animal!");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}