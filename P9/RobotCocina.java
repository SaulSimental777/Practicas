package com.company;

import IO.ClaseIO;


public class RobotCocina extends MegatronCook implements Acciones{
    private float temperaturaACocinar;

    public RobotCocina(String nombre, String id, String ultimaAccion,int bateriaRestante ,float temperaturaACocinar) {
        super(nombre, id,ultimaAccion , bateriaRestante);
        this.temperaturaACocinar = temperaturaACocinar;
    }

    public float getTemperaturaACocinar() {
        return temperaturaACocinar;
    }

    public void setTemperaturaACocinar(float temperaturaACocinar) {
        this.temperaturaACocinar = temperaturaACocinar;
    }

    @Override
    public void servirPlatillo() {
        ClaseIO.imprimirMensaje("Platillo servido!");
    }

    @Override
    public void moverBrazos() {
        try{
            ClaseIO.imprimirMensaje("Se estan calibrando los movimientos de los brazos para el movimiento de la flama...");
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
        ClaseIO.imprimirMensaje("Error: El robot cocinador no esta programado para realizar esta accion!");
        setUltimaAccion("Preparar ingredientes (Fallido)");
    }

    @Override
    public void cocinarPlatillo() {
        try{
            ClaseIO.imprimirMensaje("Cocinando a temperatura seleccionada - " + getTemperaturaACocinar() + " grados Celsius");
            Thread.sleep(500);
        }catch (Exception e){
            e.printStackTrace();
        }

        ClaseIO.imprimirMensaje("Platillo listo para servirse!");
        setUltimaAccion("Cocinar Platillo");
    }

}
