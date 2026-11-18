package com.mycompany.proyectolaberinto;

public class Nodo {
 private Object dato;
 private Nodo referencia;

 public Nodo(Object dato) {
  this.dato = dato;
  this.referencia = null;
 }
 
 public void conectar(Nodo siguiente){
  referencia = siguiente; 
 }
 
 public void desconectar(){
  referencia = null; 
 }
 
 public Object extraer (){
  return dato;
 }
 
 public Nodo obtenerReferencia (){
  return referencia;
 }
 
 @Override
 public String toString(){
  return "nodo con dato: " + dato + ", conectado a " + referencia;
 }
}
