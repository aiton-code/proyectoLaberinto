package com.mycompany.proyectolaberinto;

public class celda {
 private int columna;
 private int fila;
 private int costo;
 private boolean visitada;
 private boolean pared;

 public celda(int columna, int fila) {
  this.columna = columna;
  this.fila = fila;
  this.pared = true;
  this.visitada = false;
}
 
 public void visitar(){
  this.visitada = true;
 }
 
 public void camino(){
  this.pared = true;
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

    public boolean isVisitada() {
        return visitada;
    }

    public boolean isPared() {
        return pared;
    }
 
 
}
