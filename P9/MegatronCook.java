package com.company;


public abstract class MegatronCook implements Movimiento{
    private String nombre;
    private String id;
    private String ultimaAccion;
    private int bateriaRestante;

    public abstract void servirPlatillo();

    public MegatronCook(String nombre,  String id, String ultimaAccion,int bateriaRestante) {
        this.nombre = nombre;
        this.bateriaRestante = bateriaRestante;
        this.id = id;
        this.ultimaAccion = ultimaAccion;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }

    public void setId(String id) {
        this.id = id;
    }
    public String getId() {
        return id;
    }

    public void setBateriaRestante(int bateriaRestante) {
        this.bateriaRestante = bateriaRestante;
    }

    public int getBateriaRestante() {
        return bateriaRestante;
    }

    public void setUltimaAccion(String ultimaAccion) {
        this.ultimaAccion = ultimaAccion;
    }

    public String getUltimaAccion() {
        return ultimaAccion;
    }


}
