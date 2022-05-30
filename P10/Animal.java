package com.company;

import IO.ClaseIO;

import java.util.Objects;

public class Animal {
    private String nombre;
    private String tipoAlimento;
    private String recetar;
    private int edad;
    private boolean estaVacunado;
    private boolean estaSedado;

    public Animal(String nombre, int edad, boolean estaVacunado, String tipoAlimento) {
        this.nombre = nombre;
        this.edad = edad;
        this.estaVacunado = estaVacunado;
        this.tipoAlimento = tipoAlimento;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setEdad(int edad) {

        this.edad = edad;
    }

    public int getEdad() {

        return edad;
    }

    public void setTipoAlimento(String tipoAlimento) {

        this.tipoAlimento = tipoAlimento;
    }

    public String getTipoAlimento() {

        return tipoAlimento;
    }


    public boolean estaVacunado() {

        return estaVacunado;
    }

    public void aplicarvacuna(boolean estaVacunado) {
        this.estaVacunado = estaVacunado;
    }

    public boolean estaSedado(){
        return estaSedado;
    }

    public void aplicarSedante(boolean sedante){
        estaSedado = sedante;
    }

    public void setRecetar(String receta){
        recetar = receta;
    }

    public String getRecetar(){
        return Objects.requireNonNullElse(recetar, "No se ha recetado nada");
    }

    public void caminar(){
        ClaseIO.imprimirMensaje(getNombre() + " esta caminando...");
    }

    public String[] generarDatosAnimal(){
        return new String[]{
                getNombre(),
                String.valueOf(getEdad()),
                getTipoAlimento(),
                getRecetar(),
                String.valueOf(estaVacunado()),
                String.valueOf(estaSedado())
        };
    }

}

class Gato extends Animal {

    public Gato(String nombre, int edad, boolean estaVacunado, String tipoAlimento) {
        super(nombre, edad, estaVacunado, tipoAlimento);
    }

    public void maullar(){
        ClaseIO.imprimirMensaje("Miau Miau");
    }
}

class Perro extends Animal {

    public Perro(String nombre, int edad, boolean estaVacunado, String tipoAlimento) {
        super(nombre, edad, estaVacunado, tipoAlimento);
    }

    public void ladrar(){
        ClaseIO.imprimirMensaje("Woof woof");
    }
}

class Leon extends Animal {

    public Leon(String nombre, int edad, boolean estaVacunado, String tipoAlimento) {
        super(nombre, edad, estaVacunado, tipoAlimento);
    }

    public void rugir(){
        ClaseIO.imprimirMensaje("Roaaaaar");
    }
}
