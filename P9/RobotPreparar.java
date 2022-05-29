package com.company;

import IO.ClaseIO;


public class RobotPreparar extends MegatronCook implements Acciones{

    public RobotPreparar(String nombre, String id, String ultimaAccion,int bateriaRestante) {
        super(nombre,  id, ultimaAccion,bateriaRestante);
    }

    @Override
    public void servirPlatillo() {
        ClaseIO.imprimirMensaje("Platillo servido!");
    }

    @Override
    public void moverBrazos() {
        try{
            ClaseIO.imprimirMensaje("Se estan calibrando los movimientos de los brazos para el corte de ingredientes...");
            Thread.sleep(500);
        }catch (Exception e){
            e.printStackTrace();
        }
        ClaseIO.imprimirMensaje("Calibracion completa, listo para trabajar!");
        setUltimaAccion("Calibracion Brazos");
    }

    @Override
    public void enceder() {
        try{
            ClaseIO.imprimirMensaje("Encendiendo...");
            Thread.sleep(500);
        }catch (Exception e){
            e.printStackTrace();
        }
        ClaseIO.imprimirMensaje("Rutinas cargadas correctamente!");
        setUltimaAccion("Encendido");
    }

    public void prepararIngredientes(){
        try{
            ClaseIO.imprimirMensaje("Cortando ingredientes (Carnes, verduras) - Espere un momento por favor");
            Thread.sleep(500);
        }catch (Exception e){
            e.printStackTrace();
        }

        ClaseIO.imprimirMensaje("Platillo listo para ser cocinado!");
        setUltimaAccion("Preparacion de ingredientes");
    }

    @Override
    public void cocinarPlatillo() {
        ClaseIO.imprimirMensaje("Error: El robot preparador no esta programado para realizar esta accion!");
        setUltimaAccion("Cocinar Platillo (Fallido)");
    }

}
