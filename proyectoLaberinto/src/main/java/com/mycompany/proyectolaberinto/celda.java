package com.mycompany.proyectolaberinto;

public class celda {
 private int columna;
 private int fila;
 private int costo;
 private boolean pared;

 public celda(int columna, int fila) {
  this.columna = columna;
  this.fila = fila;
  this.pared = true;
}
 
 public void camino(){
  this.pared = false;
 }

    public int getColumna() {
        return columna;
    }

    public int getFila() {
        return fila;
    }

    public int getCosto() {
        return costo;
    }

    public boolean isPared() {
        return pared;
    }
 
 
}
