package com.mycompany.proyectolaberinto;
public class ProyectoLaberinto {

 public static void main(String[] args) {
  laberinto lab = new laberinto(10, 10, 2, 3, 0, 0);
  lab.generarLaberinto();
  lab.mostrar();
 }
}
