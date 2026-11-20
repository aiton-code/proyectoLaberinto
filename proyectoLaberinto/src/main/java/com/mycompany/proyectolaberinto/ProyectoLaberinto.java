package com.mycompany.proyectolaberinto;
public class ProyectoLaberinto {

 public static void main(String[] args) {
  laberinto lab = new laberinto(20, 20, 1, 1, 0, 0);
  lab.generarLaberinto();
  lab.mostrar();
 }
}
