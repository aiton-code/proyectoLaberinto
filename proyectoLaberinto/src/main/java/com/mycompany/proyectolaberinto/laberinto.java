package com.mycompany.proyectolaberinto;


public class laberinto {
 private pila generador;
 private int filas;
 private int columnas;
 private int filaInicio;
 private int columnaInicio;
 private int filaFinal;
 private int columnaFinal;
 private celda laberinto[][];

 public laberinto(int filas, int columnas, int filaInicio, int columnaInicio, int filaFinal, int columnaFinal) {
        this.filas = filas;
        this.columnas = columnas;
        this.filaInicio = filaInicio;
        this.columnaInicio = columnaInicio;
        this.filaFinal = filaFinal;
        this.columnaFinal = columnaFinal;
        this.generador = new pila();
        this.laberinto = new celda[filas][columnas];
 }
 
 public void colocarParedes(){
  for(int columnas = 0; columnas < this.columnas;columnas++)
   for(int filas = 0; filas < this.filas; filas++)
    laberinto[filas][columnas] = new celda(columnas, filas);
 }
 
 public void generarLaberinto(){
  if (filaInicio > filas-1 || columnaInicio > columnas-1){return;}
  colocarParedes();
  generador.push(laberinto[filaInicio][columnaInicio]);
  laberinto[filaInicio][columnaInicio].camino();
 
 }
 
 public void mostrar(){
  String dibujo = "";
  for(int filas = 0; filas < this.filas; filas++){
   for(int columnas = 0; columnas < this.columnas;columnas++){
    if (laberinto[filas][columnas].isPared() == true) 
     dibujo += "#";
    else dibujo += " ";
   }
  dibujo += "\n";
  }
     System.out.println(dibujo);
 }
 

 
 
 
}
