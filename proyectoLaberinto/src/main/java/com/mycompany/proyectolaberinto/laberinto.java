package com.mycompany.proyectolaberinto;

import java.util.Random;

public class laberinto {
 private pila registro;
 private int filas;
 private int columnas;
 private int filaInicio;
 private int columnaInicio;
 private int filaFinal;
 private int columnaFinal;
 private celda laberinto[][];
 private Random rand = new Random();
 private int[] direcciones = {0, 1, 2, 3}; 

 public laberinto(int filas, int columnas, int filaInicio, int columnaInicio, int filaFinal, int columnaFinal) {
        this.filas = filas;
        this.columnas = columnas;
        this.filaInicio = filaInicio;
        this.columnaInicio = columnaInicio;
        this.filaFinal = filaFinal;
        this.columnaFinal = columnaFinal;
        this.registro = new pila();
        this.laberinto = new celda[filas][columnas];
 }
 
 public void colocarParedes(){
  for(int columnas = 0; columnas < this.columnas;columnas++)
   for(int filas = 0; filas < this.filas; filas++)
    laberinto[filas][columnas] = new celda(columnas, filas);
 }
 
 public void generarLaberinto(){
  if (filaInicio > filas-1 || columnaInicio > columnas-1){
   System.out.println("Valor fuera de Rango");   
   System.exit(0);}
  
  if (filaInicio < 0 || columnaInicio < 0){
   System.out.println("Valor fuera de Rango");  
   System.exit(0);}
  colocarParedes();
  
  retrocesoRecursivo(filaInicio, columnaInicio);
 }
 
 public void mostrar(){
  String dibujo = "";
  for(int filas = 0; filas < this.filas; filas++){
   for(int columnas = 0; columnas < this.columnas;columnas++){
    if (laberinto[filas][columnas].isPared() == true) 
     dibujo += "0";
    else dibujo += " ";
   }
  dibujo += "\n";
  }
     System.out.println(dibujo);
 }
 
 public void retrocesoRecursivo(int filaActual, int columnaActual) {
    laberinto[filaActual][columnaActual].marcarVisitada();
    laberinto[filaActual][columnaActual].camino();
    registro.push(laberinto[filaActual][columnaActual]);
    
    for (int i = direcciones.length - 1; i > 0; i--) {
        int j = rand.nextInt(i + 1);
        int temp = direcciones[i];
        direcciones[i] = direcciones[j];
        direcciones[j] = temp;
    }

    for (int seleccion : direcciones) {
        int nuevaFila = filaActual;
        int nuevaColumna = columnaActual;
        int paredFila = filaActual;
        int paredColumna = columnaActual;

        switch (seleccion) {
            case 0 -> { 
                nuevaFila = filaActual - 2;
                paredFila = filaActual - 1;
            }
            case 1 -> { 
                nuevaColumna = columnaActual + 2;
                paredColumna = columnaActual + 1;
            }
            case 2 -> { 
                nuevaFila = filaActual + 2;
                paredFila = filaActual + 1;
            }
            case 3 -> {
                nuevaColumna = columnaActual - 2;
                paredColumna = columnaActual - 1;
            }
        }

        if (nuevaFila >= 0 && nuevaFila < filas &&
            nuevaColumna >= 0 && nuevaColumna < columnas &&
            !laberinto[nuevaFila][nuevaColumna].isVisitada()) {

            laberinto[paredFila][paredColumna].camino();
            laberinto[paredFila][paredColumna].marcarVisitada();

            retrocesoRecursivo(nuevaFila, nuevaColumna);
        }  
    } 
    if (!registro.estaVacia()) registro.pop(); 
 }

 public void retrocesoRecursivo2(){
  celda cima = (celda) registro.pop();
  int fila = cima.getFila();
  int columna = cima.getColumna();
  
  
 
 } 
 
 
}
